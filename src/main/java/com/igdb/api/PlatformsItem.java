package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setGeneration(int generation){
		this.generation = generation;
	}

	public int getGeneration(){
		return generation;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setProductFamily(int productFamily){
		this.productFamily = productFamily;
	}

	public int getProductFamily(){
		return productFamily;
	}

	public void setAlternativeName(String alternativeName){
		this.alternativeName = alternativeName;
	}

	public String getAlternativeName(){
		return alternativeName;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setAbbreviation(String abbreviation){
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation(){
		return abbreviation;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setVersions(List<Integer> versions){
		this.versions = versions;
	}

	public List<Integer> getVersions(){
		return versions;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setWebsites(List<Integer> websites){
		this.websites = websites;
	}

	public List<Integer> getWebsites(){
		return websites;
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

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setPlatformLogo(int platformLogo){
		this.platformLogo = platformLogo;
	}

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