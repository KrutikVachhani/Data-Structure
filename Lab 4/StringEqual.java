import java.util.*;

class stack{
    char a[]=new char[100];

    public int top=-1;
    
    public void push(char n){
        if(top>=99){
            System.out.println("Stack is full");
        }
        else{
            top++;
            a[top]=n;
            //System.out.println(a[top]);
        }
    }

    public void pop(){
        if(top<=-1){
            System.out.println("stack is empty");
        }
        else{
            char element=a[top];
            top--;
        }

    }
}
public class StringEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();

        String str =sc.nextLine();
        int n=str.length();

        int c=0;
        for(int i=0;i<n;i++){
            char d=str.charAt(i);
            if(d=='a'){
                s.push(d);
            }
            else{
                c++;
            }
        }
        while(s.top!=-1){
            s.pop();
            c--;
        }
        if(c==0){
            System.out.println("string is valid");
        }
        else{
            System.out.println("string is not valid");
        }
    }
}

