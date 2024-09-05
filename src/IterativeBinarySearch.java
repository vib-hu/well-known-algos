public class IterativeBinarySearch {

    public void play(){
        int[] arr = {1,5,6,9,10};
        System.out.println(search(arr, 0, 4, -1));
    }

    private int search(int[] arr, int start, int end, int key){
      while(start<=end){
          int mid = (start+end)/2;
          if(arr[mid]==key)
              return mid;

          if(arr[mid]>key)
              end = mid-1;
          else
              start = mid+1;
      }
      return -1;
    }
}


