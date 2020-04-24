package com.qait.tests.java.keywords;

public class AccountPageAction extends StudentPageAction{
	
		   // The private instance variables
		   private int number;
		   private double balance;

		   // The constructors (overloaded)
		
		   public AccountPageAction(int number) {
		      this.number = number;
		      this.balance = 0.0;  // "this." is optional
		   }
		 
		   public AccountPageAction(int number, double balance) {
		      this.number = number;
		      this.balance = balance;
		   }

		   // The public getters/setters for the private instance variables.

		   /** Returns the number */
		   public int getNumber() {
		      return this.number;  // "this." is optional
		   }
		   /** Returns the balance */
		   public double getBalance() {
		      return this.balance;  // "this." is optional
		   }

		   /** Returns a string description of this instance */
		   public String toString() {
		      // Use built-in function System.format() to form a formatted String
		      return String.format("Account[number=%d,balance=$%.2f]", number, balance);
		   }

		   /** Add the given amount to the balance */
		   public void credit(double amount) {
		      balance += amount;
		   }

		   /** Subtract the given amount from balance, if balance >= amount */
		   public void debit(double amount) {
		      if (balance >= amount) {
		         balance -= amount;
		      } else {
		         System.out.println("amount exceeded");
		      }
		   }

		   /** Transfer the given amount to Account another, if balance >= amount */
		   public void transferTo(double amount, AccountPageAction another) {
		      if (balance >= amount) {
		         this.balance -= amount;
		         another.balance += amount;
		      } else {
		         System.out.println("amount exceeded");
		      }
		   }
		}


