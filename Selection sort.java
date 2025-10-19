import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        System.out.println("Selection Sort");
        selection_sort(arr,n);
        
    }
    static void selection_sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                } 
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    
}
