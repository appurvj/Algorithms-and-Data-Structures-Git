public class MergeSort{
    public static void mergesort(int[] arr, int start, int end, int[] scratch){
        if(end - start > 1){
            int mid = start + (end - start)/2;
            mergesort(arr, start, mid, scratch);
            mergesort(arr, mid, end, scratch);
            int scratchLen = end - start;
            int p = start, q = mid;
            for(int i = 0; i < scratchLen; i++)
                scratch[i] = p < mid && (q >= end || arr[p] < arr[q])?arr[p++]:arr[q++];
            for(int i = start; i < end; i++)
                arr[i] = scratch[i - start];
        }
    } 

    public static void main(String[] args){
        int array[] = {1,5,2,6,3,4,8};
        mergesort(array, 0, array.length, new int[array.length] );
        for(int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
