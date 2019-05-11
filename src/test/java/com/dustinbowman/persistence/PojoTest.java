package com.dustinbowman.persistence;

import com.dustinbowman.entity.Game;
import com.igdb.api.*;
import org.junit.jupiter.api.Test;

import static com.google.code.beanmatchers.BeanMatchers.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * The type Pojo test.
 */
public class PojoTest {

    /**
     * Test art work.
     */
    @Test
    public void testArtWork() {
        assertThat(ArtworksItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test cover.
     */
    @Test
    public void testCover() {
        assertThat(Cover.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test game results.
     */
    @Test
    public void testGameResults() {
        assertThat(GameResults.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test platforms item.
     */
    @Test
    public void testPlatformsItem() {
        assertThat(PlatformsItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test release dates.
     */
    @Test
    public void testReleaseDates() {
        assertThat(ReleaseDatesItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test screen shots.
     */
    @Test
    public void testScreenShots() {
        assertThat(ScreenshotsItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test themes.
     */
    @Test
    public void testThemes() {
        assertThat(ThemesItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test video.
     */
    @Test
    public void testVideo() {
        assertThat(VideosItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test websites.
     */
    @Test
    public void testWebsites() {
        assertThat(WebsitesItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test similar game.
     */
    @Test
    public void testSimilarGame() {
        assertThat(SimilarGamesItem.class, allOf(
                hasValidBeanConstructor(),
                hasValidGettersAndSetters(),
                hasValidBeanHashCode(),
                hasValidBeanEquals(),
                hasValidBeanToString()
        ));
    }

    /**
     * Test game.
     */
    @Test
    public void testGame() {
        assertThat(Game.class, hasValidGettersAndSetters());
    }
}
