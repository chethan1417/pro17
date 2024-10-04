package com.xworks.works.inter;

public enum SeatType {

	RECLINER(10), PREMIUM(51), EXECUTIVE(101);

	private int seatNo;

	private SeatType(int seatNo) {

		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}
}
