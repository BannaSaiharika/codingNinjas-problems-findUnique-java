import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Hashset{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(h.contains(arr.get(i)))
              return arr.get(i);
            h.add(arr.get(i));
        }
        return 0;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	ArrayList<Integer> arr=new ArrayList<>();
    	for(int i=0;i<n;i++)
    	{
    		int l=sc.nextInt();
    		arr.add(l);
    	}
    	int s=findDuplicate(arr,n);
    	System.out.println(s);
    	System.out.println(2&4);
    }
}
//input:n=5,arr=[1,3,2,2,4]
//output:2 find Duplicate in array