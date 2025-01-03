package Aula.Aprendizado;

import java.util.ArrayList;
import java.util.Scanner;

public class estu {
// Atributos da classe inicialmente anotadas
    private String nome;
    private int idade;
    private String matr;

    
// Construtor 1
    public estu() {
        this.nome = "";
        this.idade = 0;
        this.matr = "";
    }

    
// Construtor 2
    public estu(String nome, int idade, String matr) {
        this.nome = nome;
        this.idade = idade;
        this.matr = matr;
    }

    
// Métodos que vao mudar as cateristicas
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public void setmatr(String matr) {
        this.matr = matr;
    }

    
    // Métodos 'get' para acessar os atributos
    public String getNome() {
        return nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public String getmatr() {
        return matr;
    }

    // Método toString para exibir as informações do estudante
    @Override

    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matr='" + matr + '\'' +
                '}';
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um ArrayList de estudantes
        ArrayList<estu> estudantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Estudante");
            System.out.println("2. Remover Estudante");
            System.out.println("3. Buscar Estudante");
            System.out.println("4. Exibir Todos os Estudantes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    // Adicionar estudante
                    System.out.print("Digite o nome do estudante: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do estudante: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    System.out.print("Digite a matrícula do estudante: ");
                    String matr = scanner.nextLine();

                    estu estudante = new estu(nome, idade, matr);
                    estudantes.add(estudante);
                    System.out.println("Estudante adicionado com sucesso!");
                    break;

                case 2:
                    // Remover estudante
                    System.out.print("Digite a matrícula do estudante a ser removido: ");
                    String matrRemover = scanner.nextLine();
                    boolean removido = false;
                    for (estu e : estudantes) {
                        if (e.getmatr().equals(matrRemover)) {
                            estudantes.remove(e);
                            removido = true;
                            System.out.println("Estudante removido com sucesso!");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 3:
                    // Buscar estudante
                    System.out.print("Digite a matrícula do estudante a ser buscado: ");
                    String matrBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    for (estu e : estudantes) {
                        if (e.getmatr().equals(matrBuscar)) {
                            System.out.println("Estudante encontrado: " + e);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;

                case 4:
                    // Exibir todos os estudantes
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum estudante cadastrado.");
                    } else {
                        System.out.println("Lista de Estudantes:");
                        for (estu e : estudantes) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}