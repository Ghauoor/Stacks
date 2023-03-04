package Questions;

import java.util.Stack;


public class The_Celebrity_Problem {
    private boolean knows(int[][] relationships, int personA, int personB, int n) {
        if (relationships[personA][personB] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int celebrity(int[][] relationships, int n) {
        Stack<Integer> candidateStack = new Stack<>();

        // Step 1: Push all people onto the stack
        for (int i = 0; i < n; i++) {
            candidateStack.push(i);
        }

        // Step 2: Compare pairs of people and remove the one who is not a celebrity candidate
        while (candidateStack.size() > 1) {
            int personA = candidateStack.peek();
            candidateStack.pop();

            int personB = candidateStack.peek();
            candidateStack.pop();

            if (knows(relationships, personA, personB, n)) {
                candidateStack.push(personB);
            } else {
                candidateStack.push(personA);
            }
        }

        int celebrityCandidate = candidateStack.peek();

        // Step 3: Check if the candidate is a celebrity
        int zeroCount = 0;

        // Row check
        for (int i = 0; i < n; i++) {
            if (relationships[celebrityCandidate][i] == 0) {
                zeroCount++;
            }
        }

        // All zeroes
        if (zeroCount != n) {
            return -1;
        }

        // Column check
        int oneCount = 0;

        for (int i = 0; i < n; i++) {
            if (relationships[i][celebrityCandidate] == 1) {
                oneCount++;
            }
        }

        if (oneCount != n - 1) {
            return -1;
        }

        return celebrityCandidate;
    }
}

