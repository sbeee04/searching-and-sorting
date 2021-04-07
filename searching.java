package searching;


import java.io.*;
import java.util.*;
class Search
{
    public static void main(String args[])throws IOException
    {
        Scanner s=new Scanner(System.in);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        do
        {
            System.out.println("\n1.Linear Search\n2.Binary Search\n3.Exit");
            System.out.println("SELECT YOUR SEARCHING METHOD");
            ch=s.nextInt();//Integer.parseInt(br.readLine());
            if(ch==3)
                return;
            System.out.println("Enter the number of terms");
            int n=s.nextInt();//Integer.parseInt(br.readLine());
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();//Integer.parseInt(br.readLine());
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");//Integer.parseInt(br.readLine());
            }
            System.out.println();

            System.out.println("Enter number to be searched");
            int num=s.nextInt();//Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    LinearSearch(a,n,num);
                    break;
                case 2:
                    BinarySearch(a,n,num);
                    break;

            }
        }
        while(ch!=3);
    }

    public static void LinearSearch(int a[],int n,int num)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                System.out.println(num+" found at "+(i+1)+"th position");
                return;
            }
        }
        System.out.println(num+" not found");
    }
    public static void BinarySearch(int a[],int n,int num)
    {
        int first=0;
        int last=n;
        int mid=(first+last)/2;
        while(first!=last)
        {
            if(a[mid]==num)
            {
                System.out.println(num+" found at "+(mid+1)+"th position");
                return;
            }
            if(a[mid]<num)
            {
                first=mid+1;
                last=n;
                mid=(first+last)/2;
            }
            else
            {
                first=0;
                last=mid-1;
                mid=(first+last)/2;
            }
        }
        System.out.println(num+" not found");
    }
}
