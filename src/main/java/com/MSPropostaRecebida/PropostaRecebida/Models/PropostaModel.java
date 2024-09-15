package com.MSPropostaRecebida.PropostaRecebida.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropostaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double value;

    private int paymentTerm;

    private Boolean aproved;

    private boolean integred;

    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private UserModel userModel;

    public PropostaModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getAproved() {
        return aproved;
    }

    public void setAproved(Boolean aproved) {
        this.aproved = aproved;
    }

    public boolean isIntegred() {
        return integred;
    }

    public void setIntegred(boolean integred) {
        this.integred = integred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropostaModel that = (PropostaModel) o;
        return paymentTerm == that.paymentTerm && integred == that.integred && Objects.equals(id, that.id) && Objects.equals(value, that.value) && Objects.equals(aproved, that.aproved) && Objects.equals(description, that.description) && Objects.equals(userModel, that.userModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, paymentTerm, aproved, integred, description, userModel);
    }


}
