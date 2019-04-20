package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setDate(int date){
		this.date = date;
	}

	public int getDate(){
		return date;
	}

	public void setGame(int game){
		this.game = game;
	}

	public int getGame(){
		return game;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setY(int Y){
		this.Y = Y;
	}

	public int getY(){
		return Y;
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

	public void setRegion(int region){
		this.region = region;
	}

	public int getRegion(){
		return region;
	}

	public void setHuman(String human){
		this.human = human;
	}

	public String getHuman(){
		return human;
	}

	public void setM(int M){
		this.M = M;
	}

	public int getM(){
		return M;
	}

	public void setPlatform(int platform){
		this.platform = platform;
	}

	public int getPlatform(){
		return platform;
	}

	@Override
 	public String toString(){
		return 
			"ReleaseDatesItem{" + 
			"date = '" + date + '\'' + 
			",game = '" + game + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",y = '" + Y + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",region = '" + region + '\'' + 
			",human = '" + human + '\'' + 
			",m = '" + M + '\'' + 
			",platform = '" + platform + '\'' + 
			"}";
		}
}