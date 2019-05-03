package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Artworks item.
 */
@Generated("com.robohorse.robopojogenerator")
public class ArtworksItem{

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
     * Set alpha channel.
     *
     * @param alphaChannel the alpha channel
     */
    public void setAlphaChannel(boolean alphaChannel){
		this.alphaChannel = alphaChannel;
	}

    /**
     * Is alpha channel boolean.
     *
     * @return the boolean
     */
    public boolean isAlphaChannel(){
		return alphaChannel;
	}

    /**
     * Set width.
     *
     * @param width the width
     */
    public void setWidth(int width){
		this.width = width;
	}

    /**
     * Get width int.
     *
     * @return the int
     */
    public int getWidth(){
		return width;
	}

    /**
     * Set animated.
     *
     * @param animated the animated
     */
    public void setAnimated(boolean animated){
		this.animated = animated;
	}

    /**
     * Is animated boolean.
     *
     * @return the boolean
     */
    public boolean isAnimated(){
		return animated;
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
     * Set image id.
     *
     * @param imageId the image id
     */
    public void setImageId(String imageId){
		this.imageId = imageId;
	}

    /**
     * Get image id string.
     *
     * @return the string
     */
    public String getImageId(){
		return imageId;
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

    /**
     * Set height.
     *
     * @param height the height
     */
    public void setHeight(int height){
		this.height = height;
	}

    /**
     * Get height int.
     *
     * @return the int
     */
    public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"ArtworksItem{" + 
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