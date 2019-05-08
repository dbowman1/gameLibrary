package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Platforms item.
 */
@Data
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
}