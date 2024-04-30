package questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida = 0;
        List<ContatoTelefonico> listaTelefonica = new ArrayList<>();
        // Código abaixo somente para fins de teste pra não precisar ficar inserindo um milhão de contatos.
        ContatoTelefonico contato1 = new ContatoTelefonico("Heder", "Pinto", "hederpinto123@gmail.com", 55, "77991607631", 1);
        ContatoTelefonico contato2 = new ContatoTelefonico("Ana", "Silva", "anasilva456@gmail.com", 1, "77991234567", 0);
        ContatoTelefonico contato3 = new ContatoTelefonico("Carlos", "Ferreira", "carlosferreira789@gmail.com", 55, "77992345678", 1);
        ContatoTelefonico contato4 = new ContatoTelefonico("Mariana", "Santos", "marianasantos101@gmail.com", 55, "77993456789", 2);
        ContatoTelefonico contato5 = new ContatoTelefonico("Pedro", "Souza", "pedrosouza202@gmail.com", 55, "77994567890", 0);
        ContatoTelefonico contato6 = new ContatoTelefonico("Juliana", "Oliveira", "julianaoliveira303@gmail.com", 1, "77995678901", 1);
        ContatoTelefonico contato7 = new ContatoTelefonico("Lucas", "Martins", "lucasmartins404@gmail.com", 27, "77996789012", 2);
        ContatoTelefonico contato8 = new ContatoTelefonico("Camila", "Gomes", "camilagomes505@gmail.com", 27, "77997890123", 0);
        ContatoTelefonico contato9 = new ContatoTelefonico("Felipe", "Costa", "felipecosta606@gmail.com", 55, "77998901234", 1);
        ContatoTelefonico contato10 = new ContatoTelefonico("Amanda", "Rodrigues", "amandarodrigues707@gmail.com", 42, "77990012345", 2);
        listaTelefonica.add(contato1);
        listaTelefonica.add(contato2);
        listaTelefonica.add(contato3);
        listaTelefonica.add(contato4);
        listaTelefonica.add(contato5);
        listaTelefonica.add(contato6);
        listaTelefonica.add(contato7);
        listaTelefonica.add(contato8);
        listaTelefonica.add(contato9);
        listaTelefonica.add(contato10);
        do {
            System.out.println("------ MENU TELEFÔNICO ------");
            System.out.println("1. Inserir novo contato telefônico");
            System.out.println("2. Listar contatos telefônicos de determinado país");
            System.out.println("3. Listar percentuais de contatos telefônicos por categoria");
            System.out.println("4. Encerrar o programa");
            System.out.print("Opção escolhida: ");
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 1 -> {
                    String nome, sobrenome, email, telefone;
                    int codigoPais, categoria;

                    System.out.print("Insira seu primeiro nome: ");
                    nome = scanner.next();

                    System.out.print("Insira seu último nome: ");
                    sobrenome = scanner.next();

                    System.out.print("Insira seu email: ");
                    email = scanner.next();

                    System.out.print("Insira o código do pais: ");
                    codigoPais = scanner.nextInt();

                    System.out.print("Insira o telefone: ");
                    telefone = scanner.next();

                    System.out.print("Insira a categoria (0 - FAMILIAR, 1 - PROFISSIONAL, 2 - OUTROS): ");
                    categoria = scanner.nextInt();
                    if (!listaTelefonica.isEmpty()) {
                        for (ContatoTelefonico contato : listaTelefonica) {
                            if (contato.getNome().equalsIgnoreCase(nome) && contato.getSobrenome().equalsIgnoreCase(sobrenome)
                            && contato.getCodigoPais() == codigoPais && contato.getTelefone().equalsIgnoreCase(telefone)) {
                                System.out.println("Usuário já cadastrado!");
                            } else {
                                listaTelefonica.add(new ContatoTelefonico(nome, sobrenome, email, codigoPais, telefone, categoria));
                            }
                        }
                    } else {
                        listaTelefonica.add(new ContatoTelefonico(nome, sobrenome, email, codigoPais, telefone, categoria));
                    }

                }

                case 2 -> {
                    int paisPesquisado = 0;
                    System.out.print("Insira o país: ");
                    paisPesquisado = scanner.nextInt();
                    System.out.println("Números encontrados: ");
                    for (ContatoTelefonico contato : listaTelefonica) {
                        if (contato.getCodigoPais() == paisPesquisado) {
                            System.out.println(contato);
                        }
                    }
                }

                case 3 -> {
                    int quantidadeDeContatos  = listaTelefonica.size(), quantidadeFamiliar = 0, quantidadeProfissional = 0,
                            quantidadeOutros = 0;
                    double porcentagemFamiliar = 0, porcentagemProfissional = 0, porcentagemOutros = 0;
                    for (ContatoTelefonico contato : listaTelefonica) {
                        if (contato.getCategoria() == 0) {
                            quantidadeFamiliar++;
                        } else if (contato.getCategoria() == 1) {
                            quantidadeProfissional++;
                        } else {
                            quantidadeOutros++;
                        }
                    }
                    porcentagemFamiliar = (double) (quantidadeFamiliar * 100 ) / quantidadeDeContatos;
                    porcentagemProfissional = (double) (quantidadeProfissional * 100) / quantidadeDeContatos;
                    porcentagemOutros = (double) (quantidadeOutros * 100) / quantidadeDeContatos;

                    System.out.println("Porcentagem de categoria Familiar: " + porcentagemFamiliar + "%");
                    System.out.println("Porcentagem de categoria Profissional: " + porcentagemProfissional + "%");
                    System.out.println("Porcentagem de categoria Outros: " + porcentagemOutros + "%");
                }
                case 4 -> {
                    System.out.println("Encerrando o programa...");
                    try {
                        sleep(2000);
                        System.out.println("Programa encerrado.");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                default -> System.out.println("Opção Inválida");
            }
        } while (opcaoEscolhida != 4);
    }
}
