create Table Players
(
    ID   INT primary key AUTO_INCREMENT,
    Name varchar
);
create table Matches
(
    ID      INT primary key AUTO_INCREMENT,
    Player1 INT,
    Player2 INT,
    Winner  INT,
    CONSTRAINT player_first_fk FOREIGN KEY (Player1) REFERENCES Players (ID) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT player_second_fk FOREIGN KEY (Player2) REFERENCES Players (ID) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT player_first_win FOREIGN KEY (Winner) REFERENCES Players (ID) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE INDEX idx_Name
    ON Players (Name);