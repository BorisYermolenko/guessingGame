package model;

public class Game {

    private int targetNumber;

    public Game() {
        targetNumber = createNumber();
    }

    public int createNumber() {
        return (int) (Math.random() * 10) + 1;
    }

    public String guess(int number) {
        String result;
        if (targetNumber == number) {
            result = "угадал";
        } else if (number > targetNumber) {
            result = "меньше";
        } else {
            result = "больше";
        }
        return result;
    }

}
