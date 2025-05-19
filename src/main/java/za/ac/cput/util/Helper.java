package za.ac.cput.util;

public class Helper {

    y
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) return false;
        return email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean isValidPhone(String phone) {
        if (isNullOrEmpty(phone)) return false;
        return phone.matches("^\\d{10}$");
    }

    public static boolean isValidUserID(int id) {
        return id > 0;
    }

    public static boolean isValidRole(String role) {
        if (isNullOrEmpty(role)) return false;
        String roleLower = role.toLowerCase();
        return roleLower.equals("admin") || roleLower.equals("user");
    }
}
