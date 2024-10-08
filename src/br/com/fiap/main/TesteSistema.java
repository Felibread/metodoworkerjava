package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema{
    //String
    static String texto (String j){
        return JOptionPane.showInputDialog(j);
    }
    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    //double
    static double real(String j){
        return Double.parseDouble((JOptionPane.showInputDialog(j)));

    }

    public static void main(String[] args) {
        //Instanciar objetos
        //String nome, String cargo, double valorHora, double quantidadeHoras
        Colaborador objColaborador = new Colaborador(
                texto("Nome"),
                texto("Cargo"),
                real("Valor da hora"),
                real("Quantidade")
        );
        //String logradouro, int numero, String complemento, String cep
        Endereco objEndColaborador = new Endereco(
         texto("logradouro"),
         inteiro("Numero"),
         texto("Complemento"),
         texto("CEP")
        );
        objColaborador.setEndereco(objEndColaborador);
        System.out.println();
    }
}