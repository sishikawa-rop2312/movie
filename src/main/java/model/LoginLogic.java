package model;

public class LoginLogic {
	public boolean login(User user) {
		if (user.getPassword().equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
}
