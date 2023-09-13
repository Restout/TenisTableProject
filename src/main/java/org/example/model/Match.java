package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    private int id;
    @OneToOne
    @JoinColumn(name = "Player.ID")
    private Player firstPlayerId;
    @OneToOne
    @JoinColumn(name = "Player.ID")
    private Player secondPlayerId;
    @OneToOne
    @JoinColumn(name = "Player.ID")
    private Player winnerId;
}
