package Questions;

import java.util.Arrays;
import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
//https://www.codingninjas.com/codestudio/problems/next-smaller-element_1112581?leftPanelTab=0
public class Next_Smallest_Element {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int n = arr.length;

        System.out.println(Arrays.toString(help_classmate(arr, n)));
    }

    public static int[] help_classmate(int arr[], int n) {
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        s.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            while (s.peek() >= curr) {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(curr);
        }
        return ans;
    }
}
