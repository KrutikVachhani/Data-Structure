import java.util.*;
import java.io.*;

    	class prime
    	{
    		public static void main(String[] args) 
    		{
    			Scanner sc=new Scanner (System.in);
    			System.out.println("Enter the number");
    			int n= sc. nextInt();
    			boolean flag=true;
    			for(int i=2;i<=n/2;i++)
    			{
					if(n%i==0){
						flag=false;
						break;
					}
				}
    				if(flag)
    				{
    					System.out.println("Number is Prime");
    				}

    				else
    				{
    					System.out.println("Number is Not Prime");
    				}
    			}
    		}
    	