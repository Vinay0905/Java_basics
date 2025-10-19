import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        System.out.println("Selection Sort");
        bubble_sort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
            
        }
         
    }
    static void bubble_sort(int arr[],int n){
        if(n==1)return;
            
        
        for(int j=0;j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        
       bubble_sort(arr,n-1);
        
    }
    
}
