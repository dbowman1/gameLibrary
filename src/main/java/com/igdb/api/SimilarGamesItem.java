package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

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

	public void setSimilarGames(List<Integer> similarGames){
		this.similarGames = similarGames;
	}

	public List<Integer> getSimilarGames(){
		return similarGames;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setVideos(List<Integer> videos){
		this.videos = videos;
	}

	public List<Integer> getVideos(){
		return videos;
	}

	public void setAlternativeNames(List<Integer> alternativeNames){
		this.alternativeNames = alternativeNames;
	}

	public List<Integer> getAlternativeNames(){
		return alternativeNames;
	}

	public void setPlayerPerspectives(List<Integer> playerPerspectives){
		this.playerPerspectives = playerPerspectives;
	}

	public List<Integer> getPlayerPerspectives(){
		return playerPerspectives;
	}

	public void setPlatforms(List<Integer> platforms){
		this.platforms = platforms;
	}

	public List<Integer> getPlatforms(){
		return platforms;
	}

	public void setCover(int cover){
		this.cover = cover;
	}

	public int getCover(){
		return cover;
	}

	public void setThemes(List<Integer> themes){
		this.themes = themes;
	}

	public List<Integer> getThemes(){
		return themes;
	}

	public void setPulseCount(int pulseCount){
		this.pulseCount = pulseCount;
	}

	public int getPulseCount(){
		return pulseCount;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	public void setFirstReleaseDate(int firstReleaseDate){
		this.firstReleaseDate = firstReleaseDate;
	}

	public int getFirstReleaseDate(){
		return firstReleaseDate;
	}

	public void setGenres(List<Integer> genres){
		this.genres = genres;
	}

	public List<Integer> getGenres(){
		return genres;
	}

	public void setPopularity(double popularity){
		this.popularity = popularity;
	}

	public double getPopularity(){
		return popularity;
	}

	public void setReleaseDates(List<Integer> releaseDates){
		this.releaseDates = releaseDates;
	}

	public List<Integer> getReleaseDates(){
		return releaseDates;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setHypes(int hypes){
		this.hypes = hypes;
	}

	public int getHypes(){
		return hypes;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setGameModes(List<Integer> gameModes){
		this.gameModes = gameModes;
	}

	public List<Integer> getGameModes(){
		return gameModes;
	}

	public void setExternalGames(List<Integer> externalGames){
		this.externalGames = externalGames;
	}

	public List<Integer> getExternalGames(){
		return externalGames;
	}

	public void setCollection(int collection){
		this.collection = collection;
	}

	public int getCollection(){
		return collection;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTags(List<Integer> tags){
		this.tags = tags;
	}

	public List<Integer> getTags(){
		return tags;
	}

	public void setArtworks(List<Integer> artworks){
		this.artworks = artworks;
	}

	public List<Integer> getArtworks(){
		return artworks;
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

	public void setCategory(int category){
		this.category = category;
	}

	public int getCategory(){
		return category;
	}

	public void setInvolvedCompanies(List<Integer> involvedCompanies){
		this.involvedCompanies = involvedCompanies;
	}

	public List<Integer> getInvolvedCompanies(){
		return involvedCompanies;
	}

	public void setFranchise(int franchise){
		this.franchise = franchise;
	}

	public int getFranchise(){
		return franchise;
	}

	public void setScreenshots(List<Integer> screenshots){
		this.screenshots = screenshots;
	}

	public List<Integer> getScreenshots(){
		return screenshots;
	}

	public void setAgeRatings(List<Integer> ageRatings){
		this.ageRatings = ageRatings;
	}

	public List<Integer> getAgeRatings(){
		return ageRatings;
	}

	public void setFranchises(List<Integer> franchises){
		this.franchises = franchises;
	}

	public List<Integer> getFranchises(){
		return franchises;
	}

	public void setGameEngines(List<Integer> gameEngines){
		this.gameEngines = gameEngines;
	}

	public List<Integer> getGameEngines(){
		return gameEngines;
	}

	public void setVersionTitle(String versionTitle){
		this.versionTitle = versionTitle;
	}

	public String getVersionTitle(){
		return versionTitle;
	}

	public void setVersionParent(int versionParent){
		this.versionParent = versionParent;
	}

	public int getVersionParent(){
		return versionParent;
	}

	public void setKeywords(List<Integer> keywords){
		this.keywords = keywords;
	}

	public List<Integer> getKeywords(){
		return keywords;
	}

	public void setAggregatedRatingCount(int aggregatedRatingCount){
		this.aggregatedRatingCount = aggregatedRatingCount;
	}

	public int getAggregatedRatingCount(){
		return aggregatedRatingCount;
	}

	public void setStoryline(String storyline){
		this.storyline = storyline;
	}

	public String getStoryline(){
		return storyline;
	}

	public void setTotalRating(double totalRating){
		this.totalRating = totalRating;
	}

	public double getTotalRating(){
		return totalRating;
	}

	public void setTotalRatingCount(int totalRatingCount){
		this.totalRatingCount = totalRatingCount;
	}

	public int getTotalRatingCount(){
		return totalRatingCount;
	}

	public void setAggregatedRating(double aggregatedRating){
		this.aggregatedRating = aggregatedRating;
	}

	public double getAggregatedRating(){
		return aggregatedRating;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setRatingCount(int ratingCount){
		this.ratingCount = ratingCount;
	}

	public int getRatingCount(){
		return ratingCount;
	}

	@Override
 	public String toString(){
		return 
			"SimilarGamesItem{" + 
			"similar_games = '" + similarGames + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",videos = '" + videos + '\'' + 
			",alternative_names = '" + alternativeNames + '\'' + 
			",player_perspectives = '" + playerPerspectives + '\'' + 
			",platforms = '" + platforms + '\'' + 
			",cover = '" + cover + '\'' + 
			",themes = '" + themes + '\'' + 
			",pulse_count = '" + pulseCount + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",first_release_date = '" + firstReleaseDate + '\'' + 
			",genres = '" + genres + '\'' + 
			",popularity = '" + popularity + '\'' + 
			",release_dates = '" + releaseDates + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			",hypes = '" + hypes + '\'' + 
			",summary = '" + summary + '\'' + 
			",game_modes = '" + gameModes + '\'' + 
			",external_games = '" + externalGames + '\'' + 
			",collection = '" + collection + '\'' + 
			",url = '" + url + '\'' + 
			",tags = '" + tags + '\'' + 
			",artworks = '" + artworks + '\'' + 
			",name = '" + name + '\'' + 
			",websites = '" + websites + '\'' + 
			",category = '" + category + '\'' + 
			",involved_companies = '" + involvedCompanies + '\'' + 
			",franchise = '" + franchise + '\'' + 
			",screenshots = '" + screenshots + '\'' + 
			",age_ratings = '" + ageRatings + '\'' + 
			",franchises = '" + franchises + '\'' + 
			",game_engines = '" + gameEngines + '\'' + 
			",version_title = '" + versionTitle + '\'' + 
			",version_parent = '" + versionParent + '\'' + 
			",keywords = '" + keywords + '\'' + 
			",aggregated_rating_count = '" + aggregatedRatingCount + '\'' + 
			",storyline = '" + storyline + '\'' + 
			",total_rating = '" + totalRating + '\'' + 
			",total_rating_count = '" + totalRatingCount + '\'' + 
			",aggregated_rating = '" + aggregatedRating + '\'' + 
			",rating = '" + rating + '\'' + 
			",rating_count = '" + ratingCount + '\'' + 
			"}";
		}
}