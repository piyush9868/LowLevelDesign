package designs.TicTacToe;

public class Board {
    int size;
    int currFilled;
    PlayingPiece[][] grid;

    public Board(int size, PlayingPiece[][] grid) {
        currFilled = 0;
        this.size = size;
        this.grid = grid;
    }

    public void printGrid() {
        for (int i = 0; i < size; i++) {
            String line = "|";
            for (int j = 0; j < size; j++) {
                if (grid[i][j] != null)
                    line += grid[i][j].pieceType.toString();
                else {
                    line += " ";
                }
                line += "|";
            }
            System.out.println(line);
        }
    }

    public boolean addPiece(int x, int y, Player currPlayer) {
        if (grid[x][y] != null) {
            return false;
        }
        currFilled++;
        grid[x][y] = currPlayer.playingPiece;
        return true;
    }

    public boolean didPlayerWin(int row, int col, Player currPlayer) {

        //check horizontally
        boolean rowFlag = false;
        for (int j = 0; j < size; j++) {
            if (grid[row][j] == null || grid[row][j].pieceType != currPlayer.playingPiece.pieceType) {
                rowFlag = true;
                break;
            }
        }
        if (!rowFlag) return true;


        //check vertically
        boolean colFlag = false;
        for (int i = 0; i < size; i++) {
            if (grid[i][col] == null || grid[i][col].pieceType != currPlayer.playingPiece.pieceType) {
                colFlag = true;
                break;
            }
        }
        if (!colFlag) return true;

        //check diagonally
        boolean diagFlag = false;
        for (int i = 0; i < size; i++) {
            if (grid[i][i] == null || grid[i][i].pieceType != currPlayer.playingPiece.pieceType) {
                diagFlag = true;
                break;
            }
        }
        if (!diagFlag) {
            return true;
        }

        //check anti-diagonal
        boolean otherDiagFlag = false;
        for (int i = 0, j = size - 1; i < size && j >= 0; i++, j--) {
            if (grid[i][j] == null || grid[i][j].pieceType != currPlayer.playingPiece.pieceType) {
                otherDiagFlag = true;
                break;
            }
        }
        if (!otherDiagFlag) {
            return true;
        }

        return false;
    }

    public boolean isFull() {
        return currFilled == size*size;
    }
}
