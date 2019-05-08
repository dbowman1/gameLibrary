package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

/**
 * The type Game results.
 */
@Data
@Generated("com.robohorse.robopojogenerator")
public class GameResults{

	@JsonProperty("franchise")
	private int franchise;

	@JsonProperty("keywords")
	private List<Integer> keywords;

	@JsonProperty("similar_games")
	private List<Integer> similarGames;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("videos")
	private List<VideosItem> videos;

	@JsonProperty("player_perspectives")
	private List<Integer> playerPerspectives;

	@JsonProperty("screenshots")
	private List<ScreenshotsItem> screenshots;

	@JsonProperty("platforms")
	private List<Integer> platforms;

	@JsonProperty("cover")
	private Cover cover;

	@JsonProperty("themes")
	private List<ThemesItem> themes;

	@JsonProperty("age_ratings")
	private List<Integer> ageRatings;

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
	private List<ReleaseDatesItem> releaseDates;

	@JsonProperty("id")
	private int id;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("hypes")
	private int hypes;

	@JsonProperty("franchises")
	private List<Integer> franchises;

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
	private List<ArtworksItem> artworks;

	@JsonProperty("name")
	private String name;

	@JsonProperty("websites")
	private List<WebsitesItem> websites;

	@JsonProperty("category")
	private int category;

	@JsonProperty("involved_companies")
	private List<Integer> involvedCompanies;
}