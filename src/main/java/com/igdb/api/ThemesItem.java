package com.igdb.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Themes item.
 */
@Generated("com.robohorse.robopojogenerator")
public class ThemesItem{

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("name")
	private String name;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("url")
	private String url;

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
     * Set slug.
     *
     * @param slug the slug
     */
    public void setSlug(String slug){
		this.slug = slug;
	}

    /**
     * Get slug string.
     *
     * @return the string
     */
    public String getSlug(){
		return slug;
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
			"ThemesItem{" + 
			"updated_at = '" + updatedAt + '\'' + 
			",name = '" + name + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}