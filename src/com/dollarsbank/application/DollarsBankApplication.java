  package com.dollarsbank.application;

import java.util.Scanner;

import com.dollarsbank.controller.DollarsBankController;
import com.dollarsbank.model.Account;
import com.dollarsbank.model.Customer;
import com.dollarsbank.utility.ConsolePrinterUtility;

public class DollarsBankApplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DollarsBankController dbc = new DollarsBankController();
		boolean runApp = true;
		while(runApp) {
			
			ConsolePrinterUtility.initialOutput();
			
			try {
				int choice = Integer.parseInt(scan.nextLine());
				
				//Initial User Interface
				if(choice == 1) {// Create New Account
					ConsolePrinterUtility.registrationOutput(1);
					
					String cust_name = scan.nextLine();
				
					ConsolePrinterUtility.registrationOutput(2);
					
					String cust_address = scan.nextLine();
					
					String phone_num = "";
					while(true) {
						ConsolePrinterUtility.registrationOutput(3); //contact #
						
						phone_num = scan.nextLine();
						if(dbc.validnum(phone_num)) {
							break;
						}
						else {
							
							ConsolePrinterUtility.errorOutput(6);
						}
					}
					
			
					
					String cus_id ="";
					while(true) {
						ConsolePrinterUtility.registrationOutput(4); //user id [unique]
						
						cus_id = scan.nextLine();
						
						if(!dbc.checkUserId(cus_id)) {
							ConsolePrinterUtility.errorOutput(5);
						}
						else {
							break;
						}
					}

					
					String pw;
					while(true) {
						ConsolePrinterUtility.registrationOutput(5);

						pw = scan.nextLine();
						if(!dbc.checkPassValidity(pw)) {
							ConsolePrinterUtility.errorOutput(2);
						}
						else {
							break;
						}
					}
					
					
					double initial_balance;
					while(true) {
						ConsolePrinterUtility.registrationOutput(6);

						try {
							initial_balance = Double.parseDouble(scan.nextLine());
							if(initial_balance>0) {
								break;
							}
							else if(initial_balance <= 0) {
								ConsolePrinterUtility.errorOutput(3);
							}
							else {
								ConsolePrinterUtility.errorOutput(1);
							}
						}
						catch(Exception e) {
							ConsolePrinterUtility.errorOutput(1);
						}
					}
					
					dbc.addCustomer(new Customer(cust_name, cust_address, phone_num, cus_id));
					dbc.addAcc(new Account(cus_id, pw, initial_balance));
					
				}
				else if(choice == 2) {
					//Log In
					boolean loggedIn = false;
					while(true) {
						ConsolePrinterUtility.loginOutput(1);		
						String entered_id = scan.nextLine();
						ConsolePrinterUtility.loginOutput(2);
						String entered_pw = scan.nextLine();
						if(dbc.checkCredentials(entered_id,entered_pw)) {
							loggedIn = true;
							break;
						}
						else {
							ConsolePrinterUtility.errorOutput(4);
						}
					}
					
					
					while(loggedIn) {
						//Print Logged In User Interface
						ConsolePrinterUtility.validUserOutput();
						try {
							int loggedInUserChoice = Integer.parseInt(scan.nextLine());
							if(loggedInUserChoice == 1) {//deposit								
								while(true) {
									ConsolePrinterUtility.depositOutput(1);
									try {
										double amountDepo = Double.parseDouble(scan.nextLine());
										if(amountDepo > 0) {
											if(dbc.deposit(amountDepo)) {
												ConsolePrinterUtility.depositOutput(2);
												System.out.println(dbc.currBalance());
												break;
											}
										}
										else {
											ConsolePrinterUtility.depositOutput(3);
										}
									}
									catch(Exception e) {
										ConsolePrinterUtility.depositOutput(4);
									}
								}
							}
							else if(loggedInUserChoice == 2) {//withdraw
								while(true) {
									ConsolePrinterUtility.withdrawOutput(1);
									try {
										double amountWithdraw = Double.parseDouble(scan.nextLine());
										if(amountWithdraw > 0) {
											if(dbc.withdraw(amountWithdraw)) {
												// Success
												ConsolePrinterUtility.withdrawOutput(2);
												System.out.println(dbc.currBalance());
												break;
											}
											// Unsuccessful
											else {
												ConsolePrinterUtility.withdrawOutput(3);
												System.out.println("Current Balance is $"+ dbc.currBalance());
											}
										}
										else {
											ConsolePrinterUtility.withdrawOutput(5);
										}
									}
									catch(Exception e) {
										ConsolePrinterUtility.withdrawOutput(4);
									}
								}
							}
							 // Transfer funds to other accounts via user id
							else if(loggedInUserChoice == 3) {
								while(true) {
									ConsolePrinterUtility.transferOutput(1);
									String tid=scan.nextLine();
									if(!dbc.transferCheckId(tid)) {
										ConsolePrinterUtility.transferOutput(3);
									}
									else {
										while(true) {
											ConsolePrinterUtility.transferOutput(2);
											try {
												double amountTransfer = Double.parseDouble(scan.nextLine());
												if(amountTransfer > 0) {
													if(dbc.transferCheck(amountTransfer)) {
														// Valid amt
														//do transfer of money
														dbc.transfer(tid,amountTransfer);
														// Valid amt
														ConsolePrinterUtility.transferOutput(4);
														System.out.println(dbc.currBalance());
														break;
													}
													else { // Invalid amt
														ConsolePrinterUtility.transferOutput(7);
														System.out.println("Current Balance is $"+ dbc.currBalance());
													}
												}
												else {
													ConsolePrinterUtility.transferOutput(6);
												}
											}
											catch(Exception e) {
												ConsolePrinterUtility.transferOutput(5);
											}
										}
										break;
									}
									
								}
							}
							// 5 Recent transactions
							else if(loggedInUserChoice == 4) { 
								dbc.recentTransactions();
							}
							// Display customer info
							else if(loggedInUserChoice == 5) { 
								dbc.customerInfo();
							}
							// Sign out
							else if(loggedInUserChoice == 6) {
								System.out.println("You have signed out!");
								loggedIn = false;
							}
							else {
								ConsolePrinterUtility.errorOutput(1);
							}
						}
						catch(Exception e) {
							ConsolePrinterUtility.errorOutput(1);
						}
					}
				}
				else if(choice == 3) {
					//Exit
					runApp = false;
					System.out.println("Thank you for using the DOLLARSBANK Application! Goodbye!");
				}
//				else if(choice ==4) {
//					//Lists All Users of the Bank
//					dbc.getUserListInfo();
//				}
//				else if(choice ==5) {
//					//Lists User Acc Info
//					dbc.getAccListInfo();
//				}
				else {
					ConsolePrinterUtility.errorOutput(1);
				}
			}
			catch(Exception e){
				ConsolePrinterUtility.errorOutput(1);
			}
			
	}

}
}