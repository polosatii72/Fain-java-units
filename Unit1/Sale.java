import java.util.Scanner;

public class Sale{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	do{
		System.out.println("\n Enter list price:");
		double listPrice = input.nextDouble();
		
		System.out.println("Enter discount %:");
		int discount = input.nextInt();
		
		System.out.printf("You will pay only $%2.4f", listPrice - listPrice*discount/100);
		
	}while(true);
	
		
	}

}