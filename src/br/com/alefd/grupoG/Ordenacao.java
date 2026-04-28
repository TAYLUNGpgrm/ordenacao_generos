package br.com.alefd.grupoG;

import java.util.Scanner;

import java.util.*;

public class Ordenacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dadosM = "Alef Dutra Neves,Taylung Xanj jang,Célsio Costa da Silva,Victor Hugo Santos,Willart Dutra Neves,Zimmer Hans Walter,Rogério Everaldo Martins,Cario Fábio Silva,Rodrigo Silva Fábio";
        String dadosF = "Késsia Freitas Santos,Maria Eduarda da Silva Fernandes Carlos,Milena Almeida Fernandes,Ana Paula Mendez,Samira Santos Oliveira,Laura Diniz Almeida,Sophia Espanha Lopez,Jéssica Santos Lola da Silva";

        String[] arrayM = dadosM.split(",");
        String[] arrayF = dadosF.split(",");

        List<String> listaM = new ArrayList<>(Arrays.asList(arrayM));
        List<String> listaF = new ArrayList<>(Arrays.asList(arrayF));

        Collections.sort(listaM);
        Collections.sort(listaF);

        Map<String, List<String>> listaMap = new HashMap<>();

        listaMap.put("M", listaM);
        listaMap.put("F", listaF);

        System.out.println("Digite a letra da lista \nF - para Feminino\nou\nM - para Masculino");
        String opcao = "";
        while (!opcao.equals("SAIR") && !opcao.equals("sair")) {
            if (listaMap.containsKey(opcao)) {
                System.out.println("Você escolheu a opção " + opcao + ":");
                String resultado = String.join("\n", listaMap.get(opcao));
                System.out.println(resultado);
            } else {
                System.out.println("Favor digitar M ou F");
            }
            opcao = input.nextLine().toUpperCase();
        }
        input.close();
    }
}
