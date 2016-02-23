package com.twu.biblioteca;


public class Users {
    private String userName;
    private String userEmail;
    private String userAddress;
    private String userPhone;
    private String userPassword;

    public Users(String userName, String userEmail, String userAddress, String userPhone, String userPassword){

        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    public String getUserInfoByString(){
        return "userName: " + userName + "\n" +
                "userEmail: " + userEmail + "\n" +
                "userAddress: "+ userAddress + "\n" +
                "userPhone: " + userPhone +"\n";

    }
}

