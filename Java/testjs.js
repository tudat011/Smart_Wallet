/* package whatever; // don't place package name! */



import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner (System.in);
System.out.print("Nhập vào số nguyên n = ");
int n=sc.nextInt();
int g=0;
int p=0;
int gi=0;
if (n>=3600) g=n/3600;
if ((n-(g*3600))>=60) p=(n-(g*3600))/60;
gi=(n-(g*3600)-(p*60));
System.out.println("Số giờ: "+g);
System.out.println("Số phút: "+p);
System.out.println("Số giây: "+gi);
sc.close();
}
}