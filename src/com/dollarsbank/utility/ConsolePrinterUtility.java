package com.dollarsbank.utility;

public class ConsolePrinterUtility {
	
	//initial user interface
		public static void initialOutput() {
			System.out.println("+---------------------------+");
			System.out.println("| DOLLARSBANK Welcomes You! |");
			System.out.println("+---------------------------+");
			System.out.println("1. Create New Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println();
			System.out.println("Enter Choice (1, 2 or 3) :");
		}
		
		public static void registrationOutput(int i) {
			if(i == 1) {
				System.out.println("+-------------------------------+");
				System.out.println("| Enter Details For New Account |");
				System.out.println("+-------------------------------+");
				System.out.println("Customer Name: ");
			}
			else if(i == 2) {
				System.out.println("Customer Address: ");
			}
			else if(i == 3) {
				System.out.println("Customer Contact Number: ");	
			}
			else if(i == 4) {
				System.out.println("User ID: ");
			}
			else if(i == 5) {
				System.out.println("Password: 8 Characters With Lower, Upper & Special: ");
			}
			else if(i == 6) {
				System.out.println("Initial Deposit Amount: ");
			}
		}
		
		public static void loginOutput(int i) {
			if(i == 1) {
				System.out.println("+---------------------+");
				System.out.println("| Enter Login Details |");
				System.out.println("+---------------------+");
				System.out.println("User Id: ");
			}
			else if(i == 2) {
				System.out.println("Password: ");
			}
		}
		
		public static void validUserOutput() {
			System.out.println("+---------------------+");
			System.out.println("| WELCOME Customer!!! |");
			System.out.println("+---------------------+");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Funds Transfer");
			System.out.println("4. View 5 Recent Transactions");
			System.out.println("5. Display Customer Information");
			System.out.println("6. Sign Out");
			System.out.println();
			System.out.println("Enter Choice (1, 2, 3, 4, 5 or 6) :");
		}
		
		public static void depositOutput(int i) {
			if(i == 1) {
				System.out.println("+------------------+");
				System.out.println("| Deposit Details: |");
				System.out.println("+------------------+");
				System.out.println("Please Enter The Amount You Wish To Deposit:");
			}
			else if(i == 2) {
				System.out.print("Deposit Successful! Current Balance is now: $");
			}
			else if(i == 3) {
				System.out.println("Deposit Unsuccessful! Cannot enter an negative amount!");
			}
			else if(i == 4) {
				System.out.println("Invalid Deposit Amount!");
			}
		}
		
		public static void withdrawOutput(int i) {
			if(i == 1) {
				System.out.println("+---------------------+");
				System.out.println("| Withdrawal Details: |");
				System.out.println("+---------------------+");
				System.out.println("Please Enter The Amount You Wish To Withdraw:");
			}
			else if(i == 2) {
				System.out.print("Withdrawal Successful! Current Balance is now: $");
			}
			else if(i == 3) {
				System.out.println("Withdrawal Unsuccessful! Current Balance is less than desired amount!");
			}
			else if(i == 4) {
				System.out.println("Invalid Withdrawal Amount!");
			}
			else if(i == 5) {
				System.out.println("Withdrawal Unsuccessful! Current balance is less than zero!");
			}
		}
		
		public static void transferOutput(int i) {
			if(i == 1) {
				System.out.println("+-------------------------+");
				System.out.println("| Funds Transfer Details: |");
				System.out.println("+-------------------------+");
				System.out.println("Please Enter The User Id of the person you wish to send money to:");
			}
			else if(i == 2) {
				System.out.println("Please enter the amount you wish to send:");
			}
			else if(i == 3) {
				System.out.println("Invalid Id entered! ");
			}
			else if(i == 4) {
				System.out.print("Money Transfer Successful! Your balance is now: $");		
			}
			else if(i == 5) {
				System.out.println("Invalid Transfer Amount!");
			}
			else if(i == 6) {
				System.out.println("Invalid Transfer Amount! Cannot transfer an amount that is less than or equal to zero!");
			}
			else if(i == 7) {
				System.out.println("Invalid Transfer Amount! Current balance is less than desired amount!");
			}
		}
		
		public static void errorOutput(int i) {
			if(i == 1) {
				System.out.println("Invalid Input. Try Again!");
			}
			else if(i == 2) {
				System.out.println("Password must be atleast 8 characters, have an uppercase, have a lowercase, and special character. Enter a new one: ");
			}
			else if(i == 3) {
				System.out.println("Please enter a positive value.");
			}
			else if(i == 4) {
				System.out.println("Invalid Credentials! Try Again!");
			}
			else if(i == 5) {
				System.out.println("User Id Unavailable. Enter A New One:");
			}
			else if(i == 6) {
				System.out.println("Phone numbers must possess 10 digits!");
			}
		}

}
