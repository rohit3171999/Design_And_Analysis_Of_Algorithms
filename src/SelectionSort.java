public class SelectionSort {
    public static void selectionSort(int arr[]){
        int temp;
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j =i+1; j <n ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,87,465,1,756,387,36,29,9};
        selectionSort(arr);
    }
}
