package br.com.polotech.utilitarios;

import br.com.polotech.dadosdosprodutos.Livro;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    public static void exibirMenu(){

        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|              MENU DE OPÇÕES               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar produto                     |");
        System.out.println("| 2 - Produtos em estoque                   |");
        System.out.println("| 3 - Editar produto                        |");
        System.out.println("| 4 - Remover produto                       |");
        System.out.println("| 5 - Venda do produto                      |");
        System.out.println("| 6 - Financeiro                            |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuCadastroProduto(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|       QUAL PRODUTO DESEJA CADASTRAR?      |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Livro                                 |");
        System.out.println("| 2 - Jogo                                  |");
        System.out.println("| 3 - Filme                                 |");
        System.out.println("| 4 - Álbuns de música                      |");
        System.out.println("| 5 - Brinquedos                            |");
        System.out.println("| 0 - voltar                                |");
        System.out.println("+-------------------------------------------+");
    }

    public static void menuBuscarProdutoNome(){
        System.out.println("+-------------------------------------------+");
        System.out.println("|       QUAL PRODUTO DESEJA PROCURAR?      |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Livro                                 |");
        System.out.println("| 2 - Jogo                                  |");
        System.out.println("| 3 - Filme                                 |");
        System.out.println("| 4 - Álbuns de música                      |");
        System.out.println("| 5 - Brinquedos                            |");
        System.out.println("| 0 - voltar                                |");
        System.out.println("+-------------------------------------------+");
    }

    public static void menuCadastrarLivro(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|            CADASTRO DE LIVRO              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
    }

    public static void menuCadastraJogo(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|            CADASTRO DE JOGO              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
    }

    public static void menuCadastraFilme(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|            CADASTRO DE FILME              |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
    }

    public static void menuCadastraAlbum(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        CADASTRO DE AlBUM DE MÚSICA        |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
    }

    public static void menuCadastraBrinquedo(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|          CADASTRO DE BRINQUEDO            |");
        System.out.println("+-------------------------------------------+");
        System.out.println();
    }

    public static void menuListarProdutos(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|         QUAL PRODUTO DESEJA LISTAR?       |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Livro                                 |");
        System.out.println("| 2 - Jogo                                  |");
        System.out.println("| 3 - Filme                                 |");
        System.out.println("| 4 - Álbuns de música                      |");
        System.out.println("| 5 - Brinquedos                            |");
        System.out.println("| 6 - Todos                                 |");
        System.out.println("| 7 - Procurar produto por nome             |");
        System.out.println("| 0 - voltar                                |");
        System.out.println("+-------------------------------------------+");
    }

    public static void menuListarLivros(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|       LISTA DOS LIVROS EM ESTOQUE:        |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuListarJogos(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        LISTA DOS JOGOS EM ESTOQUE:        |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuListarFilmes(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|       LISTA DOS FILMES EM ESTOQUE         |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuListarAlbuns(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|    LISTA DOS ALBUNS/MÚSICOS EM ESTOQUE    |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuListarBrinquedos(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|            LISTA DE BRINQUEDOS:           |");
        System.out.println("+-------------------------------------------+");

    }

    public static void menuListarTodos(){
        System.out.println("\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|   LISTA - TOTAL DE PRODUTOS EM ESTOQUE:   |");
        System.out.println("+-------------------------------------------+");

    }

}
