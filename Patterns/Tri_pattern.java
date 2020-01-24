package Patterns;
import java.io.*;
import java.util.*;

public class Tri_pattern 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size n=");
		int n=Integer.parseInt(br.readLine());
		System.out.println("The size is:"+n);
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}

}
