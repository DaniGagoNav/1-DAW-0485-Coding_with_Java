import java.util.*;

public class HundirLaFlota {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[][] board1 = new String[10][10];
        String[][] board2 = new String[10][10];

        // Initialize boards with water
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++) {
                board1[i][j] = "~";
                board2[i][j] = "~";
            }

        int[] ships = {5, 4, 3, 3, 2};

        // Place ships independently on both boards
        for (int x = 0; x < ships.length; x++) placeShip(board1, ships[x], rand);
        for (int x = 0; x < ships.length; x++) placeShip(board2, ships[x], rand);

        int sunken1 = 0, sunken2 = 0, attempts1 = 0, attempts2 = 0;
        boolean playerOneTurn = true;

        while (sunken1 < 17 && sunken2 < 17) {
            if (playerOneTurn) {
                System.out.println("\n>>> Player 1 turn (shoot BOARD 2) <<<");
                attempts1 += playerTurn(board2, sc);
                sunken1 = countSunken(board2);
            } else {
                System.out.println("\n>>> Player 2 turn (shoot BOARD 1) <<<");
                attempts2 += playerTurn(board1, sc);
                sunken2 = countSunken(board1);
            }
            playerOneTurn = !playerOneTurn; // switch turn
        }

        if (sunken1 == 17) System.out.println("\nPlayer 1 sunk all ships! Attempts: " + attempts1);
        else System.out.println("\nPlayer 2 sunk all ships! Attempts: " + attempts2);

        sc.close();
    }

    // Count X's on the board
    public static int countSunken(String[][] board) {
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                if (board[i][j].equals("X")) count++;
        return count;
    }

    // One turn for a player, returns 1 attempt
    public static int playerTurn(String[][] board, Scanner sc) {
        System.out.print("Row (1-10): ");
        int r = sc.nextInt() - 1;
        System.out.print("Column (1-10): ");
        int c = sc.nextInt() - 1;

        if (r < 0 || r >= 10 || c < 0 || c >= 10) {
            System.out.println("Out of the board!");
            return 0;
        }

        if (board[r][c].equals("B")) {
            System.out.println("Sunken!");
            board[r][c] = "X";
        } else if (board[r][c].equals("~")) {
            System.out.println("Water");
            board[r][c] = "O";
        } else {
            System.out.println("You already shot here");
        }

        // Print board after move
        System.out.print("   "); for (int i = 1; i <= 10; i++) System.out.print(i + " "); System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 10; j++) System.out.print(board[i][j] + " ");
            System.out.println();
        }

        return 1; // counts as one attempt
    }

    // Place a ship randomly on a board
    public static void placeShip(String[][] board, int length, Random rand) {
        boolean placed = false;
        while (!placed) {
            int row = rand.nextInt(10);
            int col = rand.nextInt(10);
            boolean horizontal = rand.nextBoolean();
            boolean free = true;

            if (horizontal) {
                if (col + length <= 10) {
                    for (int y = 0; y < length; y++)
                        if (!board[row][col + y].equals("~")) free = false;
                    if (free) {
                        for (int y = 0; y < length; y++) board[row][col + y] = "B";
                        placed = true;
                    }
                }
            } else {
                if (row + length <= 10) {
                    for (int y = 0; y < length; y++)
                        if (!board[row + y][col].equals("~")) free = false;
                    if (free) {
                        for (int y = 0; y < length; y++) board[row + y][col] = "B";
                        placed = true;
                    }
                }
            }
        }
    }
}
