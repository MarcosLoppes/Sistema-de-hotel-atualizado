package com.mycompany.menu;

public class fazerReserva {
    
    public static void reservas(){
        
        while(true){
            System.out.println("---- Fazer Reserva ----");
            System.out.println();
            System.out.println("Qual suite voce deseja reservar?");
            System.out.println();
            System.out.println("1 - Suite padrao.");
            System.out.println("2 - Suite de luxo");
            System.out.println("3 - Suite supreme");
            System.out.println("4 - Suite presidencial");
            System.out.println("5 - Voltar");
            System.out.println();
            
            var escolha = lerDados.lerInt();
            
            switch(escolha){
                
                case 1:
                    suites.suitePadrao();
                    break;
                case 2:
                    suites2.suiteLuxo();
                    break;
                case 3:
                    suites3.suiteSupreme();
                    break;
                case 4:
                    suites4.suitePresidencial();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Numero invalido. Tente novamente");
                    break;
            }
        }
    }
}
