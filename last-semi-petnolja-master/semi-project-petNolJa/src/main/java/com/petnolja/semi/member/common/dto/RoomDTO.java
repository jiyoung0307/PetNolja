package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

import com.petnolja.semi.admin.common.dto.RoomPostDTO;

public class RoomDTO implements Serializable {
	private static final long serialVersionUID = 4576483277339419127L;
	
	private int roomNo;
	private String roomName;
	private int roomPrice;
	private int roomAble;
	private RoomCategoryDTO categoryDTO;
	private RoomPostDTO roomPostDTO;
	
	public RoomDTO() {
	}

	public RoomDTO(int roomNo, String roomName, int roomPrice, int roomAble, RoomCategoryDTO categoryDTO,
			RoomPostDTO roomPostDTO) {
		this.roomNo = roomNo;
		this.roomName = roomName;
		this.roomPrice = roomPrice;
		this.roomAble = roomAble;
		this.categoryDTO = categoryDTO;
		this.roomPostDTO = roomPostDTO;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	public int getRoomAble() {
		return roomAble;
	}

	public void setRoomAble(int roomAble) {
		this.roomAble = roomAble;
	}

	public RoomCategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	public void setCategoryDTO(RoomCategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public RoomPostDTO getRoomPostDTO() {
		return roomPostDTO;
	}

	public void setRoomPostDTO(RoomPostDTO roomPostDTO) {
		this.roomPostDTO = roomPostDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RoomDTO [roomNo=" + roomNo + ", roomName=" + roomName + ", roomPrice=" + roomPrice + ", roomAble="
				+ roomAble + ", categoryDTO=" + categoryDTO + ", roomPostDTO=" + roomPostDTO + "]";
	}

}
