package model;

import java.util.Scanner;

public class Player {
    private final Scanner input = new Scanner(System.in);

    public int makeGuess() {
        if (input.hasNextInt()) {
            return input.nextInt();
        } else {
            return makeGuess();
        }
    }

}
