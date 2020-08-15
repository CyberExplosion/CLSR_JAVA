/* Selection Sort:                  cost        time
n = A.length                        c1          1
for i = 1 TO n - 1                  c2          n - 1
    minIndex = i;                   c3          n - 1 - 1
    for j = i + 1 TO n              c4         (sigma from i = 1 TO n - 1)(n - (i + 1))
        if(A[j] < A[minIndex])      c4         (sigma from i = 1 to n - 1)(n - (i + 1) - 1)
            minIndex = j            c4         (sigma from i = 1 to n - 1)(n - (i + 1) - 1)
    swap(A[minIndex], A[i])         c5          n - 1 - 1
 */
/*
Loop Invariant:
    At begining of each loop, the sub array of range [1..i-1]
    consist of smallest i - 1 elements in the Array in sorted order
Why only first n - 1 elements, rather than all n?
    After n - 1 iteration, the subArray [1..n-1] consist of 
    the smallest n - 1 elements in the Array in sorted order.
    That leave the n elements the largest
Running time:

 */
public class Ex2 {
    static public Integer[] arr = { 1, 0, 3, 2, 5, 4 };

    static void selectSort(Integer [] arr){
        for(int i = 0; i < arr.length - 1; ++i){
            int min = i;
            for(int j = i + 1; j < arr.length; ++j){
                if(arr[j] < arr[min])
                    min = j;
            }
            swap(min, i, arr);
        }
    }

    private static void swap(Integer i, Integer j, Integer [] arr) {
        //Let i = -1, j = 1
        if(arr[i] == arr[j])
            return;
        arr[i] ^= arr[j]; //i = (-1)(1) = -1  --> Call this the "difference"
        arr[j] ^= arr[i]; //j = (1)(-1) = -1
        arr[i] ^= arr[j]; //i = (-1)(-1) = 1
        //In binary twiddiling. When one value XOR with the difference
        //It will get the "others" value.
        //It's like "difference of (-1) & 1 = (-1)"
    }

    public static void main(String[] args) {
        selectSort(arr);
        for(int val : arr)
            System.out.print(val + " ");
    }
}