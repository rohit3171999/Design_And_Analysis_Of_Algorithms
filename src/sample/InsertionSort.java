package sample;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int temp;
        int n= arr.length;
        int j;
        for (int i = 1; i <n; i++) {
            temp=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +  " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {29, 1, 66, 53, 56, 38, 99, 101, 4, 73, 28};
        insertionSort(arr);
    }
}

