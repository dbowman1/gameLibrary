package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Websites item.
 */
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
     * Set trusted.
     *
     * @param trusted the trusted
     */
    public void setTrusted(boolean trusted){
		this.trusted = trusted;
	}

    /**
     * Is trusted boolean.
     *
     * @return the boolean
     */
    public boolean isTrusted(){
		return trusted;
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
     * Set url.
     *
     * @param url the url
     */
    public void setUrl(String url){
		this.url = url;
	}

    /**
     * Get url string.
     *
     * @return the string
     */
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