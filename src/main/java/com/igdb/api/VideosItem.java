package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Videos item.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class VideosItem{

	@JsonProperty("game")
	private int game;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("video_id")
	private String videoId;
}