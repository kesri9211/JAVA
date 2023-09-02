public class Main
{
    static void swap(int ar[],int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    
    static int partion(int ar[],int st,int end){
        int pivot=ar[st];
        int c=0;
        //count number less than equal to pivot
        for(int i=st+1;i<=end;i++){
            if(ar[i]<=pivot) c++;
        }
        //find pivot index
        int pivindex=st+c;
        //swap start and pivot index
        swap(ar,st,pivindex);
        //rearrange element before and after pivot index
        int i=st;
        int j=end;
        while(i<pivindex && j>pivindex){
            while(ar[i]<=pivot) i++;   //skip number which are less than pivot on left side
            while(ar[j]>pivot) j--; //skip number which are less than pivot on right side
            
            /*otherwise swap such that all number on left side of pivot is smaller and all number on 
            right side is greator than pivot*/
            if(i<pivindex && j>pivindex){
            swap(ar,i,j);
            i++;j--;
            }
        }
        return pivindex;
    }
    
    static void quicksort(int ar[],int st,int end){
            if(st>=end)
            return;
       int pi=partion(ar,st,end);
       quicksort(ar,st,pi-1);
       quicksort(ar,pi+1,end);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		int ar[]={1,4,4,7,7,3,2};
		quicksort(ar,0,ar.length-1);
		for(int i:ar)
		System.out.print(i+" ");
	}
}
