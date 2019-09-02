package com.wkimdev.lecture.adapter.model;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class LectureResult<T extends LDataList > extends ModelResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7149145963836891306L;
	
	
	/**
	 * 
	 */
	@JsonProperty
	private String apiVersion;
	
	
	/**
	 * 
	 */
	@JsonProperty
	private T data;

}
