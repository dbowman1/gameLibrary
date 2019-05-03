package com.igdb.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

/**
 * The type Game results.
 */
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
    public void setVideos(List<VideosItem> videos){
		this.videos = videos;
	}

    /**
     * Get videos list.
     *
     * @return the list
     */
    public List<VideosItem> getVideos(){
		return videos;
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
     * Set screenshots.
     *
     * @param screenshots the screenshots
     */
    public void setScreenshots(List<ScreenshotsItem> screenshots){
		this.screenshots = screenshots;
	}

    /**
     * Get screenshots list.
     *
     * @return the list
     */
    public List<ScreenshotsItem> getScreenshots(){
		return screenshots;
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
    public void setCover(Cover cover){
		this.cover = cover;
	}

    /**
     * Get cover cover.
     *
     * @return the cover
     */
    public Cover getCover(){
		return cover;
	}

    /**
     * Set themes.
     *
     * @param themes the themes
     */
    public void setThemes(List<ThemesItem> themes){
		this.themes = themes;
	}

    /**
     * Get themes list.
     *
     * @return the list
     */
    public List<ThemesItem> getThemes(){
		return themes;
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
    public void setReleaseDates(List<ReleaseDatesItem> releaseDates){
		this.releaseDates = releaseDates;
	}

    /**
     * Get release dates list.
     *
     * @return the list
     */
    public List<ReleaseDatesItem> getReleaseDates(){
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
    public void setArtworks(List<ArtworksItem> artworks){
		this.artworks = artworks;
	}

    /**
     * Get artworks list.
     *
     * @return the list
     */
    public List<ArtworksItem> getArtworks(){
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
    public void setWebsites(List<WebsitesItem> websites){
		this.websites = websites;
	}

    /**
     * Get websites list.
     *
     * @return the list
     */
    public List<WebsitesItem> getWebsites(){
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

	@Override
 	public String toString(){
		return 
			"GameResults{" + 
			"franchise = '" + franchise + '\'' + 
			",keywords = '" + keywords + '\'' + 
			",similar_games = '" + similarGames + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",videos = '" + videos + '\'' + 
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
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			",hypes = '" + hypes + '\'' + 
			",franchises = '" + franchises + '\'' + 
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
			"}";
		}
}