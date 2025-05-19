package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {

    public static User createUser(int userID,
                                  String firstname,
                                  String email,
                                  String phone,
                                  String role) {

        if (!Helper.isValidUserID(userID)
                || Helper.isNullOrEmpty(firstname)
                || !Helper.isValidEmail(email)
                || !Helper.isValidPhone(phone)
                || !Helper.isValidRole(role)) {
            return null;
        }

        return new User.Builder()
                .setUserID(userID)
                .setfirstname(firstname)
                .setEmail(email)
                .setPhone(phone)
                .setRole(role)
                .build();
    }

}
