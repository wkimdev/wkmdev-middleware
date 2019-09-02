package com.wkimdev.lecture.adapter.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureRequest extends ModelRequest {
	
	/**
	 * 
	 */
	@Override
	public String getPath() {

		return "/api/v1/lectures";
	}

}
