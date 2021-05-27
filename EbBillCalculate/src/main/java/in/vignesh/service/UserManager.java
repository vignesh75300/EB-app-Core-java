package in.vignesh.service;

import java.util.ArrayList;
import in.vignesh.model.User;
import in.vignesh.validator.UserValidation;

public class UserManager {

	static ArrayList<User> userList = new ArrayList<User>();
	static {
		User user = new User("vignesh", "7530041990", "033490033324", "vig33323", "Viki@75300");
		userList.add(user);

	}

	public static void isValidRegister() {
		for (User user : userList) {
			if ((UserValidation.isValidName(user.getName()) && UserValidation.isValidMobile(user.getMobileNo())
					&& UserValidation.isValidConsumerNo(user.getConsumerNumber())
					&& UserValidation.isValidCustomerId(user.getCustomerId())
					&& UserValidation.isValidPassword(user.getPassword()))) {

				System.out.println("Register Succesfully");
			} else {

				System.out.println("Invalid Credentials");
			}

		}

	}

	public static boolean isValidLogin(String customerId, String password) {
		boolean exist = false;
		for (User login : userList) {
			if (login.getCustomerId().equalsIgnoreCase(customerId) && login.getPassword().equals(password)) {
				exist = true;
				break;
			}

		}
		return exist;
	}

	public static void display() {

		for (User user : userList) {
			System.out.println(user.toString());

		}

	}

	public static void main(String args[]) {
		UserManager.display();
		UserManager.isValidRegister();

	}

}