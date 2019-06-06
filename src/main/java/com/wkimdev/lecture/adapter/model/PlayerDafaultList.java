package com.wkimdev.lecture.adapter.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class PlayerDafaultList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7590167700186865032L;
	
	@JsonProperty("default")
	private String defaultValue;

}
