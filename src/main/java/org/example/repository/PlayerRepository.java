package org.example.repository;

import org.example.model.Player;

public class PlayerRepository implements CRUDRepository<Player> {
    @Override
    public Player findById(int id) {
        return null;
    }

    @Override
    public void save(Player entity) {

    }

    @Override
    public void update(Player entity) {

    }

    @Override
    public void delete(Player entity) {

    }
}
