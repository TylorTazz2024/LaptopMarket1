package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {

    public static Admin createAdmin(Long adminID,
                                    String staffNumber,
                                    String department) {

        if (adminID == null
                || Helper.isNullOrEmpty(staffNumber)
                || Helper.isNullOrEmpty(department)) {
            return null;
        }

        return new Admin.AdminBuilder()
                .setAdminID(adminID)
                .setStaffNumber(staffNumber)
                .setDepartment(department)
                .build();
    }
}
