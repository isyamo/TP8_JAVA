package com.tp8.notification;

public interface NotificationSender {

	// Methode pour envoyer Notification
	void sendNotification(String recipient, String message);

	// retourne le type de canal de notif
	String getChannelType();
}
