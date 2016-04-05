package fibonaccittree;

public class FibonacciTree {

    public static long nodesRecursive(long n) {
        if (n <= 1) {
            return 1;
        }
        return 1 + nodes(n - 1) + nodes(n - 2);
    }

    public static long nodes(long n) {
        if (n <= 1) {
            return 1;
        }
        long prev = 1;
        long current = 3;
        for (long i = 2; i < n; i++) {
            long next = (1 + current + prev) % 1000000007; // f(n) = 1 + f(n - 1) + f(n - 2)
            prev = current;
            current = next;
        }
        return current;
    }
}
