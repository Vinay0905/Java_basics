import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
        Arrays.sort(arr);
        int n=arr.length;
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(secondsmallest(arr,n));
        System.out.println(secondlargest(arr,n));
    }
    static private int secondsmallest(int[] arr, int n){
        if(n<2)return -1;
        int smallest=Integer.MAX_VALUE;
        int second_smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                second_smallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second_smallest && arr[i]!= smallest){
                second_smallest=arr[i];
            }    
        }
        return second_smallest;
        
    }
    static private int secondlargest(int[] arr, int n){
        if(n<2)return -1;
        int Largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>Largest){
                second_largest=Largest;
                Largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!= Largest){
                second_largest=arr[i];
            }    
        }
        return second_largest;
        
    }
    
}
