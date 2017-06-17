package ua.bank;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 1000;
		
		System.out.println("Press 1 for check your balance.");
		System.out.println("Press 2 for take your money.");
		System.out.println("Press 3 for add money into your balance.");
		System.out.println("Press 4 to exit.");
		
		int user=0;
		do{	
				user = scanner.nextInt();
				switch (user){
					case 1:{
						System.out.println("Your current balance = "+balance+"$");
						break;}
					case 2:{
						System.out.println("How much money you want to get?");
						if(scanner.hasNextInt()){
						user = scanner.nextInt();
							if(user<=balance){
							balance = balance - user;
							System.out.println("Your current balance now = "+balance+"$");
							}else{System.out.println("You can't get more than "+balance+"$");
								System.out.println("Try again.");}
							}else{
								System.out.println("Your input is incorrect.");}
						break;}
					case 3:{
						System.out.println("How much money you want to put into your balance?");
						if(scanner.hasNextInt()){
						user = scanner.nextInt();
						balance = balance + user;
						System.out.println("Your current balance now = "+balance+"$");
						}else{System.out.println("Your input is incorrect.");}
						break;}
					case 4:{
						scanner.close();
						break;}
					default:{
						System.out.println("Your input is incorrect.");
						break;}
					}
			}while((user != 4));
		scanner.close();
		
		
		
		
	}

}
