package Ques;
import java.util.Scanner;
public class DupliWithFreq {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
		  count=1;

			for(int j=i+1;j<n;j++)
			{
			if(arr[i]==arr[j])
			{
				count++;
				if(count>=1)
				{
					arr[j]=0;
				}

			}
			}
			if(count>=1 && arr[i]!=0)
			{
			System.out.println("frequency of"+" "+arr[i]+" : "+count);
			}
		}

	}

}
