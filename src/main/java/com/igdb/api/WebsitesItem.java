package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setGame(int game){
		this.game = game;
	}

	public int getGame(){
		return game;
	}

	public void setTrusted(boolean trusted){
		this.trusted = trusted;
	}

	public boolean isTrusted(){
		return trusted;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setCategory(int category){
		this.category = category;
	}

	public int getCategory(){
		return category;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"WebsitesItem{" + 
			"game = '" + game + '\'' + 
			",trusted = '" + trusted + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}