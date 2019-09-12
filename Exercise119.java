// Write a code fragment that puts the binary representation of a positive integer N into a String s.
public class Exercise119 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        StdOut.println(s);
    }
}

