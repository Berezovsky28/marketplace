package shop.model;

import java.util.ArrayList;

public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private Double amountOfMoney;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public User(Long id, String firstname, String lastname, Double amountOfMoney) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.amountOfMoney = amountOfMoney;
    }
}
