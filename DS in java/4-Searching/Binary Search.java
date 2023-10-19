package Searching;
import java.util.*;
public class BinarySearch {
    static int  BinarySearch(int ar[],int l,int r){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        while(l<r){
            int mid=(l+r)/2;
            if(ar[mid]==s)return mid;
            else if(ar[mid]>s)
                r=mid-1;
            else if(ar[mid]<s)
                l=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int f=BinarySearch(ar,0,ar.length);
        if(f==-1) System.out.println("not found");
        else System.out.println("found at "+f);
    }
}
