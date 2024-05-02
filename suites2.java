package com.mycompany.menu;


import java.util.HashMap;
import java.util.Map;

public class suites2 {
    
    static int i;
    static String nome;
    static Map<Integer, String> reservas = new HashMap<>();
    static boolean[] quarto = new boolean[10];
    
    public static void suiteLuxo(){
        
        while(true){
            System.out.println();
            System.out.println("---- Suite Luxo ----");
            System.out.println();
            System.out.println("1 - Exibir reserva.");
            System.out.println("2 - Escolher quarto.");
            System.out.println("3 - Voltar");
            System.out.println();
            var escolha = lerDados.lerInt();
            
            switch(escolha){
                case 1:
                    exibirReserva();
                    break;
                case 2:
                    fazerReserva();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Numero invalido. Tente novamente");
            }
        }
    }
    
    public static void exibirReserva(){
        System.out.println("----- Reservas de Quartos -----");
        for (i = 0; i < quarto.length; i++) {
            if (quarto[i] == true) {
                System.out.println("Quarto " + (i + 11) + ": Ocupado por " + reservas.get(i + 1));
            } else {
                System.out.println("Quarto " + (i + 11) + ": Disponivel");
            }
        }
    }
    
    public static void fazerReserva() {
        System.out.println("---- Escolha de Quartos ----");
        System.out.println("Qual seu nome?");
        nome = lerDados.lerTexto();
        System.out.println();
        
        boolean x = true;
        
        while(x){
            System.out.println("Qual quarto deseja reservar?");
            var numeroQuarto = lerDados.lerInt() - 10;
      
            if (numeroQuarto < 1 || numeroQuarto > 10) {
                System.out.println("Numero de quarto invalido. Por favor, digite um numero de 11 a 20.");
            } else if (quarto[numeroQuarto - 1]){
                System.out.println("Quarto ocupado por " + reservas.get(numeroQuarto));
            } else {
                quarto[numeroQuarto - 1] = true;
                System.out.println("---- Quarto Reservado ----");
                System.out.println();
                System.out.println("Quarto " + (numeroQuarto + 10) + " reservado para " + nome);
                reservas.put(numeroQuarto, nome);
                x = false;
            }
        }
    }
    
    public static void lista2(){
        System.out.println();
        System.out.println("----- Reservas de Quartos Luxo -----");
        for (Map.Entry<Integer, String> reserva : reservas.entrySet()) {
            System.out.println("Quarto numero " + (reserva.getKey() + 10) + " ocupado por " + reserva.getValue());
        }
    }
}
