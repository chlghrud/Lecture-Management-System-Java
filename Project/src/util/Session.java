package util;

import model.dto.User;

public class Session {
	private static Session instance = new Session();
	private User currentUser;
	
	private Session() {};
	
	public static Session getInstance() {
		return instance;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	public void logout() {
		currentUser = null;
	}
	
}
