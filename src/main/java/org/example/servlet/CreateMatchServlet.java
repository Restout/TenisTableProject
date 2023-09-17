package org.example.servlet;

import org.example.model.MatchDTO;
import org.example.model.Player;
import org.example.service.OngoingMatchService;
import org.example.service.PlayerMatchService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/new-match")
public class CreateMatchServlet extends HttpServlet {
    private final PlayerMatchService playerMatchService = new PlayerMatchService();
    OngoingMatchService ongoingMatchService = OngoingMatchService.getINSTANCE();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/createMatchPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fPlayerName = req.getParameter("player1");
        String sPlayerName = req.getParameter("player2");
        Player player1 = new Player(fPlayerName);
        Player player2 = new Player(sPlayerName);
        UUID uuid = UUID.randomUUID();
        MatchDTO ongoingMatch = new MatchDTO(uuid, player1, player2);
        ongoingMatchService.setOngoingMatch(ongoingMatch);
        resp.sendRedirect("/match-score?uuid=" + uuid);

    }
}
