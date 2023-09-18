/*Q2. Write a program(c/c++/JAVA) that will determine which value in the stack is the smallest and
  move that value to the top of the stack while otherwise leaving the remainder of the stack in its original order.*/
package Stack;
public class Smallest {
int top=-1;
int ar[]=new int[5]; //array to store pop element
int i=0; //index of array
int min =Integer.MAX_VALUE; //store minimum of stack static int stack[] = new int[5];
   void push(int data,int stack[]){
       top++;
       stack[top]=data;
   }
   //store element into separate array
   void add(int t){
ar[i++]=t; }
   void pop(int stack[]){
       int t=stack[top--];
       if(t< min)
min =t; //find minimum from stack System.out.print(t+" ");
add(t);
}
   void ques(){
       for(int i=4;i>=0;i--){
if(ar[i]!= min) //push only those which are not equal to minimum number
push(ar[i],stack);
}
stack[++top]= min; //put minimum on top to stack
System.out.println("\nresult"); for(int f:stack)
} }
System.out.print(f+" ");
public static void main(String[] args) {
}
    Smallest s=new Smallest();
s.push(5, stack); s.push(7, stack); s.push(6, stack); s.push(2, stack); s.push(9, stack);
for(int i=0;i<5;i++) s.pop(stack); s.ques();
