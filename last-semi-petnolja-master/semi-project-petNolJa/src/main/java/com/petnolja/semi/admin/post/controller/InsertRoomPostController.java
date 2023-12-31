package com.petnolja.semi.admin.post.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.petnolja.semi.admin.common.dto.AdminPictureDTO;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.admin.post.model.service.InsertRoomPostService;
import com.petnolja.semi.common.mybatis.Template;

import net.coobird.thumbnailator.Thumbnails;

@WebServlet("/insertRoomPost")
public class InsertRoomPostController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private InsertRoomPostService insertRoomPostService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		insertRoomPostService = new InsertRoomPostService();
		if (ServletFileUpload.isMultipartContent(request)) {

			if (ServletFileUpload.isMultipartContent(request)) {

				String rootLocation = getServletContext().getRealPath("/");
				int maxFileSize = 1024 * 1024 * 10;
				String encodingType = "UTF-8";

				System.out.println("파일 저장 ROOT 경로 : " + rootLocation);
				System.out.println("최대 업로드 파일 용량 : " + maxFileSize);
				System.out.println("인코딩 방식 : " + encodingType);

				String fileUploadDirectory = rootLocation + "resources/upload/origin/";
				String thumbnailDirectory = rootLocation + "resources/upload/thumbnail/";

				File directory = new File(fileUploadDirectory);
				File directory2 = new File(thumbnailDirectory);

				/* 파일 저장경로가 존재하지 않는 경우 디렉토리를 생성한다. */
				if (!directory.exists() || !directory2.exists()) {
					/* 폴더를 한 개만 생성할거면 mkdir, 상위 폴더도 존재하지 않으면 한 번에 생성하란 의미로 mkdirs를 이용한다. */
					System.out.println("폴더 생성 : " + directory.mkdirs());
					System.out.println("폴더 생성 : " + directory2.mkdirs());
				}

				/*
				 * 이게 최종적으로 request를 parsing하고 파일을 저장한 뒤 필요한 내용을 담을 리스트와 맵이다. 파일에 대한 정보는 리스트에,
				 * 다른 파라미터의 정보는 모두 맵에 담을 것이다.
				 */
				Map<String, String> parameter = new HashMap<>();
				List<Map<String, String>> fileList = new ArrayList<>();

				/* 파일을 업로드할 시 최대 크기나 임시 저장할 폴더의 경로 등을 포함하기 위한 인스턴스이다. */
				DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
				fileItemFactory.setRepository(new File(fileUploadDirectory));
				fileItemFactory.setSizeThreshold(maxFileSize);

				/* 서블릿에서 기본 제공하는거 말고 꼭 commons fileupload 라이브러이에 있는 클래스로 임포트 해야 한다. */
				ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
//		        fileUpload.setHeaderEncoding(encodingType);		//별 의미 없는 듯 하다. 기본값은 null인데 파일명은 자동으로 UTF-8로 인코딩한 거 같다.

				try {
					/* request를 파싱하여 데이터 하나 하나를 FileItem 인스턴로 반환한다. */
					List<FileItem> fileItems = fileUpload.parseRequest(request);

					for (FileItem item : fileItems) {
						/* 폼 데이터는 isFormField 속성이 true이고, 파일은 isFormField 속성이 false이다. */
						System.out.println(item);
					}

					/* 위에서 출력해본 모든 item들을 다 처리할 것이다. */
					for (int i = 0; i < fileItems.size(); i++) {
						FileItem item = fileItems.get(i);

						if (!item.isFormField()) {

							/* 파일 데이터인 경우 */
							if (item.getSize() > 0) {

								/*
								 * 파일의 사이즈가 0보다 커야 전송된 파일이 있다는 의미이다. 전송된 파일이 있는 경우에만 처리하고, 0인 경우에는 무시하도록 로직을
								 * 작성한다.
								 */
								String fieldName = item.getFieldName();
								String originFileName = item.getName();

								int dot = originFileName.lastIndexOf(".");
								String ext = originFileName.substring(dot);

								String randomFileName = UUID.randomUUID().toString().replace("-", "") + ext;

								/* 저장할 파일 정보를 담은 인스턴스를 생성하고 */
								File storeFile = new File(fileUploadDirectory + "/" + randomFileName);

								/* 저장한다 */
								item.write(storeFile);

								/* 필요한 정보를 Map에 담는다. */
								Map<String, String> fileMap = new HashMap<>();
								fileMap.put("adminPictureName", originFileName);
								fileMap.put("adminPictureModifyName", randomFileName);
								fileMap.put("adminPictureSaveRoute", "/resources/upload/origin/" + randomFileName);

								/* 제목 사진과 나머지 사진을 구분하고 썸네일도 생성한다. */
								int width = 0;
								int height = 0;

								/* 썸네일로 변환 할 사이즈를 지정한다. */
								width = 200;
								height = 180;

								/* 썸네일로 변환 후 저장한다. */
								Thumbnails.of(fileUploadDirectory + randomFileName).size(width, height)
										.toFile(thumbnailDirectory + "thumbnail_" + randomFileName);

								/* 나중에 웹서버에서 접근 가능한 경로 형태로 썸네일의 저장 경로도 함께 저장한다. */
								fileMap.put("adminThumbnailPictureSaveRoute",
										"/resources/upload/thumbnail/thumbnail_" + randomFileName);

								fileList.add(fileMap);

							}

						} else {
							/* 폼 데이터인 경우 */
							/*
							 * 전송된 폼의 name은 getFiledName()으로 받아오고, 해당 필드의 value는 getString()으로 받아온다. 하지만 인코딩
							 * 설정을 하더라도 전송되는 파라미터는 ISO-8859-1로 처리된다. 별도로 ISO-8859-1로 해석된 한글을 UTF-8로 변경해주어야
							 * 한다.
							 */
//							parameter.put(item.getFieldName(), item.getString());
							parameter.put(item.getFieldName(),
									new String(item.getString().getBytes("ISO-8859-1"), "UTF-8"));

						}
					}

					System.out.println("parameter : " + parameter);
					System.out.println("fileList : " + fileList);

					/* 서비스를 요청할 수 있도록 BoardDTO에 담는다. */
					RoomPostAndAdminPictureDTO thumbnail = new RoomPostAndAdminPictureDTO();
					thumbnail.setRoomPostTitle(parameter.get("roomPostTitle"));
					thumbnail.setRoomPostContents(parameter.get("roomPostContents"));
					thumbnail.setRoomPostAble(parameter.get("valueYn"));
					
					HttpSession session = request.getSession();
					EmployeeDTO emp = (EmployeeDTO) session.getAttribute("loginMember");
					thumbnail.setEmpId(emp.getEmpId());
					
					thumbnail.setAdminPictureList(new ArrayList<AdminPictureDTO>());
					System.out.println("thumbnail: " + thumbnail);
					List<AdminPictureDTO> list = thumbnail.getAdminPictureList();
					for (int i = 0; i < fileList.size(); i++) {
						Map<String, String> file = fileList.get(i);

						AdminPictureDTO tempFileInfo = new AdminPictureDTO();
						tempFileInfo.setAdminPictureName(file.get("adminPictureName"));
						tempFileInfo.setAdminPictureModifyName(file.get("adminPictureModifyName"));
						tempFileInfo.setAdminPictureSaveRoute(file.get("adminPictureSaveRoute"));
						tempFileInfo.setAdminThumbnailPictureSaveRoute(file.get("adminThumbnailPictureSaveRoute"));

						list.add(tempFileInfo);
					}

					System.out.println("thumbnail board : " + thumbnail);

					/* 서비스 메소드를 요청한다. */
					int result = insertRoomPostService.insertThumbnail(thumbnail);
					/* 성공 실패 페이지를 구분하여 연결한다. */
					String path = "";
					if(result > 0) {
						path = "adminSuccessPage";
						request.setAttribute("successCode", "insertPetsitter");
					} else {
						path = "adminFailedPage";
						request.setAttribute("message", "등록 실패!");
					}
					response.sendRedirect(path);

				} catch (Exception e) {
					// 어떤 종류의 Exception이 발생 하더라도실패 시 파일을 삭제해야 한다.
					int cnt = 0;
					for (int i = 0; i < fileList.size(); i++) {
						Map<String, String> file = fileList.get(i);

						File deleteFile = new File(fileUploadDirectory + "/" + file.get("savedFileName"));
						boolean isDeleted = deleteFile.delete();

						if (isDeleted) {
							cnt++;
						}
					}

					if (cnt == fileList.size()) {
						System.out.println("업로드에실패한 모든 사진 삭제 완료!");
						e.printStackTrace();
					} else {
						e.printStackTrace();
					}

				}

			}

		}

	}
}
