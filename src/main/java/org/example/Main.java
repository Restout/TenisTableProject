package org.example;

import org.example.model.Player;
import org.example.repository.PlayerRepository;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player = new Player( "Pavel");
        PlayerRepository ps = new PlayerRepository();
        ps.save(player) ;
        ps.findById(player.getId());
        System.out.println("player = " + player);
    }
}