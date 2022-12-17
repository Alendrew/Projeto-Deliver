package com.devsuperior.dsdeliver.entities;

public enum OrderStatus {
	
	PENDING(1), 
	DELIVERED(2);
	
	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code");
	}
}
