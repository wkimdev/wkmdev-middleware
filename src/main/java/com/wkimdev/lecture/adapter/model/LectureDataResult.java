package com.wkimdev.lecture.adapter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class LectureDataResult<T extends LDataList > extends LectureResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = -641058416739318458L;

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
