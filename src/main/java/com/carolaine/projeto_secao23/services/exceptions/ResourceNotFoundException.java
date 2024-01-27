package com.carolaine.projeto_secao23.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super ("Resource not found. Id " + id);
	}
}
