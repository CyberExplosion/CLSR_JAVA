public class BubbleSort{
    static int num[] = {9, 4, 1, 7, 0};

    public static void sort(int arr[]){
        for(int i = 0; i < arr.length; ++i){
            for(int j = arr.length - 1; j > i; --j){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String arg[]){
        sort(num);
        for(int val : num)
            System.out.print(val + " ");
    }
}