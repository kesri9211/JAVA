package Stack;
import java.util.*;
public class reversestack {
    int top=-1;
    void push(char ch,char stack[]){
        top++;
        stack[top]=ch;
       // System.out.print(ch+" ");
    }
    void pop(char stack[]){
        System.out.print(stack[top]+" ");
        top--;
    }

    public static void main(String[] args) {
        String str="KESRI IS HERE";
        int n=str.length();
        char stack[]=new char[n];
        reversestack obj=new reversestack();
        int f=0;
        for(int i=0;i<n;i++){

            char c=str.charAt(i);
            if(c!=' ') {
                obj.push(c, stack);
                f++;
            }
            else{
                System.out.println();
                for(int j=0;j<f;j++){
                    obj.pop(stack);
                }
                f=0;
            }
        }
        System.out.println();
        //edge case: TO print last word
        for(int j=0;j<f;j++){
            obj.pop(stack);
        }
    }
}
