package com.porto.ejb.beans;

import jakarta.ejb.Stateless;


@Stateless
public class MeuEjb {

    public String saudacao(String nome) {
        return "Olá, " + nome + "! Bem-vindo ao EJB!";
    }
}
