package Questions;
//https://practice.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1
public class Maximum_Equal_Sum {
    public static int maxEqualSum(int N1, int N2, int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int s1 = 0, s2 = 0, s3 = 0;
        for (int x : S1) s1 += x;
        for (int x : S2) s2 += x;
        for (int x : S3) s3 += x;

        //
        int i = 0;
        int j = 0;
        int k = 0;
        while (true) {
            //all elements traversed - base con
            if (i == N1 || j == N2 || k == N3) return 0; //not poss

            if (s1 == s2 && s2 == s3) return s3;

            //remove elements from where the sum is bigger.
            if (s1 >= s2 && s1 >= s3)
                s1 -= S1[i++];
            else if (s2 >= s1 && s2 >= s3)
                s2 -= S2[j++];
            else s3 -= S3[k++];
        }
    }
}
