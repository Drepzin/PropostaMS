package com.MSPropostaRecebida.PropostaRecebida.Dtos;

public class PropostaRequest {

    private String name;

    private String lastName;

    private String email;

    private int age;

    private Double income;

    private Double value;

    private int paymentTerm;

    public PropostaRequest() {
    }

    public PropostaRequest(String name, int age, String email, String lastName,
                           Double income, Double value, int paymentTerm) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
        this.income = income;
        this.value = value;
        this.paymentTerm = paymentTerm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(int paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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

    @Override
    public String toString() {
        return "PropostaRequest{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", value=" + value +
                ", paymentTerm=" + paymentTerm +
                '}';
    }
}
