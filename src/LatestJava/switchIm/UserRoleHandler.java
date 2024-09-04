package LatestJava.switchIm;

public class UserRoleHandler {

	public static void main(String[] args) {
		
		
		UserRole role = UserRole.ADMIN;
		String result = handleUserRole(role);
		System.out.println(result);

		role = UserRole.USER;
		result = handleUserRole(role);
		System.out.println(result);

		role = UserRole.GUEST;
		result = handleUserRole(role);
		System.out.println(result);

		result = handleUserRoleNormal(role);
		System.out.println(result);
		
		result = handleUserRoleNormal(UserRole.ADMIN);
		System.out.println(result);

	}

	public static String handleUserRoleNormal(UserRole role) {
		String result;
		switch (role) {
		case ADMIN:
			result = "Handling normal admin privileges";
			break;
		case USER:
			result = "Handling normal user privileges";
			break;
		case GUEST:
			result = "Handling normal guest privileges";
			break;
		default:
			result = "Unknown normal role";
			break;
		}
		return result;
	}

	public static String handleUserRole(UserRole role) {
		return switch (role) {
		case ADMIN 	-> "Handling admin privileges";
		case USER 	-> "Handling user privileges";
		case GUEST 	-> "Handling guest privileges";
		default -> throw new IllegalArgumentException();
		};
	}
}
