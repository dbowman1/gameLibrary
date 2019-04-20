package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class GameResults{

	@JsonProperty("franchise")
	private int franchise;

	@JsonProperty("keywords")
	private List<Integer> keywords;

	@JsonProperty("rating")
	private double rating;

	@JsonProperty("similar_games")
	private List<SimilarGamesItem> similarGames;

	@JsonProperty("created_at")
	private int createdAt;

	@JsonProperty("videos")
	private List<VideosItem> videos;

	@JsonProperty("alternative_names")
	private List<Integer> alternativeNames;

	@JsonProperty("player_perspectives")
	private List<Integer> playerPerspectives;

	@JsonProperty("screenshots")
	private List<ScreenshotsItem> screenshots;

	@JsonProperty("platforms")
	private List<PlatformsItem> platforms;

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

	@JsonProperty("total_rating")
	private double totalRating;

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

	@JsonProperty("rating_count")
	private int ratingCount;

	@JsonProperty("tags")
	private List<Integer> tags;

	@JsonProperty("bundles")
	private List<Integer> bundles;

	@JsonProperty("name")
	private String name;

	@JsonProperty("total_rating_count")
	private int totalRatingCount;

	@JsonProperty("websites")
	private List<WebsitesItem> websites;

	@JsonProperty("category")
	private int category;

	@JsonProperty("involved_companies")
	private List<Integer> involvedCompanies;

	public void setFranchise(int franchise){
		this.franchise = franchise;
	}

	public int getFranchise(){
		return franchise;
	}

	public void setKeywords(List<Integer> keywords){
		this.keywords = keywords;
	}

	public List<Integer> getKeywords(){
		return keywords;
	}

	public void setRating(double rating){
		this.rating = rating;
	}

	public double getRating(){
		return rating;
	}

	public void setSimilarGames(List<SimilarGamesItem> similarGames){
		this.similarGames = similarGames;
	}

	public List<SimilarGamesItem> getSimilarGames(){
		return similarGames;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setVideos(List<VideosItem> videos){
		this.videos = videos;
	}

	public List<VideosItem> getVideos(){
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

	public void setScreenshots(List<ScreenshotsItem> screenshots){
		this.screenshots = screenshots;
	}

	public List<ScreenshotsItem> getScreenshots(){
		return screenshots;
	}

	public void setPlatforms(List<PlatformsItem> platforms){
		this.platforms = platforms;
	}

	public List<PlatformsItem> getPlatforms(){
		return platforms;
	}

	public void setCover(Cover cover){
		this.cover = cover;
	}

	public Cover getCover(){
		return cover;
	}

	public void setThemes(List<ThemesItem> themes){
		this.themes = themes;
	}

	public List<ThemesItem> getThemes(){
		return themes;
	}

	public void setAgeRatings(List<Integer> ageRatings){
		this.ageRatings = ageRatings;
	}

	public List<Integer> getAgeRatings(){
		return ageRatings;
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

	public void setReleaseDates(List<ReleaseDatesItem> releaseDates){
		this.releaseDates = releaseDates;
	}

	public List<ReleaseDatesItem> getReleaseDates(){
		return releaseDates;
	}

	public void setTotalRating(double totalRating){
		this.totalRating = totalRating;
	}

	public double getTotalRating(){
		return totalRating;
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

	public void setFranchises(List<Integer> franchises){
		this.franchises = franchises;
	}

	public List<Integer> getFranchises(){
		return franchises;
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

	public void setRatingCount(int ratingCount){
		this.ratingCount = ratingCount;
	}

	public int getRatingCount(){
		return ratingCount;
	}

	public void setTags(List<Integer> tags){
		this.tags = tags;
	}

	public List<Integer> getTags(){
		return tags;
	}

	public void setBundles(List<Integer> bundles){
		this.bundles = bundles;
	}

	public List<Integer> getBundles(){
		return bundles;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTotalRatingCount(int totalRatingCount){
		this.totalRatingCount = totalRatingCount;
	}

	public int getTotalRatingCount(){
		return totalRatingCount;
	}

	public void setWebsites(List<WebsitesItem> websites){
		this.websites = websites;
	}

	public List<WebsitesItem> getWebsites(){
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

	@Override
 	public String toString(){
		return 
			"GameResults{" + 
			"franchise = '" + franchise + '\'' + 
			",keywords = '" + keywords + '\'' + 
			",rating = '" + rating + '\'' + 
			",similar_games = '" + similarGames + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",videos = '" + videos + '\'' + 
			",alternative_names = '" + alternativeNames + '\'' + 
			",player_perspectives = '" + playerPerspectives + '\'' + 
			",screenshots = '" + screenshots + '\'' + 
			",platforms = '" + platforms + '\'' + 
			",cover = '" + cover + '\'' + 
			",themes = '" + themes + '\'' + 
			",age_ratings = '" + ageRatings + '\'' + 
			",pulse_count = '" + pulseCount + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",first_release_date = '" + firstReleaseDate + '\'' + 
			",genres = '" + genres + '\'' + 
			",popularity = '" + popularity + '\'' + 
			",release_dates = '" + releaseDates + '\'' + 
			",total_rating = '" + totalRating + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			",hypes = '" + hypes + '\'' + 
			",franchises = '" + franchises + '\'' + 
			",summary = '" + summary + '\'' + 
			",game_modes = '" + gameModes + '\'' + 
			",external_games = '" + externalGames + '\'' + 
			",collection = '" + collection + '\'' + 
			",url = '" + url + '\'' + 
			",rating_count = '" + ratingCount + '\'' + 
			",tags = '" + tags + '\'' + 
			",bundles = '" + bundles + '\'' + 
			",name = '" + name + '\'' + 
			",total_rating_count = '" + totalRatingCount + '\'' + 
			",websites = '" + websites + '\'' + 
			",category = '" + category + '\'' + 
			",involved_companies = '" + involvedCompanies + '\'' + 
			"}";
		}
}