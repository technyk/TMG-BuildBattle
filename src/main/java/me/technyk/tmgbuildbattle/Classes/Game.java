package me.technyk.tmgbuildbattle.Classes;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;



public class Game {

    public enum GameState {
        WAITING,
        PLAYING,
        VOTING
    }

    GameState gameState = GameState.WAITING;
    List<Player> playerList = new ArrayList<>();


    public List<Player> getPlayers(){ return playerList;}

    public void addPlayer(Player p){
        getPlayers().add(p);
    }

    public void removePlayer(Player p){
        getPlayers().remove(p);
    }

    public GameState getState(){return gameState;}

    public void setState(GameState gameState){this.gameState = gameState;}
}
