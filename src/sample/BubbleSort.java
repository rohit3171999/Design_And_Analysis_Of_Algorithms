package sample;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp, j;
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (j=0; j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={44,12,99,56,19,40,69,35,27};
        bubbleSort(arr);
    }
}
