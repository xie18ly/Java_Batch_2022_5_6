package AssignmentOne;

import java.util.Arrays;

public class MergeTwoArray {
    public MergeTwoArray(){

    }

    public MergeTwoArray(int[]arrayA, int[]arrayB){
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        MergeTwoSortedArrays(arrayA,arrayB);
    }

    public void MergeTwoSortedArrays(int[]nums1, int[]nums2){
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m+n];
        while(p3 < m+n){
            if(p2 >= n || (p1<m && nums1[p1]<nums2[p2])){
                res[p3] = nums1[p1++];
            } else{
                res[p3] = nums2[p2++];
            }
            p3++;
        }
        System.out.println(Arrays.toString(res));
    }
}
