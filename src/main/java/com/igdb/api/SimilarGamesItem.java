package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Similar games item.
 */
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

    /**
     * Set similar games.
     *
     * @param similarGames the similar games
     */
    public void setSimilarGames(List<Integer> similarGames){
		this.similarGames = similarGames;
	}

    /**
     * Get similar games list.
     *
     * @return the list
     */
    public List<Integer> getSimilarGames(){
		return similarGames;
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
     * Set videos.
     *
     * @param videos the videos
     */
    public void setVideos(List<Integer> videos){
		this.videos = videos;
	}

    /**
     * Get videos list.
     *
     * @return the list
     */
    public List<Integer> getVideos(){
		return videos;
	}

    /**
     * Set alternative names.
     *
     * @param alternativeNames the alternative names
     */
    public void setAlternativeNames(List<Integer> alternativeNames){
		this.alternativeNames = alternativeNames;
	}

    /**
     * Get alternative names list.
     *
     * @return the list
     */
    public List<Integer> getAlternativeNames(){
		return alternativeNames;
	}

    /**
     * Set player perspectives.
     *
     * @param playerPerspectives the player perspectives
     */
    public void setPlayerPerspectives(List<Integer> playerPerspectives){
		this.playerPerspectives = playerPerspectives;
	}

    /**
     * Get player perspectives list.
     *
     * @return the list
     */
    public List<Integer> getPlayerPerspectives(){
		return playerPerspectives;
	}

    /**
     * Set platforms.
     *
     * @param platforms the platforms
     */
    public void setPlatforms(List<Integer> platforms){
		this.platforms = platforms;
	}

    /**
     * Get platforms list.
     *
     * @return the list
     */
    public List<Integer> getPlatforms(){
		return platforms;
	}

    /**
     * Set cover.
     *
     * @param cover the cover
     */
    public void setCover(int cover){
		this.cover = cover;
	}

    /**
     * Get cover int.
     *
     * @return the int
     */
    public int getCover(){
		return cover;
	}

    /**
     * Set themes.
     *
     * @param themes the themes
     */
    public void setThemes(List<Integer> themes){
		this.themes = themes;
	}

    /**
     * Get themes list.
     *
     * @return the list
     */
    public List<Integer> getThemes(){
		return themes;
	}

    /**
     * Set pulse count.
     *
     * @param pulseCount the pulse count
     */
    public void setPulseCount(int pulseCount){
		this.pulseCount = pulseCount;
	}

    /**
     * Get pulse count int.
     *
     * @return the int
     */
    public int getPulseCount(){
		return pulseCount;
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
     * Set first release date.
     *
     * @param firstReleaseDate the first release date
     */
    public void setFirstReleaseDate(int firstReleaseDate){
		this.firstReleaseDate = firstReleaseDate;
	}

    /**
     * Get first release date int.
     *
     * @return the int
     */
    public int getFirstReleaseDate(){
		return firstReleaseDate;
	}

    /**
     * Set genres.
     *
     * @param genres the genres
     */
    public void setGenres(List<Integer> genres){
		this.genres = genres;
	}

    /**
     * Get genres list.
     *
     * @return the list
     */
    public List<Integer> getGenres(){
		return genres;
	}

    /**
     * Set popularity.
     *
     * @param popularity the popularity
     */
    public void setPopularity(double popularity){
		this.popularity = popularity;
	}

    /**
     * Get popularity double.
     *
     * @return the double
     */
    public double getPopularity(){
		return popularity;
	}

    /**
     * Set release dates.
     *
     * @param releaseDates the release dates
     */
    public void setReleaseDates(List<Integer> releaseDates){
		this.releaseDates = releaseDates;
	}

    /**
     * Get release dates list.
     *
     * @return the list
     */
    public List<Integer> getReleaseDates(){
		return releaseDates;
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
     * Set hypes.
     *
     * @param hypes the hypes
     */
    public void setHypes(int hypes){
		this.hypes = hypes;
	}

    /**
     * Get hypes int.
     *
     * @return the int
     */
    public int getHypes(){
		return hypes;
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
     * Set game modes.
     *
     * @param gameModes the game modes
     */
    public void setGameModes(List<Integer> gameModes){
		this.gameModes = gameModes;
	}

    /**
     * Get game modes list.
     *
     * @return the list
     */
    public List<Integer> getGameModes(){
		return gameModes;
	}

    /**
     * Set external games.
     *
     * @param externalGames the external games
     */
    public void setExternalGames(List<Integer> externalGames){
		this.externalGames = externalGames;
	}

    /**
     * Get external games list.
     *
     * @return the list
     */
    public List<Integer> getExternalGames(){
		return externalGames;
	}

    /**
     * Set collection.
     *
     * @param collection the collection
     */
    public void setCollection(int collection){
		this.collection = collection;
	}

    /**
     * Get collection int.
     *
     * @return the int
     */
    public int getCollection(){
		return collection;
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
     * Set tags.
     *
     * @param tags the tags
     */
    public void setTags(List<Integer> tags){
		this.tags = tags;
	}

    /**
     * Get tags list.
     *
     * @return the list
     */
    public List<Integer> getTags(){
		return tags;
	}

    /**
     * Set artworks.
     *
     * @param artworks the artworks
     */
    public void setArtworks(List<Integer> artworks){
		this.artworks = artworks;
	}

    /**
     * Get artworks list.
     *
     * @return the list
     */
    public List<Integer> getArtworks(){
		return artworks;
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
     * Set involved companies.
     *
     * @param involvedCompanies the involved companies
     */
    public void setInvolvedCompanies(List<Integer> involvedCompanies){
		this.involvedCompanies = involvedCompanies;
	}

    /**
     * Get involved companies list.
     *
     * @return the list
     */
    public List<Integer> getInvolvedCompanies(){
		return involvedCompanies;
	}

    /**
     * Set franchise.
     *
     * @param franchise the franchise
     */
    public void setFranchise(int franchise){
		this.franchise = franchise;
	}

    /**
     * Get franchise int.
     *
     * @return the int
     */
    public int getFranchise(){
		return franchise;
	}

    /**
     * Set screenshots.
     *
     * @param screenshots the screenshots
     */
    public void setScreenshots(List<Integer> screenshots){
		this.screenshots = screenshots;
	}

    /**
     * Get screenshots list.
     *
     * @return the list
     */
    public List<Integer> getScreenshots(){
		return screenshots;
	}

    /**
     * Set age ratings.
     *
     * @param ageRatings the age ratings
     */
    public void setAgeRatings(List<Integer> ageRatings){
		this.ageRatings = ageRatings;
	}

    /**
     * Get age ratings list.
     *
     * @return the list
     */
    public List<Integer> getAgeRatings(){
		return ageRatings;
	}

    /**
     * Set franchises.
     *
     * @param franchises the franchises
     */
    public void setFranchises(List<Integer> franchises){
		this.franchises = franchises;
	}

    /**
     * Get franchises list.
     *
     * @return the list
     */
    public List<Integer> getFranchises(){
		return franchises;
	}

    /**
     * Set game engines.
     *
     * @param gameEngines the game engines
     */
    public void setGameEngines(List<Integer> gameEngines){
		this.gameEngines = gameEngines;
	}

    /**
     * Get game engines list.
     *
     * @return the list
     */
    public List<Integer> getGameEngines(){
		return gameEngines;
	}

    /**
     * Set version title.
     *
     * @param versionTitle the version title
     */
    public void setVersionTitle(String versionTitle){
		this.versionTitle = versionTitle;
	}

    /**
     * Get version title string.
     *
     * @return the string
     */
    public String getVersionTitle(){
		return versionTitle;
	}

    /**
     * Set version parent.
     *
     * @param versionParent the version parent
     */
    public void setVersionParent(int versionParent){
		this.versionParent = versionParent;
	}

    /**
     * Get version parent int.
     *
     * @return the int
     */
    public int getVersionParent(){
		return versionParent;
	}

    /**
     * Set keywords.
     *
     * @param keywords the keywords
     */
    public void setKeywords(List<Integer> keywords){
		this.keywords = keywords;
	}

    /**
     * Get keywords list.
     *
     * @return the list
     */
    public List<Integer> getKeywords(){
		return keywords;
	}

    /**
     * Set aggregated rating count.
     *
     * @param aggregatedRatingCount the aggregated rating count
     */
    public void setAggregatedRatingCount(int aggregatedRatingCount){
		this.aggregatedRatingCount = aggregatedRatingCount;
	}

    /**
     * Get aggregated rating count int.
     *
     * @return the int
     */
    public int getAggregatedRatingCount(){
		return aggregatedRatingCount;
	}

    /**
     * Set storyline.
     *
     * @param storyline the storyline
     */
    public void setStoryline(String storyline){
		this.storyline = storyline;
	}

    /**
     * Get storyline string.
     *
     * @return the string
     */
    public String getStoryline(){
		return storyline;
	}

    /**
     * Set total rating.
     *
     * @param totalRating the total rating
     */
    public void setTotalRating(double totalRating){
		this.totalRating = totalRating;
	}

    /**
     * Get total rating double.
     *
     * @return the double
     */
    public double getTotalRating(){
		return totalRating;
	}

    /**
     * Set total rating count.
     *
     * @param totalRatingCount the total rating count
     */
    public void setTotalRatingCount(int totalRatingCount){
		this.totalRatingCount = totalRatingCount;
	}

    /**
     * Get total rating count int.
     *
     * @return the int
     */
    public int getTotalRatingCount(){
		return totalRatingCount;
	}

    /**
     * Set aggregated rating.
     *
     * @param aggregatedRating the aggregated rating
     */
    public void setAggregatedRating(double aggregatedRating){
		this.aggregatedRating = aggregatedRating;
	}

    /**
     * Get aggregated rating double.
     *
     * @return the double
     */
    public double getAggregatedRating(){
		return aggregatedRating;
	}

    /**
     * Set rating.
     *
     * @param rating the rating
     */
    public void setRating(int rating){
		this.rating = rating;
	}

    /**
     * Get rating int.
     *
     * @return the int
     */
    public int getRating(){
		return rating;
	}

    /**
     * Set rating count.
     *
     * @param ratingCount the rating count
     */
    public void setRatingCount(int ratingCount){
		this.ratingCount = ratingCount;
	}

    /**
     * Get rating count int.
     *
     * @return the int
     */
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