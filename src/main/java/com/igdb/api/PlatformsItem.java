package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Platforms item.
 */
@Generated("com.robohorse.robopojogenerator")
public class PlatformsItem{

	@JsonProperty("generation")
	private int generation;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("product_family")
	private int productFamily;

	@JsonProperty("alternative_name")
	private String alternativeName;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("abbreviation")
	private String abbreviation;

	@JsonProperty("url")
	private String url;

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("versions")
	private List<Integer> versions;

	@JsonProperty("name")
	private String name;

	@JsonProperty("websites")
	private List<Integer> websites;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private int category;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("platform_logo")
	private int platformLogo;

    /**
     * Set generation.
     *
     * @param generation the generation
     */
    public void setGeneration(int generation){
		this.generation = generation;
	}

    /**
     * Get generation int.
     *
     * @return the int
     */
    public int getGeneration(){
		return generation;
	}

    /**
     * Set summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary){
		this.summary = summary;
	}

    /**
     * Get summary string.
     *
     * @return the string
     */
    public String getSummary(){
		return summary;
	}

    /**
     * Set product family.
     *
     * @param productFamily the product family
     */
    public void setProductFamily(int productFamily){
		this.productFamily = productFamily;
	}

    /**
     * Get product family int.
     *
     * @return the int
     */
    public int getProductFamily(){
		return productFamily;
	}

    /**
     * Set alternative name.
     *
     * @param alternativeName the alternative name
     */
    public void setAlternativeName(String alternativeName){
		this.alternativeName = alternativeName;
	}

    /**
     * Get alternative name string.
     *
     * @return the string
     */
    public String getAlternativeName(){
		return alternativeName;
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
     * Set abbreviation.
     *
     * @param abbreviation the abbreviation
     */
    public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}

    /**
     * Get abbreviation string.
     *
     * @return the string
     */
    public String getAbbreviation(){
		return abbreviation;
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
     * Set versions.
     *
     * @param versions the versions
     */
    public void setVersions(List<Integer> versions){
		this.versions = versions;
	}

    /**
     * Get versions list.
     *
     * @return the list
     */
    public List<Integer> getVersions(){
		return versions;
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
     * Set websites.
     *
     * @param websites the websites
     */
    public void setWebsites(List<Integer> websites){
		this.websites = websites;
	}

    /**
     * Get websites list.
     *
     * @return the list
     */
    public List<Integer> getWebsites(){
		return websites;
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
     * Set platform logo.
     *
     * @param platformLogo the platform logo
     */
    public void setPlatformLogo(int platformLogo){
		this.platformLogo = platformLogo;
	}

    /**
     * Get platform logo int.
     *
     * @return the int
     */
    public int getPlatformLogo(){
		return platformLogo;
	}

	@Override
 	public String toString(){
		return 
			"PlatformsItem{" + 
			"generation = '" + generation + '\'' + 
			",summary = '" + summary + '\'' + 
			",product_family = '" + productFamily + '\'' + 
			",alternative_name = '" + alternativeName + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",abbreviation = '" + abbreviation + '\'' + 
			",url = '" + url + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",versions = '" + versions + '\'' + 
			",name = '" + name + '\'' + 
			",websites = '" + websites + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",slug = '" + slug + '\'' + 
			",platform_logo = '" + platformLogo + '\'' + 
			"}";
		}
}