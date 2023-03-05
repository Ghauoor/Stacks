package Questions;

import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/max-rectangle/1
public class Max_Rectangle {
    private int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    private int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    private int largestRectangleArea(int[] heights, int n) {
        int[] next = nextSmallerElement(heights, n);
        int[] prev = prevSmallerElement(heights, n);
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (next[i] == -1) {
                next[i] = n;
            }
            int l = heights[i];
            int b = next[i] - prev[i] - 1;
            int newArea = l * b;
            area = Math.max(area, newArea);
        }
        return area;
    }

    public int maxArea(int[][] M, int n, int m) {
        int area = largestRectangleArea(M[0], m);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] != 0) {
                    M[i][j] += M[i - 1][j];
                } else {
                    M[i][j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea(M[i], m));
        }
        return area;
    }
}

// All code is same for leetcode version of question bit changing is
//Code for Leet Code version of question
//https://leetcode.com/problems/maximal-rectangle/
class Solution {

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;

        int[][] M = new int[n][m];
        for (int i = 0; i < m; i++) {
            M[0][i] = matrix[0][i] - '0';
        }

        int area = largestRectangleArea(M[0]);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    M[i][j] = M[i - 1][j] + 1;
                }
            }
            area = Math.max(area, largestRectangleArea(M[i]));
        }
        return area;
    }

    //This method is same as above method
    private int largestRectangleArea(int[] ints) {
        return -1;
    }
}

