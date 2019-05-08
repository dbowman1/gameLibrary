package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Themes item.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class ThemesItem{

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("url")
	private String url;
}