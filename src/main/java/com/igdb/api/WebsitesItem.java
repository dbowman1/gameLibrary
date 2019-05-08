package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Websites item.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class WebsitesItem{

	@JsonProperty("game")
	private int game;

	@JsonProperty("trusted")
	private boolean trusted;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private int category;

	@JsonProperty("url")
	private String url;
}