package com.MSPropostaRecebida.PropostaRecebida.Dtos;

public class PropostaResponse {

    private String name;

    private String lastName;

    private String email;

    private int age;

    private Double income;

    private Double value;

    private int paymentTerm;

    private Boolean approved;

    private boolean integred;

    private String description;

    public PropostaResponse() {
    }

    public PropostaResponse(String name, String description, boolean integred, int paymentTerm, Double value, int age, String email,
                            String lastName, Double income, Boolean approved) {
        this.name = name;
        this.description = description;
        this.integred = integred;
        this.paymentTerm = paymentTerm;
        this.value = value;
        this.age = age;
        this.email = email;
        this.lastName = lastName;
        this.income = income;
        this.approved = approved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIntegred() {
        return integred;
    }

    public void setIntegred(boolean integred) {
        this.integred = integred;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public int getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(int paymentTerm) {
        this.paymentTerm = paymentTerm;
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PropostaResponse{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", value=" + value +
                ", paymentTerm=" + paymentTerm +
                ", approved=" + approved +
                ", integred=" + integred +
                ", description='" + description + '\'' +
                '}';
    }
}
