package com.wkimdev.lecture.adapter.model;

import java.io.Serializable;
import java.sql.Array;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class DetailList<T extends PlayerDafaultList> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9109912069506374219L;

	@JsonProperty
	private String uploaded; // "2007-06-05T22:07:03.000Z",
	
	@JsonProperty
	private int duration; // 2840
	
	@JsonProperty
	private List<String> tags; // ["GDD07", "GDD07US", "Maps"],
	
	@JsonProperty
	private T player;
	
//	"player": {
//		"default": "https://www.youtube.com/watch?vu003dhYB0mn5zh2c"
//	}

}
