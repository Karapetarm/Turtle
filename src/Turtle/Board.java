package Turtle;

public class Board {
    private int boardLength;
    private int boardWidth;
    private boolean [][] board;

    private int boardX ;
    private int boardY ;

    Board(int boardLength, int boardWidth){
        setBoardLength(boardLength);
        setBoardWidth(boardWidth);
        newBoard(boardLength,boardWidth);
    }

    boolean[][] getBoard() {
        return board;
    }

    void newBoard(int x, int y) {
        board =new boolean[x][y];
    }

    public void setPoint(boolean b) {
       board[boardX][boardY]=b;
    }

    public boolean getPoint(){
        return board[boardX][boardY];
    }

    public int getBoardLength() {
        return boardLength;
    }

    public Board setBoardLength(int boardLength) {
        this.boardLength = boardLength;
        return this;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public Board setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
        return this;
    }

    public int getBoardY() {
        return boardY;
    }

    public Board setBoardY(int boardY) {
        this.boardY = boardY;
        return this;
    }

    public int getBoardX() {
        return boardX;
    }

    public Board setBoardX(int boardX) {
        this.boardX = boardX;
        return this;
    }
}
