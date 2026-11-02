package com.tp8.payment;

public class BankTransferProcessor implements PaymentProcessor {

	private final String accountNumber;

	public BankTransferProcessor(String accountNumber) {

		this.accountNumber = accountNumber;
	}

	@Override
	public boolean processPayment(double amount) {
		// validation du montant 
		if (amount <= 0) {
			System.out.println(" Erreur : Montant invalide pour le virement .");
			return false;
		}
		try {
			// delai d'attente pour communiquer avec la banque (1 seconde)
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// redirection de d'attente ou de bug 
			Thread.currentThread().interrupt();
			return false;
		}
		System.out.println("\n Virement confirme .");
		return true;// paiement reussit
	}

	@Override
	public String getPaymentMethod() {

		return " Virement Bancaire";
	}

}
