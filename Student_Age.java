import java.util.Scanner;
class Student_Age
{
public static void main(String args[])
{
int temp=0;
int arr[]=new int[5];
Scanner sr=new Scanner(System.in);
for(int i=0;i<5;i++)
{
	arr[i]=sr.nextInt();
}
int yr[]=new int[5];

for(int i=0;i<5;i++)
{
  yr[i]=2024-arr[i];
}
System.out.println("Before Sort :");
for(int i=0;i<5;i++)
{
System.out.println(+yr[i]);
}

for(int i=0;i<5;i++)
{
for(int j=i+1;j<5;j++)
{
 if(yr[i]<yr[j])
{
temp=yr[i];
yr[i]=yr[j];
yr[j]=temp;
}
}
}
System.out.println("After Sorting: ");
for(int i=0;i<5;i++)
{
	if(arr[i]<2024)
	{
		System.out.println(""+yr[i]);
	}
	else
	{
	System.out.println("Please! Enter less than 2024 Year of Birth");
	}
}
}
}
