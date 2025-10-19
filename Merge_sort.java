import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        
        mergesort(arr,0,n-1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    static void Merge(int arr[],int low , int mid, int high){
        List<Integer>temp=new ArrayList<>();
        int left=low,right=mid+1;
        
        
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        // Add remaining left elements
        while (left <= mid)
            temp.add(arr[left++]);

        // Add remaining right elements
        while (right <= high)
            temp.add(arr[right++]);

        // Copy back to original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
         
    }
    static void mergesort(int arr[], int low, int high){
        if(low>=high)return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        Merge(arr,low,mid,high);
        
    }
    
}
