package com.porto.ejb.controllers;

import com.porto.ejb.services.MeuServico;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/saudacao")
public class MeuServlet extends HttpServlet {

    @EJB
    private MeuServico meuServico;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String saudacao = meuServico.obterSaudacao(nome != null ? nome : "Visitante");
        resp.getWriter().write(saudacao);
    }
}
