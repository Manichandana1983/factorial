package factprg;
import java.util.Scanner;
public class Fact {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter any number:");
	int num=obj.nextInt();
	int fact=1;
	for(int i=1; i<=num; i++) {
		fact=fact*i;
	}
	System.out.println("The factorial of given is"+num+"is:"+fact);
	}

}
