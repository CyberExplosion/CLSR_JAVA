// package Insertion_Sort

//Test sorted out an array of integers
public class Ex1{
    static public int [] arr = {31, 41, 59, 26, 41, 58};

     static void sort(int [] arr){
        for(int i = 1; i < arr.length; ++i){
            int key = arr[i];
            int left = i - 1;
            while(left >= 0 && arr[left] > key){
                arr[left + 1] = arr[left];
                --left;
            }
            arr[left + 1] = key;
        }
    }
}