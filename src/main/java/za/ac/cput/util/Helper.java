package za.ac.cput.util;

public class Helper {

    // Check if a string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty(); // now catches strings like "   "
    }


    // Check if an email is in a basic valid format
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) return false;
        return email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    // Check if a phone number contains only digits and is 10 digits long
    public static boolean isValidPhone(String phone) {
        if (isNullOrEmpty(phone)) return false;
        return phone.matches("^\\d{10}$");
    }

    // Check if userID is a positive integer
    public static boolean isValidUserID(int id) {
        return id > 0;
    }

    // Check if role is one of the expected values (extendable for Admin, User, etc.)
    public static boolean isValidRole(String role) {
        if (isNullOrEmpty(role)) return false;
        String roleLower = role.toLowerCase();
        return roleLower.equals("admin") || roleLower.equals("user");
    }
}
