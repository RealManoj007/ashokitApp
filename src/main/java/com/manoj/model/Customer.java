package com.manoj.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data @JacksonXmlRootElement
public class Customer {
	private Integer customerId;
	private String cutomerName;
	private Integer customerPhno;
}
