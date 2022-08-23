package com.example.mimari01.dto;

public class UserDto {
    // Dto classinda controllerda kullanicagimiz nesneleri ve degiskenleri olusturduk.
    // Bu nesneleri url` den aldigimiz verilere atadik. Bu sayede bu verileri servis classina gonderdik
    // =>> Service class

    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String eMail;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
