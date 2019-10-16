
import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class PracticeString {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String a=sc.next();
		    String b=sc.next();
		    StringBuilder sb=new StringBuilder();
		    sb.append(a+b);
		    sb.reverse();
		    System.out.println(sb);
		}
	}
}