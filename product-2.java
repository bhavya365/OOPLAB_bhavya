import java.util.*;
public class product{
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product[] p=new product[3];
for(int i=0;i<3;i++)
{
	p[i]=new product();
        System.out.println("Enter the product name:");
        p[i].pname=sc.next();
        System.out.println("Enter the product code:");
	p[i].pcode=sc.nextInt();
        System.out.println("Enter the price:");
	p[i].price=sc.nextInt();
	
}

if(p[0].price<p[1].price)
{
	if(p[0].price<p[2].price)
	System.out.println(p[0].price+" is smallest price");
	else
	System.out.println(p[1].price+" is smallest price");
}
else if(p[1].price<p[2].price)
System.out.println(p[1].price+" is smallest price");
else
System.out.println(p[2].price+" is smallest price");
}	
}	


************************************************************************************************************************



OUTPUT


C:\Users\hp\Desktop\program>javac product.java

C:\Users\hp\Desktop\program>java product
Enter the product name:
pencil
Enter the product code:
105
Enter the price:
100
Enter the product name:
book
Enter the product code:
108
Enter the price:
500
Enter the product name:
calculator
Enter the product code:
208
Enter the price:
1000
100 is smallest price
