package chess;

import boardGame.BoardException;

public class ChessException extends BoardException {
    public static final long serialVersionUID = 1l;
    
    public ChessException(String msg){
        super(msg);
    }
}
