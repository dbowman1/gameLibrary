package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ScreenshotsItem{

	@JsonProperty("game")
	private int game;

	@JsonProperty("width")
	private int width;

	@JsonProperty("id")
	private int id;

	@JsonProperty("image_id")
	private String imageId;

	@JsonProperty("url")
	private String url;

	@JsonProperty("height")
	private int height;

	public void setGame(int game){
		this.game = game;
	}

	public int getGame(){
		return game;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setImageId(String imageId){
		this.imageId = imageId;
	}

	public String getImageId(){
		return imageId;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ScreenshotsItem{" + 
			"game = '" + game + '\'' + 
			",width = '" + width + '\'' + 
			",id = '" + id + '\'' + 
			",image_id = '" + imageId + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}