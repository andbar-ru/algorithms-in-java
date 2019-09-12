// This program takes three integer command-line arguments and prints "equal" if all three are
// equal, and "not equal" otherwise.
public class Exercise113 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        if (n1 == n2 && n2 == n3)
            StdOut.println("equal");
        else
            StdOut.println("not equal");
    }
}

