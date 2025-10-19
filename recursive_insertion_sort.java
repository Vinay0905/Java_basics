import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        System.out.println("Selection Sort");
        insertion_sort(arr,0,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void insertion_sort(int arr[],int i,int n){
        if(i==n)return;
        int j=i;
        
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;

        }
        insertion_sort(arr,i+1,n);
        
    }
    
}
