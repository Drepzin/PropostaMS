package com.MSPropostaRecebida.PropostaRecebida.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private Double income;

    @OneToMany(mappedBy = "userModel")
    private List<PropostaModel> propostaModel;

    public UserModel(){}

    public UserModel(Double income, int age, String lastName, String firstName,
                     String email) {
        this.income = income;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.propostaModel = new ArrayList<>();
    }

    public void addInList(PropostaModel propostaModel){
        this.propostaModel.add(propostaModel);
    }

    public List<PropostaModel> getPropostaModel() {
        return propostaModel;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return age == userModel.age && Objects.equals(id, userModel.id) && Objects.equals(firstName, userModel.firstName) && Objects.equals(lastName, userModel.lastName) && Objects.equals(email, userModel.email) && Objects.equals(income, userModel.income);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, age, income);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", income=" + income +
                '}';
    }
}
