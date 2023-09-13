package org.example.repository;

import org.example.model.Match;

import java.util.UUID;

public class MatchRepository implements CRUDRepository<Match> {
    @Override
    public Match findById(UUID id) {
        return null;
    }

    @Override
    public void save(Match entity) {

    }

    @Override
    public void update(Match entity) {

    }

    @Override
    public void delete(Match entity) {

    }
}
