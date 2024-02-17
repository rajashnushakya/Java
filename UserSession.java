/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author rajas
 */
public class UserSession {
     private static UserSession instance;
    private String userEmail;
    private int teacherId;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void setUserEmail(String email) {
        this.userEmail = email;
    }

    public String getUserEmail() {
        return userEmail;
    }
    
    
    public void setTeacherId(int id) {
        this.teacherId = id;
    }

    public int getTeacherId() {
        return this.teacherId;
    }
}
