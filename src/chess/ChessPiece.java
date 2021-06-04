package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int movecount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);

		return p != null && p.color != color;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	public void increaseMoveCount() {
		movecount++;
	}

	public void decreaseMoveCount() {
		movecount--;
	}

	public int getMovecount() {
		return movecount;
	}

	public Color getColor() {
		return color;
	}

}
