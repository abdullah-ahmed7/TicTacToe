import java.util.Scanner;
public class TicTacToe
{
    static char [][] board = new char[3][3];
    static char currentplayer ='x';
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        System.out.println("TicTacToe");
        while(True)
        {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.println("Enter Row (0-2)");
            int row = scanner.nextInt();
            System.out.println("Enter Column (0-2)");
            int col = scanner.nextInt();
            if (isValidMove(row,column))
            {
                System.out.println("Cell already taken!! the cell is already taken or out of range");
                continue;
            }
            board[row][column]=currentplayer;
            if(checkwinner())
            {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins! Congratulations!");
                break;
            }
            if (isBoardFull)
            {
                printBoard();
                System.out.println("Its a draw");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }
    static void initializeBoard()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[rows][column]='-';
            }
        }
    }
    static void printBoard()
    {
        System.out.println("\n 0 1 2");
        for(int i=0;i<3;i++)
        {
            System.out.println(row +" ");
            for (int j=0;j<3;j++){
                System.out.println(" " + board[row][column]);
                if(column<2)
                {
                    System.out.println("|");
                }
                System.out.println();
            }
            if (row < 2) System.out.println("  ---|---|---");
        }
        System.out.println();
    }
    static boolean isValidMove(int row, int col)
    {
        if (row < 0 || row > 2 || col < 0 || col > 2)
        {
            return false;
        }
        return board[row][col] == '-';
    }
    static boolean checkWinner()
    {
        // Check rows
        for (int row = 0; row < 3; row++)
        {
            if (board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer)
            {
                return true;
            }
        }
        for (int col = 0; col < 3; col++)
        {
            if (board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer)
            {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
        {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
        {
            return true;
        }
        return false;
    }




}