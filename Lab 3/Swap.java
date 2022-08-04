import java.util.*;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int n2 = sc.nextInt();
		swap();
	}
     
	public static void swap(int n1, int n2){
        n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("1st number : "+n1);
		System.out.println("2nd number : "+n2);
	}
}

