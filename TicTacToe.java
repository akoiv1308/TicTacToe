public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
   private int turn;
   private String[][] board;
    
    TicTacToe() {
        board = new String[3][3];
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                board[r][c] = "-";
            }
        }
        this.turn = turn;
    }
    
    public String[][] getBoard() {
        return board;
    }
   
   //this method returns the current turn
   public int getTurn()
   {
       return turn;
   }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println("  0 1 2");
       for(int r = 0; r<board.length; r++) {
           System.out.print(r + " ");
           for(int c = 0; c<board[0].length; c++) {
               System.out.print(board[r][c] + " ");
           }
          System.out.println();
       }
   }
   
  //This method returns true if space row, col is a valid space
  public boolean pickLocation(int row, int col)
  {
      if((row >= 0 && row<board.length) && (col >= 0 && col<board.length)) {
          if(!board[row][col].equals("X") && !board[row][col].equals("O")) {
              return true;
          }
      }
      return false;
  }
   
  //This method places an X or O at location row,col based on the int turn
  public void takeTurn(int row, int col)
  {
      if(turn % 2 == 0) {
          board[row][col] = "X";
          turn++;
      }
      else {
          board[row][col] = "O";
          turn++;
      }
  }
   
  //This method returns a boolean that returns true if a row has three X or O's in a row
  public boolean checkRow()
  {
      for(int i = 0; i < board.length; i++) {
          if(board[i][0].equals("X") || board[i][0].equals("O")) {
              if((board[i][0].equals(board[i][1])) && (board[i][1].equals(board[i][2]))) {
                  return true;
              }
          }
      }
      return false;
      
  }
   
    //This method returns a boolean that returns true if a col has three X or O's
  public boolean checkCol()
  {
      for(int i = 0; i < board.length; i++) {
          if(board[0][i].equals("X") || board[0][i].equals("O")) {
              if((board[0][i].equals(board[1][i])) && (board[1][i].equals(board[2][i]))) {
                  return true;
              }
          }
      }
      return false;
  }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
  public boolean checkDiag()
  {
      if(board[0][0].equals("X") || board[0][0].equals("O")) {
          if((board[0][0].equals(board[1][1])) && (board[1][1].equals(board[2][2]))) {
              return true;
          }
      }
      if(board[0][2].equals("X") || board[0][2].equals("O")) {
          if((board[0][2].equals(board[1][1])) && (board[1][1].equals(board[2][0]))) {
              return true;
          }
      }
      return false;
  }
   
  //This method returns a boolean that checks if someone has won the game
  public boolean checkWin()
  {
      if(checkRow() || checkCol() || checkDiag()) {
          return true;
      }
      return false;
      
  }

}
