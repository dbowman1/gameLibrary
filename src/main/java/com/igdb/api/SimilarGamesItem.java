package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Similar games item.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class SimilarGamesItem{

	@JsonProperty("similar_games")
	private List<Integer> similarGames;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("videos")
	private List<Integer> videos;

	@JsonProperty("alternative_names")
	private List<Integer> alternativeNames;

	@JsonProperty("player_perspectives")
	private List<Integer> playerPerspectives;

	@JsonProperty("platforms")
	private List<Integer> platforms;

	@JsonProperty("cover")
	private int cover;

	@JsonProperty("themes")
	private List<Integer> themes;

	@JsonProperty("pulse_count")
	private int pulseCount;

	@JsonProperty("updated_at")
	private int updatedAt;

	@JsonProperty("first_release_date")
	private int firstReleaseDate;

	@JsonProperty("genres")
	private List<Integer> genres;

	@JsonProperty("popularity")
	private double popularity;

	@JsonProperty("release_dates")
	private List<Integer> releaseDates;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("hypes")
	private int hypes;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("game_modes")
	private List<Integer> gameModes;

	@JsonProperty("external_games")
	private List<Integer> externalGames;

	@JsonProperty("collection")
	private int collection;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tags")
	private List<Integer> tags;

	@JsonProperty("artworks")
	private List<Integer> artworks;

	@JsonProperty("name")
	private String name;

	@JsonProperty("websites")
	private List<Integer> websites;

	@JsonProperty("category")
	private int category;

	@JsonProperty("involved_companies")
	private List<Integer> involvedCompanies;

	@JsonProperty("franchise")
	private int franchise;

	@JsonProperty("screenshots")
	private List<Integer> screenshots;

	@JsonProperty("age_ratings")
	private List<Integer> ageRatings;

	@JsonProperty("franchises")
	private List<Integer> franchises;

	@JsonProperty("game_engines")
	private List<Integer> gameEngines;

	@JsonProperty("version_title")
	private String versionTitle;

	@JsonProperty("version_parent")
	private int versionParent;

	@JsonProperty("keywords")
	private List<Integer> keywords;

	@JsonProperty("aggregated_rating_count")
	private int aggregatedRatingCount;

	@JsonProperty("storyline")
	private String storyline;

	@JsonProperty("total_rating")
	private double totalRating;

	@JsonProperty("total_rating_count")
	private int totalRatingCount;

	@JsonProperty("aggregated_rating")
	private double aggregatedRating;

	@JsonProperty("rating")
	private int rating;

	@JsonProperty("rating_count")
	private int ratingCount;
}