package br.com.bytebank.exception;

public class TransactionException extends RuntimeException{
	public TransactionException(String message) {
		super(message);
	}

}
