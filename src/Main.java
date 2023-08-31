public class Main {
    public static void checkScore(double score) {
        if (0 < score && score <= 50.00) {
            System.out.println("Average score!");
        } else if (50.00 < score && score <= 100) {
            System.out.println("Very good score!");
        } else {
            throw new ArithmeticException("Score is out of scale");
        }
    }

    public static void main(String[] args) {
        try {
            // double inputScore = 2.15;
            //double inputScore = 50;
            //double inputScore = 95.02;
             double inputScore = 100.01;
            checkScore(inputScore);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error: "+arithmeticException.getMessage());
        }
    }
}

