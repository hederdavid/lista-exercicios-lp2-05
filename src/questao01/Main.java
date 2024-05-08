package questao01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String titulo, autores;
        int edicao, ano, qtd = 0;
        ArrayDeque<Livro> pilha1 = new ArrayDeque<>();

        while (true) {
            System.out.print("Título do livro: ");
            titulo = scanner.nextLine();

            System.out.print("Autores do livro: ");
            autores = scanner.nextLine();

            System.out.print("Edição: ");
            edicao = scanner.nextInt();

            System.out.print("Ano: ");
            ano = scanner.nextInt();
            scanner.nextLine();

            pilha1.push(new Livro(titulo, autores, edicao, ano));
            qtd++;
            System.out.println(pilha1);

            if (qtd == 5) {
                ArrayDeque<Livro> pilha2 = new ArrayDeque<>();
                pilha2.push(pilha1.pop());
                pilha2.push(pilha1.pop());
                System.out.println(pilha2);
                pilha1.pop();
                pilha1.push(pilha2.pop());
                pilha1.push(pilha2.pop());
                System.out.println(pilha1);
                qtd = 0;
            }
        }
    }
}
