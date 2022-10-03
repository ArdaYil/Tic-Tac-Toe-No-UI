

package source;

import java.util.Scanner;

public class App {
    static byte[] corners = {0, 2, 6, 8};
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        while (true) {
            game();
        }
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4
    }
}

<<<<<<< HEAD
// public class App {
//     public static void main(String[] args) {
//         char[] board = {'-', '-', '-','-', '-', '-', '-', '-', '-'};

//         while (true) {
//             board = gameTurn(board);
//         }
//     }

//     public static String[] newGame() {
//         String[] newGame = {};

//         return newGame;
//     }

//     public static String[] initPlayer() {
//         String[] player = {};
=======
    private static void game() {
        char[] board = {'-', '-', '-','-', '-', '-', '-', '-', '-'};

        while (true) {
            board = gameTurn(board);
        }
    }

    private static void intro() {
        System.out.println("Welcome to Tic Tac Toe. Press enter");
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//         return player;
//     }

<<<<<<< HEAD
//     public static void intro() {
//         System.out.println("Welcome to Tic Tac Toe. Press enter");
=======
    private static char[] gameTurn(char[] board) {
        displayBoard(board);
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//         Scanner newScanner = new Scanner(System.in);
//         newScanner.nextLine();
//     }

//     public static char[] gameTurn(char[] board) {
//         displayBoard(board);

//         byte position = promptTurn();
//         board = placeCharacter(board, 'X', position);

<<<<<<< HEAD
//         byte aiPosition = aiTurn(board);
//         board = placeCharacter(board, 'O', (byte)(aiPosition + 1));

//         return board;
//     }
=======
    private static void displayBoard(char[] board) {
        System.out.println(
            board[0] + " | " + board[1] + " | " + board[2] + "\n" + 
            board[3] + " | " + board[4] + " | " + board[5] + "\n" + 
            board[6] + " | " + board[7] + " | " + board[8]
        );
    }

    private static byte promptTurn(){
        String message = "Pick a number between 1-9";
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//     public static void displayBoard(char[] board) {
//         System.out.println(
//             board[0] + " | " + board[1] + " | " + board[2] + "\n" + 
//             board[3] + " | " + board[4] + " | " + board[5] + "\n" + 
//             board[6] + " | " + board[7] + " | " + board[8]
//         );
//     }

//     public static byte promptTurn(){
//         String message = "Pick a number between 1-9";

//         System.out.print(message + ": ");

<<<<<<< HEAD
//         Scanner prompt = new Scanner(System.in);
//         byte position = prompt.nextByte();
=======
    private static char[] placeCharacter(char[] board, char character, byte position) {
        if (isEmpty(board, (byte)(position - 1))) {
            board[position - 1] = character;
        }
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//         return position;
//     }

<<<<<<< HEAD
//     public static char[] placeCharacter(char[] board, char character, byte position) {
//         if (isEmpty(board, (byte)(position - 1))) {
//             board[position - 1] = character;
//         }
=======
    private static boolean hasWon(char[] board, char character) {
        boolean rule1 = board[0] == character && board[1] == character && board[2] == character;
        boolean rule2 = board[3] == character && board[4] == character && board[5] == character;
        boolean rule3 = board[6] == character && board[7] == character && board[8] == character;
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//         return board;
//     }

//     public static boolean hasWon(char[] board, char character) {
//         boolean rule1 = board[0] == character && board[1] == character && board[2] == character;
//         boolean rule2 = board[3] == character && board[4] == character && board[5] == character;
//         boolean rule3 = board[6] == character && board[7] == character && board[8] == character;

//         boolean rule4 = board[0] == character && board[3] == character && board[6] == character;
//         boolean rule5 = board[1] == character && board[4] == character && board[7] == character;
//         boolean rule6 = board[2] == character && board[5] == character && board[8] == character;

<<<<<<< HEAD
//         boolean rule7 = board[0] == character && board[4] == character && board[8] == character;
//         boolean rule8 = board[2] == character && board[4] == character && board[6] == character;
=======
    private static Boolean isCorner(byte position) {
        for (byte corner : corners) {
            if (position != corner) continue;

            return true;
        }

        return false;
    }

    private static byte aiTurn(char[] board) {
        char[] characters = {'O', 'X'};
        byte[] edges = {1, 3, 5, 7};
        char[] copy = board.clone();
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4

//         return rule1 || rule2 || rule3 || rule4 || rule5 || rule6 || rule7 || rule8;
//     }

//     public static byte aiTurn(char[] board) {
//         char[] characters = {'O', 'X'};
//         byte[] corners = {0, 2, 6, 8};
//         byte[] edges = {1, 3, 5, 7};
//         char[] copy = board.clone();

//         for (byte i = 0; i < 2; i++) {
//             for (byte v = 0; v < board.length; v++) {
//                 if (copy[v] != '-') continue;

//                 copy[v] = characters[i];

//                 if (hasWon(copy, characters[i])) {
//                     return v;
//                 }

//                 else {
//                     copy[v] = '-';
//                 }
//             }
//         }

//         for (byte i = 0; i < corners.length; i++) {
//             if (board[i] != '-') continue;

//             return corners[i];
//         }

//         for (byte i = 0; i < edges.length; i++) {
//             if (board[i] != '-') continue;

<<<<<<< HEAD
//             return edges[i];
//         }

//         return -1;
//     }

//     public static boolean isEmpty(char[] board, byte position) {
//         return board[position] == '-';
//     }
// }
=======
    private static boolean isEmpty(char[] board, byte position) {
        return board[position] == '-';
    }
}
>>>>>>> 7c3897ba6aeed9d1fddad52cb740daa3e8edc9a4
