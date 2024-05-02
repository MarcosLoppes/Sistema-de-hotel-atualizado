package com.mycompany.menu;

import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Menu {
    
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {

        while (true) {
            System.out.println();
            System.out.println("==== Menu Principal ====");
            System.out.println();
            System.out.println("1 - Cadastrar hospede");
            System.out.println("2 - Fazer Reserva");
            System.out.println("3 - Listar Hospedes");
            System.out.println("4 - Listar Reservas");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.println("Escolha uma das opcoes:");
            var escolha = lerDados.lerInt();

            switch (escolha) {
                
                case 1:
                    cadastrarHospede();
                break;
                case 2:
                     fazerReserva.reservas();
                 break;
                case 3:
                    listarHospedes();
                break;
                 case 4:
                    suites.lista1();
                    suites2.lista2();
                    suites3.lista3();
                    suites4.lista4();
                 break;
                 case 5:
                   return;
                default:
                    System.out.println("tente novamente.");
                    break;
            }
        }
    }

    static ArrayList<String> nomes = new ArrayList<>();

    private static void cadastrarHospede() {
             
        System.out.println("Nome: ");
        var nome = lerDados.lerTexto();

        System.out.println("Data de nascimento: ");
        var idade = lerDados.lerData();
                   
        System.out.println("CPF/Passaporte/RNE (Digite somente números): ");
        var cpf = lerDados.lerTexto();
        
        System.out.println("Nacionalidade: ");
        var nacionalidade = lerDados.lerTexto();

        System.out.println("Endereço: ");
        var endereco = lerDados.lerTexto();
        
        System.out.println("Número: ");
        var numeroEndereco = lerDados.lerInt();
        
        System.out.println("Complemento: ");
        var complementoEndereco = lerDados.lerTexto();        

        System.out.println("CEP (Digite somente números): ");
        var cep = lerDados.lerTexto();
        
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + idade);
        System.out.println("CPF/Passaporte/RNE: " + cpf);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número: " + numeroEndereco);              
        System.out.println("Complemento: " + complementoEndereco);
        System.out.println("CEP: " + cep);

        nomes.add(nome);

    }



    private static void listarHospedes() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
