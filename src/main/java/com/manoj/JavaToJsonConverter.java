package com.manoj;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws JacksonException {
		Book book=new  Book();
		book.setBookId(102);
		book.setBookName("Spring ");
		book.setBookPrice(450.00);
		
		//Convert book data into Json
		ObjectMapper mapper=new ObjectMapper();
		//String valueAsString = mapper.writeValueAsString(book);
		String valueAsString = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(book);
		System.err.println("\nValue is "+valueAsString);
	}
}
