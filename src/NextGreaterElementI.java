// https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean check = false;
        int[] result = new int[nums1.length];
        int cnt = 0;

        for(int i =0; i < nums1.length; i++){
            for(int j=0; j < nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    check = true;
                }

                if(check){
                    if(nums2[j]>nums1[i]){
                        result[cnt++] = nums2[j];
                        check = false;
                    }
                }
            }
            if(check){
                result[cnt++] = -1;
                check = false;
            }
        }

        return result;
    }
}
