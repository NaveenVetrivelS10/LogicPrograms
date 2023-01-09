package Logicpros;

import java.util.*;

public class Merge {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4};int ci = 0;
		int[] b= {5,6,7,8};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			
			c[ci]=a[i];
			ci++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[ci]=b[j];
			ci++;
		}
		System.out.println(Arrays.toString(c));

	}

}
