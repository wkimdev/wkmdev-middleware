package com.wkimdev.lecture.adapter.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ModelResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8856631477746969967L;
	
	/**
	 * 
	 */
	@JsonProperty
	private String flag;
	
	/**
	 * 
	 */
	@JsonProperty
	private String message;
	

}
