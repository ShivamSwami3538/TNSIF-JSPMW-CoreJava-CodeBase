package com.tnsif.dayeleven.ThrowsException;

public class greaterValueException extends Exception {

	public greaterValueException(String string)
	{
		super(string);
	}
	
	public greaterValueException()
	{
		super("Percentage should not be greter then 100 ");
	}
}