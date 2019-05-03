package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Release dates item.
 */
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

    /**
     * Set date.
     *
     * @param date the date
     */
    public void setDate(int date){
		this.date = date;
	}

    /**
     * Get date int.
     *
     * @return the int
     */
    public int getDate(){
		return date;
	}

    /**
     * Set game.
     *
     * @param game the game
     */
    public void setGame(int game){
		this.game = game;
	}

    /**
     * Get game int.
     *
     * @return the int
     */
    public int getGame(){
		return game;
	}

    /**
     * Set updated at.
     *
     * @param updatedAt the updated at
     */
    public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

    /**
     * Get updated at int.
     *
     * @return the int
     */
    public int getUpdatedAt(){
		return updatedAt;
	}

    /**
     * Set created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

    /**
     * Get created at int.
     *
     * @return the int
     */
    public int getCreatedAt(){
		return createdAt;
	}

    /**
     * Set y.
     *
     * @param Y the y
     */
    public void setY(int Y){
		this.Y = Y;
	}

    /**
     * Get y int.
     *
     * @return the int
     */
    public int getY(){
		return Y;
	}

    /**
     * Set id.
     *
     * @param id the id
     */
    public void setId(int id){
		this.id = id;
	}

    /**
     * Get id int.
     *
     * @return the int
     */
    public int getId(){
		return id;
	}

    /**
     * Set category.
     *
     * @param category the category
     */
    public void setCategory(int category){
		this.category = category;
	}

    /**
     * Get category int.
     *
     * @return the int
     */
    public int getCategory(){
		return category;
	}

    /**
     * Set region.
     *
     * @param region the region
     */
    public void setRegion(int region){
		this.region = region;
	}

    /**
     * Get region int.
     *
     * @return the int
     */
    public int getRegion(){
		return region;
	}

    /**
     * Set human.
     *
     * @param human the human
     */
    public void setHuman(String human){
		this.human = human;
	}

    /**
     * Get human string.
     *
     * @return the string
     */
    public String getHuman(){
		return human;
	}

    /**
     * Set m.
     *
     * @param M the m
     */
    public void setM(int M){
		this.M = M;
	}

    /**
     * Get m int.
     *
     * @return the int
     */
    public int getM(){
		return M;
	}

    /**
     * Set platform.
     *
     * @param platform the platform
     */
    public void setPlatform(int platform){
		this.platform = platform;
	}

    /**
     * Get platform int.
     *
     * @return the int
     */
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