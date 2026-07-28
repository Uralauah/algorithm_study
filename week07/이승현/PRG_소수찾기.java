import java.util.*;

class Solution {
    private boolean[] isPrime;
    private boolean[] visited;
    private int[] digits;
    private Set<Integer> answers;

    private void dfs(int currentNumber) {
        boolean[] usedDigit = new boolean[10];

        for (int i = 0; i < digits.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (usedDigit[digits[i]]) {
                continue;
            }

            usedDigit[digits[i]] = true;
            visited[i] = true;

            int nextNumber = currentNumber * 10 + digits[i];

            if (isPrime[nextNumber]) {
                answers.add(nextNumber);
            }

            dfs(nextNumber);

            visited[i] = false;
        }
    }

    private boolean[] createPrimeTable(int limit) {
        boolean[] prime = new boolean[limit];
        Arrays.fill(prime, true);

        prime[0] = false;

        if (limit > 1) {
            prime[1] = false;
        }

        for (int i = 2; i * i < limit; i++) {
            if (!prime[i]) {
                continue;
            }

            for (int multiple = i * i; multiple < limit; multiple += i) {
                prime[multiple] = false;
            }
        }

        return prime;
    }

    public int solution(String numbers) {
        int length = numbers.length();
        int limit = (int) Math.pow(10, length);

        isPrime = createPrimeTable(limit);
        visited = new boolean[length];
        digits = new int[length];
        answers = new HashSet<>();

        for (int i = 0; i < length; i++) {
            digits[i] = numbers.charAt(i) - '0';
        }

        dfs(0);

        return answers.size();
    }
}