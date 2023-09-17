package org.example.service;

import org.example.model.MatchDTO;

import java.util.HashMap;
import java.util.UUID;

public class OngoingMatchService {
    private static OngoingMatchService INSTANCE;
    private final HashMap<UUID, MatchDTO> ongoingMatchesMap = new HashMap<>();

    private OngoingMatchService() {
    }

    public static OngoingMatchService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new OngoingMatchService();
        }
        return INSTANCE;
    }

    public MatchDTO setOngoingMatch(MatchDTO match) {
        return ongoingMatchesMap.put(match.getId(), match);
    }
}
