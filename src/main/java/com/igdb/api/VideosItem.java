package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setGame(int game){
		this.game = game;
	}

	public int getGame(){
		return game;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setVideoId(String videoId){
		this.videoId = videoId;
	}

	public String getVideoId(){
		return videoId;
	}

	@Override
 	public String toString(){
		return 
			"VideosItem{" + 
			"game = '" + game + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",video_id = '" + videoId + '\'' + 
			"}";
		}
}