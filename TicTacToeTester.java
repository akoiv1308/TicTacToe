import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        
        System.out.println("Welcome to TicTacToe!");
        
        TicTacToe game = new TicTacToe();
        System.out.println();
        game.printBoard();
        Scanner input = new Scanner(System.in);
        
        
        int row = 0;
        int col = 0;
        boolean run = true;
        
        while(run) {
            
            System.out.println("\nEnter index (row first, column second): ");
            
            row = input.nextInt();
            col = input.nextInt();
            
            if(game.pickLocation(row, col)) {
                game.takeTurn(row, col);
            }
            else {
                System.out.println("\nSorry, this location is occupied. Please enter another coordinates!");
            }
            
            game.printBoard();
            
            if(game.checkWin()) {
                if(game.getTurn() % 2 == 1) {
                    System.out.println("Player X won!");
                }
                else if(game.getTurn() % 2 == 0) {
                    System.out.println("Player O won!");
                }
                else {
                    System.out.println("It's a tie!");
                }
                System.out.println("Thanks for playing :)");
                run = false;
            }
            
        }
        
        
    }
}
