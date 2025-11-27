public class App {
    public static void main(String[] args) {
        int num = 6;
        System.err.println("Squar Hollow Pattern");
        squareHollowPattern(num);
        System.out.println();

        System.out.println("Number Tringle Pattern Pattern");
        numberTrianglePattern(num);
        System.out.println();

        System.out.println("Number Increasing Pyramid Pattern");
        numberIncreasingPyramidPattern(num);
        System.out.println();

        System.out.println("Number Increasing reverse Pyramid Pattern");
        numberIncreasingReversePyramidPattern(num);
        System.out.println();

        System.out.println("Number Changing  Pyramid Pattern");
        numberChangingPyramidPattern(num);
        System.out.println();

    }

    public static void squareHollowPattern(int num) {
        for (int i = 1; i <= num; i++) {

            // first and last row -> print all stars
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            } else {
                // middle rows -> print star, spaces, star
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == num) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println(); // move to next line
        }
    }

    public static void numberTrianglePattern(int n) {
        int i, j;

        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {

            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    public static void numberIncreasingPyramidPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }

    public static void numberIncreasingReversePyramidPattern(int n) {
        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numberChangingPyramidPattern(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
}
