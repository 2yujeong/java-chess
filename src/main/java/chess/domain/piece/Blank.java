package chess.domain.piece;

import chess.domain.Column;
import chess.domain.Position;
import chess.domain.Row;
import chess.domain.Team;
import java.util.EnumMap;
import java.util.List;

public class Blank extends Piece {

    public Blank(Team team, Position position) {
        super(team, position);
    }

    @Override
    public double getScore() {
        return 0;
    }

    public static EnumMap<Column, Piece> of(int row, Team team) {
        EnumMap<Column, Piece> blanks = new EnumMap<>(Column.class);
        for (Column column : Column.values()) {
            blanks.put(column, new Blank(team, Position.from(column.getValue() + String.valueOf(row))));
        }
        return blanks;
    }

    @Override
    public List<Position> findPath(Position destination) {
        throw new IllegalArgumentException("Blank는 움직일 수 없습니다.");
    }

    @Override
    public boolean isBlank() {
        return true;
    }

    @Override
    public void move(Position destination) {
        throw new IllegalArgumentException("Blank는 움직일 수 없습니다.");
    }
}