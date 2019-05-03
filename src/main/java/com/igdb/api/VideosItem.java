package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Videos item.
 */
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
     * Set name.
     *
     * @param name the name
     */
    public void setName(String name){
		this.name = name;
	}

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
		return name;
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
     * Set video id.
     *
     * @param videoId the video id
     */
    public void setVideoId(String videoId){
		this.videoId = videoId;
	}

    /**
     * Get video id string.
     *
     * @return the string
     */
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