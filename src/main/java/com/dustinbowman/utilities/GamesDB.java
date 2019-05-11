package com.dustinbowman.utilities;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * The type Games db.
 */
public class GamesDB {

    /**
     * Convert id to int int.
     *
     * @param stringId the string id
     * @return the int
     */
    public int convertIdToInt(String stringId) {
        return parseInt(stringId);
    }

    /**
     * User has games in library boolean.
     *
     * @param user the user
     * @return the boolean
     */
    public boolean userHasGamesInLibrary(User user) {
        boolean haveGames = false;
        if(user.getGames().size() > 0 ) {
            haveGames = true;
        }
        return haveGames;
    }

    /**
     * User game id list list.
     *
     * @param haveGames the have games
     * @param user      the user
     * @return the list
     */
    public List<Integer> userGameIdList(Boolean haveGames, User user) {
        List<Integer> gameIds = new ArrayList<>();
        if (haveGames) {
            for (Game game : user.getGames()) {
                gameIds.add(game.getGameId());
            }
        }
        return gameIds;
    }

    /**
     * Gets game from game id.
     *
     * @param stringId the string id
     * @return the game from game id
     */
    public List<Game> getGameFromGameId(String stringId) {
        GenericDao gDao = new GenericDao(Game.class);
        int id = convertIdToInt(stringId);
        return gDao.findByPropertyEqual("gameId", id);
    }

    /**
     * Add game to user string.
     *
     * @param games    the games
     * @param user     the user
     * @param gameName the game name
     * @param id       the id
     * @return the string
     */
    public String addGameToUser(List<Game> games, User user, String gameName, int id) {
        GenericDao gDao = new GenericDao(Game.class);
        UsersDB uDb = new UsersDB();
        String msg;
        if(games.size() > 0) {
            if(!user.getGames().contains(games.get(0))) {
                Game game = games.get(0);
                user.addGame(game);
                uDb.saveOrUpdateUser(user);
                msg = gameName + " added to your library.";
            } else {
                msg = gameName + " is already in your library.";
            }
        } else {
            Game game = new Game();
            game.setGameId(id);
            user.addGame(game);
            gDao.insert(game);
            uDb.saveOrUpdateUser(user);
            msg = gameName + " added to your library.";
        }
        return msg;
    }


    /**
     * Gets game from req.
     *
     * @param gameId the game id
     * @return the game from req
     */
    public Game getGameFromReq(String gameId) {
        List<Game> games = getGameFromGameId(gameId);
        return games.get(0);
    }

    /**
     * Remove game from user string.
     *
     * @param userName the user name
     * @param gameId   the game id
     * @param gameName the game name
     * @return the string
     */
    public String removeGameFromUser(String userName, String gameId, String gameName) {
        String msg;
        UsersDB uDb = new UsersDB();
        User user = uDb.getUserFromReq(userName);
        Game game = getGameFromReq(gameId);

        if(user.getGames().contains(game)) {
            user.removeGame(game);
            uDb.saveOrUpdateUser(user);
            msg = gameName + " was successfully removed from your library.";
        } else {
            msg = gameName + " does not exist in your library.";
        }
        return msg;
    }

    /**
     * Remove all games from user string.
     *
     * @param user the user
     * @return the string
     */
    public String removeAllGamesFromUser(User user) {
        UsersDB uDb = new UsersDB();
        String msg;
        if (user.getGames().size() > 0) {
            user.removeAll();
            uDb.saveOrUpdateUser(user);
            msg = "All games have been removed...";
        } else {
            msg = "No Games in library...";
        }
        return msg;
    }

    /**
     * Game in users library boolean.
     *
     * @param user   the user
     * @param gameId the game id
     * @return the boolean
     */
    public boolean gameInUsersLibrary(User user, int gameId) {
        boolean userHasGame = false;
        for (Game game : user.getGames()) {
            if (game.getGameId() == gameId) {
                userHasGame = true;
                break;
            }
        }
        return userHasGame;
    }

}
