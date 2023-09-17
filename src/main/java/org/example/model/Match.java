package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "Player1", referencedColumnName = "id")
    private Player firstPlayerId;
    @ManyToOne
    @JoinColumn(name = "Player2", referencedColumnName = "id")
    private Player secondPlayerId;
    @ManyToOne
    @JoinColumn(name = "Winner", referencedColumnName = "id")
    private Player winnerId;
}
