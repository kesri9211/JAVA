//refer copy for question
public class Main
{
    static int sum(int ar[]){
        int sum=0;
        for(int a:ar){
            sum+=a;
        }
        //System.out.println(sum);
        return sum;
    }
    
    static int distributeChoco(int ar[], int s) {
    int st = 1;
    int end = sum(ar); // Sum of all chocolates in array ar
    int min = 0;
    
    while (st <= end) {
        int mid = st + (end - st) / 2;
        int currentStudents = 0;
        int currentChocolates = 0;
        
        for (int i = 0; i < ar.length; i++) {
            if (currentChocolates + ar[i] <= mid) {
                currentChocolates += ar[i];
            } else {
                currentStudents++;
                currentChocolates = ar[i];
            }
        }
        
        // After loop, check if we need more students to distribute all chocolates
        if (currentChocolates > 0) {
            currentStudents++;
        }
        
        if (currentStudents <= s) {
            min = mid;
            end = mid - 1;
        } else {
            st = mid + 1;
        }
    }
    
    return min;
}

	public static void main(String[] args) {
		int ar[]={5,3,1,4,2};
		int s=3;
		System.out.println(distributeChoco(ar,s));
}
}
