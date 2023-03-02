package Questions;

import java.util.Stack;
//https://leetcode.com/problems/largest-rectangle-in-histogram/
public class Largest_Area_Of_Histogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
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
}
