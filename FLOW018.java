/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    while(n-->0){
	        int a=sc.nextInt();
	        int fact=1;
	        for(int i=1;i<=a;i++){
	            fact*=i;
	        }
	        System.out.println(fact);
	    }
	}
}
