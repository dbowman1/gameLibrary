package com.dustinbowman.utilities;

import com.dustinbowman.entity.Game;
import com.dustinbowman.entity.User;
import com.dustinbowman.persistence.GenericDao;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class GamesDB {

    public int convertIdToInt(String stringId) {
        return parseInt(stringId);
    }

    public boolean userHasGamesInLibrary(User user) {
        boolean haveGames = false;
        if(user.getGames().size() > 0 ) {
            haveGames = true;
        }
        return haveGames;
    }

    public List<Integer> userGameIdList(Boolean haveGames, User user) {
        List<Integer> gameIds = new ArrayList<>();
        if (haveGames) {
            for (Game game : user.getGames()) {
                gameIds.add(game.getGameId());
            }
        }
        return gameIds;
    }

    public List<Game> getGameFromGameId(String stringId) {
        GenericDao gDao = new GenericDao(Game.class);
        int id = convertIdToInt(stringId);
        return gDao.findByPropertyEqual("gameId", id);
    }

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


    public Game getGameFromReq(String gameId) {
        List<Game> games = getGameFromGameId(gameId);
        return games.get(0);
    }

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
