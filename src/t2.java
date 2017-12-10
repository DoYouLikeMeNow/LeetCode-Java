public class t2 {
    public long subarraySum(int[] arr){
        /*
        long sum = 0;

        if(arr.length>0 && arr.length<=200000) {

            for (int i = 0; i < arr.length; i++)
                if(arr[i]>0 && arr[i]<=1000) {
                    sum += (arr[i] * (i + 1) * (arr.length - i));
                }
        }

        return sum ;
        */

        long sum = 0;

        if(arr.length>0 && arr.length<=200000) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>0 && arr[i]<=1000) {
                    for (int j = i; j < arr.length; j++) {

                        for (int k = i; k <= j; k++)
                            sum += arr[k];
                    }
                }
            }
        }
        return sum ;
    }
}
