package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ScreenshotsItem{

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

	public void setGame(int game){
		this.game = game;
	}

	public int getGame(){
		return game;
	}

	public void setAlphaChannel(boolean alphaChannel){
		this.alphaChannel = alphaChannel;
	}

	public boolean isAlphaChannel(){
		return alphaChannel;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setAnimated(boolean animated){
		this.animated = animated;
	}

	public boolean isAnimated(){
		return animated;
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
			",alpha_channel = '" + alphaChannel + '\'' + 
			",width = '" + width + '\'' + 
			",animated = '" + animated + '\'' + 
			",id = '" + id + '\'' + 
			",image_id = '" + imageId + '\'' + 
			",url = '" + url + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}