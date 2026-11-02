package com.tp8.payment;

import com.tp8.payment.*;

public class Main {
	public static void main(String[] args) {
		
		//test carte bancaire 
		PaymentProcessor cardProcessor =  new CreditCardProcessor("4111-1111-1111-1111");
		
		PaymentService cardService = new  PaymentService(cardProcessor);
		
		System.out.println("\n" + "=".repeat(40) + "\n");
		
		PaymentProcessor transferProcessor = new BankTransferProcessor("MR76-3000-6000-0112-345");
		
		PaymentService transferService = new PaymentService(transferProcessor);
		
		transferService.pay(150.0);
	}

}
