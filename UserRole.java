/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author rajas
 */
public class UserRole {
    private static UserRole instance;
    private String role;

    private UserRole() {}

    public static UserRole getInstance() {
        if (instance == null) {
            instance = new UserRole();
        }
        return instance;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
