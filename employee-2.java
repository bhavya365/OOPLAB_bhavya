import java.util.Scanner;

public class employee {
	int eNo,eSalary;
	String eName;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] em=new employee[3];
		System.out.println("Enter the Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee No:");
			em[i]=new employee();
			em[i].eNo=sc.nextInt();
                        System.out.println("Enter employee Salary:");
			em[i].eSalary=sc.nextInt();
                        System.out.println("Enter employee Name:");
			em[i].eName=sc.next();
		}
		System.out.println("Enter the eNo:");
		int eNoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eNo==eNoo)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found");
			}
		}


	}

}


*******************************************************************************************************************


OUTPUT


C:\Users\hp\Desktop\program>javac employee.java

C:\Users\hp\Desktop\program>java employee
Enter the Limit
2
Enter employee No:
1
Enter employee Salary:
30000
Enter employee Name:
rohan
Enter employee No:
2
Enter employee Salary:
20000
Enter employee Name:
krish
Enter the eNo:
2
Employee found

