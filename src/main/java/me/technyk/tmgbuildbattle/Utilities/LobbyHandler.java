package me.technyk.tmgbuildbattle.Utilities;

import me.technyk.tmgbuildbattle.Classes.Game;

import java.util.ArrayList;
import java.util.List;

public class LobbyHandler {

    public List<Game> gameList = new ArrayList<>();

    public Game createGame(){
        Game newGame = new Game();
        newGame.setState(Game.GameState.WAITING);
        return newGame;
    }

}
