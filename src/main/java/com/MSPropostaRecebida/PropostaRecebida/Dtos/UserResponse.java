package com.MSPropostaRecebida.PropostaRecebida.Dtos;

public class UserResponse {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private Double income;

    public UserResponse() {
    }

    public UserResponse(Integer id, Double income, int age, String email,
                        String lastName, String firstName) {
        this.id = id;
        this.income = income;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
