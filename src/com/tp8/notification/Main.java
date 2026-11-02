package com.tp8.notification;

import com.tp8.notification.*;

public class Main {
	public static void main(String[] args) {

		System.out.println("\n" + "=".repeat(40) + "\n");
		System.out.println("TESTS NOTIFICATIONS\n");

		// test email
		NotificationSender emailSender = new EmailNotificationSender();
		NotificationService emailService = new NotificationService(emailSender);
		emailService.sendWelcomeMessage("user@example.com");

		System.out.println("\n");

		// test sms
		NotificationSender smsSender = new SmsNotificationSender();
		NotificationService smsService = new NotificationService(smsSender);
		smsService.sendWelcomeMessage("+212612345678");

	}
}
