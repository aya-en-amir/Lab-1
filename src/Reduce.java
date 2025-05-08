public class Reduce {
    public static void main(String[] args) {
        int steps = getSteps();
        System.out.println(steps);
    }

    private static int getSteps() {
        int i = 100;
        int steps = 0;
        while (i != 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i--;
            }
            steps++;
        }
        return steps;
    }
}
