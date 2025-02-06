/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author baba
 */
public class User {
    private String useriD;
    private String fullName;
    private String adress;
    private String phone;

    public User() {
    }

    public User(String useriD, String fullName, String adress, String phone) {
        this.useriD = useriD;
        this.fullName = fullName;
        this.adress = adress;
        this.phone = phone;
    }
    
    
}
