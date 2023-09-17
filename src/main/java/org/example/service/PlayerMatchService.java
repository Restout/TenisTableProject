package org.example.service;

import lombok.NoArgsConstructor;
import org.example.model.Match;
import org.example.model.Player;
import org.example.repository.MatchRepository;
import org.example.repository.PlayerRepository;
import org.hibernate.HibernateException;

@NoArgsConstructor
public class PlayerMatchService {
    private final PlayerRepository playerRepository = new PlayerRepository();
    private final MatchRepository matchRepository = new MatchRepository();

    public boolean playerWithNameExist(String name)  {
        return playerRepository.existByName(name) != null;
    }

    public void createPlayer(Player player) {
        playerRepository.save(player);
    }

    public void createMatch(Match match) {
        matchRepository.save(match);
    }
}
