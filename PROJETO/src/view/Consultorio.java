package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class Consultorio {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static ArrayList<Dentista> dentistas = new ArrayList<>();
    private static ArrayList<Consulta> consultas = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Dentista");
            System.out.println("3. Marcar Consulta");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Listar Dentistas");
            System.out.println("6. Listar Consultas");
            System.out.println("7. Remover Paciente");
            System.out.println("8. Remover Dentista");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = entrada.nextInt();
            entrada.nextLine(); 
            
            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    cadastrarDentista();
                    break;
                case 3:
                    marcarConsulta();
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    listarDentistas();
                    break;
                case 6:
                    listarConsultas();
                    break;
                case 7:
                    removerPaciente();
                    break;
                case 8:
                    removerDentista();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 9);
    }

    private static void cadastrarPaciente() {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Telefone: ");
        String telefone = entrada.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = entrada.nextLine();
        System.out.print("Logradouro: ");
        String logradouro = entrada.nextLine();
        System.out.print("Número: ");
        int numero = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("Bairro: ");
        String bairro = entrada.nextLine();
        System.out.print("CEP: ");
        String cep = entrada.nextLine();
        
        Endereco endereco = new Endereco(logradouro, numero, bairro, cep);
        Paciente paciente = new Paciente(nome, telefone, dataNascimento, endereco);
        pacientes.add(paciente);

        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void cadastrarDentista() {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Telefone: ");
        String telefone = entrada.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento = entrada.nextLine();
        System.out.print("Salário: ");
        double salario = entrada.nextDouble();
        System.out.print("CRO: ");
        double cro = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.print("Logradouro: ");
        String logradouro = entrada.nextLine();
        System.out.print("Número: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Bairro: ");
        String bairro = entrada.nextLine();
        System.out.print("CEP: ");
        String cep = entrada.nextLine();
        
        Endereco endereco = new Endereco(logradouro, numero, bairro, cep);
        Dentista dentista = new Dentista(nome, telefone, dataNascimento, endereco, salario, cro);
        dentistas.add(dentista);

        System.out.println("Dentista cadastrado com sucesso!");
    }

    private static void marcarConsulta() {
        if (pacientes.isEmpty() || dentistas.isEmpty()) {
            System.out.println("É necessário pelo menos um paciente e um dentista cadastrados.");
            return;
        }
    
        System.out.println("Selecione um paciente:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(i + " - " + pacientes.get(i).getNome());
        }
        int pacienteIndex = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Selecione um dentista:");
        for (int i = 0; i < dentistas.size(); i++) {
            System.out.println(i + " - " + dentistas.get(i).getNome());
        }
        int dentistaIndex = entrada.nextInt();
        entrada.nextLine(); 
    
        System.out.print("Data e Hora da Consulta: ");
        String dataHora = entrada.nextLine();
        System.out.print("Descrição: ");
        String descricao = entrada.nextLine();
        System.out.print("Valor da consulta: ");
        double valorConsulta = entrada.nextDouble();
        entrada.nextLine();
    
        Consulta consulta = new Consulta(dentistas.get(dentistaIndex), pacientes.get(pacienteIndex), dataHora, descricao, valorConsulta);
        consultas.add(consulta);
    
        System.out.println("Consulta marcada com sucesso!");
    }
    

    private static void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("--- Pacientes Cadastrados ---");
            for (Paciente p : pacientes) {
                System.out.println("Nome: " + p.getNome() + ", Telefone: " + p.getTelefone());
            }
        }
    }

    private static void listarDentistas() {
        if (dentistas.isEmpty()) {
            System.out.println("Nenhum dentista cadastrado.");
        } else {
            System.out.println("--- Dentistas Cadastrados ---");
            for (Dentista d : dentistas) {
                System.out.println("Nome: " + d.getNome() + ", CRO: " + d.getCro());
            }
        }
    }

    private static void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta marcada.");
        } else {
            System.out.println("--- Consultas Marcadas ---");
            for (Consulta c : consultas) {
                System.out.println("Paciente: " + c.getPaciente().getNome() + 
                                   ", Dentista: " + c.getDentista().getNome() +
                                   ", Data/Hora: " + c.getDataHora() +
                                   ", Descrição: " + c.getDesc());
            }
        }
    }

    private static void removerPaciente() {
        listarPacientes();
        System.out.print("Informe o índice do paciente a ser removido: ");
        int index = entrada.nextInt();
        entrada.nextLine();
        if (index >= 0 && index < pacientes.size()) {
            pacientes.remove(index);
            System.out.println("Paciente removido!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void removerDentista() {
        listarDentistas();
        System.out.print("Informe o índice do dentista a ser removido: ");
        int index = entrada.nextInt();
        entrada.nextLine();
        if (index >= 0 && index < dentistas.size()) {
            dentistas.remove(index);
            System.out.println("Dentista removido!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}



