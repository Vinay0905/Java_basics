import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int n=3;
        System.out.print(search(arr,n));
    }    
    public static int search(int arr[],int n){
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]==n)return i;
        }
        return -1;
    }
        
        
    
    
}
