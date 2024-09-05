public class RecursiveBinarySearch {

    public void play(){
        int[] arr = {1,5,6,9,10};
        System.out.println(search(arr, 0, 4, 9));
    }

    private int search(int[] arr, int start, int end, int key){
        if(start>end)
            return -1;
        int mid = (start+end)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            return search(arr, start, mid-1, key);
        else
            return search(arr, mid+1, end, key);
    }
}


