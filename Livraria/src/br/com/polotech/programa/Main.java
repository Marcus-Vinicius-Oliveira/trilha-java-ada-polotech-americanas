package br.com.polotech.programa;

import br.com.polotech.dadosdosprodutos.Brinquedo;
import br.com.polotech.dadosdosprodutos.Livro;
import br.com.polotech.utilitarios.Menu;
import br.com.polotech.utilitarios.SistemaGerencia;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        Integer opcao = 0;

        Integer id = 0;

        Integer contId = 0;


        SistemaGerencia gerencia = new SistemaGerencia();

        Scanner sc = new Scanner(System.in);


        do {
            Menu.exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    Menu.menuCadastroProduto();

                    Integer opcaoCadastro = sc.nextInt();


                    switch (opcaoCadastro) {
                        case 1:
                            sc.nextLine();
                            char cadastroLivro = 'N';
                            do {


                                Menu.menuCadastrarLivro();

                                id = contId + 1;

                                contId++;

                                System.out.println("ID #" + id);

                                gerencia.cadastrarLivro(id);

                                System.out.println("Desja cadastrar um novo livro - [S] / [N]?");
                                cadastroLivro = sc.next().toUpperCase().charAt(0);

                                if (cadastroLivro != 'S' && cadastroLivro != 'N') {
                                    System.out.println("Digite [S] para SIM ou [N] para NÃO");
                                }

                            } while (cadastroLivro == 'S');

                            break;

                        case 2:
                            char cadastroJogo = 'N';
                            do {
                                Menu.menuCadastraJogo();

                                id = contId + 1;

                                contId++;

                                System.out.println("ID #" + id);

                                gerencia.cadastrarJogo(id);

                                System.out.println("Deseja cadastrar um novo jogo - [S] / [N]?");
                                cadastroJogo = sc.next().toUpperCase().charAt(0);

                                if (cadastroJogo != 'S' && cadastroJogo != 'N') {
                                    System.out.println("Digite [S] para SIM ou [N] para NÃO");
                                }

                            } while (cadastroJogo == 'S');
                            break;

                        case 3:
                            char cadastroFilme = 'N';
                            do {
                                Menu.menuCadastraFilme();

                                id = contId + 1;

                                contId++;

                                System.out.println("ID #" + id);

                                gerencia.cadastrarFilme(id);

                                System.out.println("Deseja cadastrar um novo filme - [S] / [N]?");
                                cadastroFilme = sc.next().toUpperCase().charAt(0);

                                if (cadastroFilme != 'S' && cadastroFilme != 'N') {
                                    System.out.println("Digite [S] para SIM ou [N] para NÃO");
                                }

                            } while (cadastroFilme == 'S');
                            break;

                        case 4:
                            char cadastroAlbuns = 'N';
                            do {
                                Menu.menuCadastraAlbum();

                                id = contId + 1;

                                contId++;

                                System.out.println("ID #" + id);

                                gerencia.cadastrarAlbumDeMusica(id);

                                System.out.println("Deseja cadastrar um novo album - [S] / [N]?");
                                cadastroAlbuns = sc.next().toUpperCase().charAt(0);

                                if (cadastroAlbuns != 'S' && cadastroAlbuns != 'N') {
                                    System.out.println("Digite [S] para SIM ou [N] para NÃO");
                                }

                            } while (cadastroAlbuns == 'S');
                            break;

                        case 5:
                            char cadastroBrinquedo = 'N';
                            do {

                                Menu.menuCadastraBrinquedo();

                                id = contId + 1;

                                contId++;

                                System.out.println("ID #" + id);

                                gerencia.cadastrarBrinquedo(id);

                                System.out.println("Deseja cadastrar um novo brinquedo - [S] / [N]?");
                                cadastroBrinquedo = sc.next().toUpperCase().charAt(0);

                                if (cadastroBrinquedo != 'S' && cadastroBrinquedo != 'N') {
                                    System.out.println("Digite [S] para SIM ou [N] para NÃO");
                                }


                            } while (cadastroBrinquedo == 'S');
                            break;

                        default:
                            System.out.println("Voltando ao menu principal...");


                    }
                    break;

                case 2:

                    Menu.menuListarProdutos();

                    Integer opcaoListar = sc.nextInt();

                    switch (opcaoListar) {
                        case 1:

                            Menu.menuListarLivros();
                            gerencia.listarLivros();
                            gerencia.totalLivros();
                            gerencia.pausaMenu();
                            break;

                        case 2:

                            Menu.menuListarJogos();
                            gerencia.listarJogos();
                            gerencia.totalJogos();
                            gerencia.pausaMenu();
                            break;

                        case 3:


                            Menu.menuListarFilmes();
                            gerencia.listarFilmes();
                            gerencia.totalFilmes();
                            gerencia.pausaMenu();

                            break;

                        case 4:

                            Menu.menuListarAlbuns();
                            gerencia.listarAlbuns();
                            gerencia.totalAlbuns();
                            gerencia.pausaMenu();
                            break;

                        case 5:

                            Menu.menuListarBrinquedos();
                            gerencia.listarBrinquedos();
                            gerencia.totalBrinquedos();
                            gerencia.pausaMenu();
                            break;

                        case 6:


                            Menu.menuListarTodos();
                            gerencia.listarTodos();
                            break;

                        case 7:

                            Menu.menuBuscarProdutoNome();

                            Integer escolha = sc.nextInt();

                            if (escolha == 1) {
                                gerencia.buscarLivro();

                            } else if (escolha == 2) {

                                gerencia.buscarJogo();

                            } else if (escolha == 3) {

                                gerencia.buscarFilme();

                            } else if (escolha == 4) {
                                gerencia.buscarAlbum();

                            } else if (escolha == 5) {
                                gerencia.buscarBrinquedo();
                            }

                            break;


                    }break;
                case 3:
                    Menu.menuEditarProduto();
                    Integer opcaoEditar = sc.nextInt();

                    switch (opcaoEditar) {
                        case 1:

                            Menu.menuEditarLivro();
                            gerencia.editarLivro();
                            gerencia.pausaMenu();
                            break;

                        case 2:

                            Menu.menuEditarJogo();
                            gerencia.editarJogo();
                            gerencia.pausaMenu();
                            break;

                        case 3:


                            Menu.menuEditarFilme();
                            gerencia.editarFilme();
                            gerencia.pausaMenu();

                            break;

                        case 4:

                            Menu.menuEditarAlbum();
                            gerencia.editarAlbuns();
                            gerencia.pausaMenu();
                            break;

                        case 5:

                            Menu.menuEditarBrinquedo();
                            gerencia.editarBrinquedo();
                            gerencia.pausaMenu();
                            break;
                    }





                default:
                    System.out.println("Voltando ao menu principal...");

            }



        } while (opcao != 0);
    }

}





