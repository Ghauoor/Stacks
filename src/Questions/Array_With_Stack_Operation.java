package Questions;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/build-an-array-with-stack-operations/description/
public class Array_With_Stack_Operation {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int curr = 1;

        for (int i = 0; i < target.length; i++) {
            res.add("Push");

            if (target[i] != curr) {
                res.add("Pop");
                i--;
            }
            curr++;
        }
        return res;
    }
}
