//Non-increasing order = decreasing order

public class Ex2 {
    static public int[] arr = { 31, 41, 59, 26, 41, 58 };

    static public void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int left = i - 1;
            while (left >= 0 && arr[left] < key) {
                arr[left + 1] = arr[left];
                --left; 
            }
            arr[left + 1] = key;
        }
    }

    static public void main(String [] args){
        sort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}