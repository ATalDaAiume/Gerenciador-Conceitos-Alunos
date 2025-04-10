import java.util.ArrayList;
import java.util.Scanner;

public class ProvinhadeJavadoJacksonzinho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleções de Strings para armazenar nomes e conceitos dos alunos
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> conceitos = new ArrayList<>();

        // Vetor para armazenar a quantidade de cada conceito
        int[] contagemConceitos = {0, 0, 0, 0}; // 'A', 'B', 'C', 'D'

        while (true) {
            // Menu de opções
            System.out.println("Menu:");
            System.out.println("1. Inserir novo aluno e conceito");
            System.out.println("2. Listar todos os alunos e conceitos");
            System.out.println("3. Calcular e exibir a quantidade de cada conceito");
            System.out.println("4. Exibir alunos com o conceito mais alto ('A')");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            // Opção 1
            if (opcao == 1) {
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();

                String conceito;
                while (true) {
                    System.out.print("Digite o conceito do aluno (A, B, C, D): ");
                    conceito = scanner.nextLine().toUpperCase();
                    if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C") || conceito.equals("D")) {
                        break;
                    } else {
                        System.out.println("Conceito inválido. Tente novamente.");
                    }
                }

                // Adicionar aluno e conceito nas coleções
                nomes.add(nome);
                conceitos.add(conceito);

                // Atualizar a contagem de conceitos
                if (conceito.equals("A")) {
                    contagemConceitos[0]++;
                } else if (conceito.equals("B")) {
                    contagemConceitos[1]++;
                } else if (conceito.equals("C")) {
                    contagemConceitos[2]++;
                } else if (conceito.equals("D")) {
                    contagemConceitos[3]++;
                }

                System.out.println("Aluno e conceito inseridos com sucesso!");

            } else if (opcao == 2) {
                // Opção 2
                if (nomes.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    System.out.println("Lista de alunos e seus conceitos:");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println(nomes.get(i) + " - " + conceitos.get(i));
                    }
                }

            } else if (opcao == 3) {
                // Opção 3
                System.out.println("Quantidade de conceitos:");
                System.out.println("A: " + contagemConceitos[0]);
                System.out.println("B: " + contagemConceitos[1]);
                System.out.println("C: " + contagemConceitos[2]);
                System.out.println("D: " + contagemConceitos[3]);

            } else if (opcao == 4) {
                // Opção 4: Conceito mais alto ('A')
                boolean encontrou = false;
                for (int i = 0; i < nomes.size(); i++) {
                    // Verifica se o conceito do aluno é 'A'
                    if (conceitos.get(i).equals("A")) {
                        System.out.println(nomes.get(i));
                        encontrou = true; // Indica que encontrou pelo menos um aluno com conceito 'A'
                    }
                }
                if (!encontrou) {
                    System.out.println("Nenhum aluno com o conceito mais alto.");
                }

            } else if (opcao == 5) {
                // Opção 5
                System.out.println("Encerrando o programa...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
