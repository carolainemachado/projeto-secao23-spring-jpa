package com.carolaine.projeto_secao23.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code;//codigo do tipo enumerado

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	//static porque ele vai funcionar sem precisar instanciar 
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}