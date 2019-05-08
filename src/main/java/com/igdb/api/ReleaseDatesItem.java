package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Release dates item.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class ReleaseDatesItem{

	@JsonProperty("date")
	private int date;

	@JsonProperty("game")
	private int game;

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("y")
	private int Y;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private int category;

	@JsonProperty("region")
	private int region;

	@JsonProperty("human")
	private String human;

	@JsonProperty("m")
	private int M;

	@JsonProperty("platform")
	private int platform;

}