package com.petnolja.semi.member.common.dto;

import java.io.Serializable;

public class RoomCategoryDTO implements Serializable {
	private static final long serialVersionUID = 4861251429548025836L;
	
	private int roomCategory;
	private int roomLimit;
	
	public RoomCategoryDTO() {
	}

	public RoomCategoryDTO(int roomCategory, int roomLimit) {
		this.roomCategory = roomCategory;
		this.roomLimit = roomLimit;
	}

	public int getRoomCategory() {
		return roomCategory;
	}

	public void setRoomCategory(int roomCategory) {
		this.roomCategory = roomCategory;
	}

	public int getRoomLimit() {
		return roomLimit;
	}

	public void setRoomLimit(int roomLimit) {
		this.roomLimit = roomLimit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RoomCategoryDTO [roomCategory=" + roomCategory + ", roomLimit=" + roomLimit + "]";
	}
	
}
