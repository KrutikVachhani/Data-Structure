import java.util.*;

import javax.xml.transform.Templates;

 class Stack{
    int n;
    int a[]=new int[100];
    int top=-1;

    public void push(int n){
        if(top>=100){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            a[top]=n;
            System.out.println(a[top]);
        }
    }
    public void pop(){
        if(top<=-1){
            System.out.println("Stack Underflow");
        }
        else{
            int p=a[top];
            top--;
            System.out.println(p);
        }
    }
    public void peep(int n){
        if(top-n+1<=-1){
            System.out.println("Stack Underflow");
        }
        else{
            int pe=a[top-n+1];
            System.out.println(pe);
        }
    }
    public void change(int i,int n){
        if(top-i+1<=-1){
            System.out.println("Stsck Underflow");
        }
        else{
            a[top-i+1]=n;
        }
    }
    public void display(){
        if(top<=-1){
            System.out.println("Stack Empty");
        }
        else{
            while(top!=-1){
                System.out.println(a[top]);
                top--;
            }
        }
    }
}
    public class StackOperations{
        public static void main(String[] args) {
            //Scanner sc=new Scanner(System.in);

            Stack S=new Stack();

            S.push(10);
            S.push(20);
            S.push(30);
            S.push(40);
            S.pop();
            S.peep(20);
            S.change(1, 40);
            S.display();

        }
    }

