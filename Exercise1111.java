// Write a code fragment that prints the contents of a two-dimensional boolean array, using
// "*" to represent `true` and a space to represent `false`. Include row and column numbers.
public class Exercise1111 {
    public static void main(String[] args) {
        int rows = StdRandom.uniform(1, 100);
        int cols = StdRandom.uniform(1, 100);
        boolean[][] a = new boolean[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = StdRandom.bernoulli();

        // Print column numbers
        if (cols >= 10) {
            StdOut.print("            ");
            for (int i = 10; i <= cols; i++) {
                StdOut.print(i / 10);
            }
        }
        StdOut.println();
        StdOut.print("   ");
        for (int i = 1; i <= cols; i++) {
            StdOut.print(i % 10);
        }
        StdOut.println();
        StdOut.println();

        // Print rows
        for (int i = 0; i < rows; i++) {
            // row number
            StdOut.printf("%2d ", i+1);

            for (int j = 0; j < cols; j++) {
                boolean value = a[i][j];
                if (value)
                    StdOut.print('*');
                else
                    StdOut.print(' ');
            }
            StdOut.println();
        }
    }
}

