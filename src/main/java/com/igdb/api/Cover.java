package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Cover.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class Cover{

	@JsonProperty("game")
	private int game;

	@JsonProperty("alpha_channel")
	private boolean alphaChannel;

	@JsonProperty("width")
	private int width;

	@JsonProperty("animated")
	private boolean animated;

	@JsonProperty("id")
	private int id;

	@JsonProperty("image_id")
	private String imageId;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private int height;
}