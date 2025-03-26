/* this is a fun little tick tac toe game learned from my Udemy Coursework program, and my code to practice.
 */
package TikTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Array that controls the X and O positions on the board
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        int input;

        // we need to alternate turns for the user between x and o, so we implement a variable called "turn"
        char turn = 'X';
        int currentTurn = 1;

        //loop to make it continue while player continues to add positions:
        while (true) {
            do {
                System.out.print("Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            //array would go from 1-9 from user POV but the array ranges from 1-8, so we -1, to adjust the position entered by the user/
            pos[input - 1] = turn;


            // print line that displays the position of the X and O
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            // we need to check after each turn if X or O is the winner, as for the reason of this "if" loop:
            if (pos[0] == turn && pos[1] == turn && pos[2] == turn  // win condition (first row)
                    ||pos[3] == turn && pos[4] == turn && pos[5] == turn // 2nd win condition (middle row)
                    ||pos[6] == turn && pos[7] == turn && pos[8] == turn // 3rd win condition (top row)
                    ||pos[6] == turn && pos[3] == turn && pos[0] == turn  // 4th win condition (1st column)
                    ||pos[7] == turn && pos[4] == turn && pos[1] == turn // 5th win condition (2nd column)
                    ||pos[8] == turn && pos[5] == turn && pos[2] == turn // 6th win condition (3rd column)
                    ||pos[6] == turn && pos[4] == turn && pos[2] == turn // diagonal win condition
                    ||pos[8] == turn && pos[4] == turn && pos[0] == turn) { // Diagonal win condition
                System.out.println(turn + " is the WINNER!"); // prints out the winner based on the "turn" variable
                break; // ends the program once the winner is determined.
            }
                if (turn == 'X') {
                    turn = 'O';
                } else if (turn == 'O') {
                    turn = 'X';
                }
                currentTurn++;
                if (currentTurn > 9){
                    System.out.println("Draw! There is no winner.");
                    break;
                }
            }
        }
    }

