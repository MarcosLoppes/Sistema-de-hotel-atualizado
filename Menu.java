package com.mycompany.menu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private static ArrayList<Hospede> hospedes = new ArrayList<>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        while (true) {
            System.out.println("==== Menu Principal ====");
            System.out.println();
            System.out.println("1 - Cadastrar hospede");
            System.out.println("2 - Fazer Reserva");
            System.out.println("3 - Listar Hospedes");
            System.out.println("4 - Listar Reservas");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.println("Escolha uma das opções:");
            var escolha = lerDados.lerInt();

            switch (escolha) {
                case 1:
                    cadastrarHospede();
                    break;
                case 2:
                    fazerReserva();
                    break;
                case 3:
                    listarHospedes();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("tente novamente.");
                    break;
            }
        }
    }
    
    private static void cadastrarHospede() {     
                
        System.out.println("Nome: ");
        String nome = lerDados.lerTexto();

        System.out.println("Data de nascimento: ");
        Date dataDeNascimento = lerDados.lerData2();
        
        System.out.println("CPF/Passaporte/RNE (Digite somente números): ");
        String cpfPassaporteRne = lerDados.lerTexto();

        System.out.println("Nacionalidade: ");
        String nacionalidade = lerDados.lerTexto();

        System.out.println("Endereço: ");
        String endereco = lerDados.lerTexto();

        System.out.println("Número: ");
        int numeroEndereco = lerDados.lerInt();

        System.out.println("Complemento: ");
        String complementoEndereco = lerDados.lerTexto();

        System.out.println("CEP (Digite somente números): ");
        String cep = lerDados.lerTexto();

        Hospede novoHospede = new Hospede(nome, dataDeNascimento, cpfPassaporteRne, nacionalidade, endereco, numeroEndereco, complementoEndereco, cep);
        hospedes.add(novoHospede);

        System.out.println("Hospede cadastrado com sucesso!");
    }

    private static void listarHospedes() {
        if (hospedes.isEmpty()) {
            System.out.println("Não há hóspedes cadastrados.");
        } else {
            System.out.println("Lista de Hóspedes:");
            for (Hospede hospede : hospedes) {
                System.out.println("Nome: " + hospede.getNome());
                System.out.println("Data de Nascimento: " + hospede.getDataDeNascimento());
                System.out.println("CPF/Passaporte/RNE: " + hospede.getCpfPassaporteRne());
                System.out.println("Nacionalidade: " + hospede.getNacionalidade());
                System.out.println("Endereço: " + hospede.getEndereco());
                System.out.println("Número: " + hospede.getNumero());
                System.out.println("Complemento: " + hospede.getComplemento());
                System.out.println("CEP: " + hospede.getCep());
                System.out.println();
            }
        }
    }
}

class Hospede {
    private String nome;
    private Date dataDeNascimento;
    private String cpfPassaporteRne;
    private String nacionalidade;
    private String endereco;
    private int numero;
    private String complemento;
    private String cep;

    public Hospede(String nome, Date dataDeNascimento, String cpfPassaporteRne, String nacionalidade, String endereco, int numero, String complemento, String cep) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpfPassaporteRne = cpfPassaporteRne;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCpfPassaporteRne() {
        return cpfPassaporteRne;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpfPassaporteRne(String cpfPassaporteRne) {
        this.cpfPassaporteRne = cpfPassaporteRne;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}

private static void fazerReserva() {
    System.out.println("Fazer Reserva:");
    System.out.println("Digite o nome do hóspede:");
    String nomeHospede = lerDados.lerTexto();
    
    // Verifica se o hóspede existe na lista de hóspedes
    Hospede hospede = procurarHospede(nomeHospede);
    if (hospede == null) {
        System.out.println("Hóspede não encontrado.");
        return;
    }

    System.out.println("Digite o número do quarto:");
    int numeroQuarto = lerDados.lerInt();

    System.out.println("Digite a data de check-in (dd/MM/yyyy):");
    Date dataCheckIn = lerDados.lerData();

    System.out.println("Digite a data de check-out (dd/MM/yyyy):");
    Date dataCheckOut = lerDados.lerData();

    System.out.println("Digite o número de hóspedes:");
    int numHospedes = lerDados.lerInt();

    // Cria um objeto Reserva e adiciona à lista de reservas
    Reserva reserva = new Reserva(hospede, numeroQuarto, dataCheckIn, dataCheckOut, numHospedes);
    reservas.add(reserva);

    System.out.println("Reserva feita com sucesso!");
}

private static Hospede procurarHospede(String nome) {
    for (Hospede hospede : hospedes) {
        if (hospede.getNome().equals(nome)) {
            return hospede;
        }
    }
    return null;
}
