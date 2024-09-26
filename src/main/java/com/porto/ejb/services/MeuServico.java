package com.porto.ejb.services;

import com.porto.ejb.beans.MeuEjb;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class MeuServico {

    @EJB
    private MeuEjb meuEJB;

    public String obterSaudacao(String nome) {
        return meuEJB.saudacao(nome);
    }
}
