package com.MSPropostaRecebida.PropostaRecebida.Dtos;

public class UserRequest {

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private Double income;

    public UserRequest() {
    }

    public UserRequest(String firstName, Double income, int age, String email, String lastName) {
        this.firstName = firstName;
        this.income = income;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }
}
