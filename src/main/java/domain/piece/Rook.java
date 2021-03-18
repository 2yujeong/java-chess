package domain.piece;

import domain.position.Position;

import java.util.List;

public class Rook extends Division{
    public Rook(Color color, Position position) {
        super(color, "r", position);
    }

    @Override
    public void move(Position to, Pieces pieces) {
        if (position.isOrthogonal(to)) {
            List<Position> positions = position.getBetween(to);
            for (Position position1 : positions) {
                if (pieces.hasPieceOf(position1)) {
                    throw  new IllegalArgumentException();
                }
            }
            position = to;
        }
    }

    @Override
    public void kill(Position to, Pieces pieces) {
        move(to, pieces);
    }
}
