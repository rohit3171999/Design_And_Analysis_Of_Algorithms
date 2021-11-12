public class LinearSearch {
    public static int linearSearch(int arr[], int x){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={44,23,65,98,15,87,65,45};
        int x=65;
        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}
