public class Main {
    public static void main(String[] args) {
        try {
            double inputScore = 2.15;
            double inputScore2 = 50;
            double inputScore3 = 95.02;
            double inputScore4 = 100.01;
            checkScore(inputScore);
            checkScore(inputScore2);
            checkScore(inputScore3);
            checkScore(inputScore4);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error: " + arithmeticException.getMessage());
        }
    }

    public static void checkScore(double score) {
        if (0 < score && score <= 50.00) {
            System.out.println("Average score!");
        } else if (50.00 < score && score <= 100) {
            System.out.println("Very good score!");
        } else {
            throw new ArithmeticException("Score is out of scale");
        }
    }
}

