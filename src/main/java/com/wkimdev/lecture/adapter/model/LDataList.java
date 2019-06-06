package com.wkimdev.lecture.adapter.model;

import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class LDataList implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5169671877062185547L;

	@JsonProperty
	private String updated;
	
	@JsonProperty
	private String totalItems;
	
	@JsonProperty
	private DetailList[] items;
	
	/**
	 * 
	 * @return
	 */
	public DetailList[] getRecordset() {

		if (items == null) {
			return new DetailList[0];
		} else {
			return Arrays.copyOf(items, items.length);
		}
	}
}
