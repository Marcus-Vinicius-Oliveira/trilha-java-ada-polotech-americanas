package br.com.polotech.utilitarios;

import br.com.polotech.dadosdosprodutos.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaGerencia {

    List<Livro> livros = new ArrayList<>();
    List<Jogo> jogos = new ArrayList<>();
    List<Filme> filmes = new ArrayList<>();

    List<AlbumDeMusica> albunsDemusica = new ArrayList<>();

    List<Brinquedo> brinquedos = new ArrayList<>();

    public void cadastrarLivro(Integer id){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        livro.setId(id);

        System.out.print("Nome do livro: ");
        livro.setNomeLivro(sc.nextLine());

        System.out.print("Preço do livro - R$ ");
        livro.setPreco(sc.nextDouble());

        sc.nextLine();// limpa o scanner

        System.out.print("Gênero do livro: ");
        livro.setGenero(sc.nextLine());

        System.out.print("Escritor do livro: ");
        livro.setEscritor(sc.nextLine());

        System.out.print("Editora do livro: ");
        livro.setEditora(sc.nextLine());

        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        livro.setDataCadastro(dataHora.format(formtData));
        livro.setHoraCadastro(dataHora.format(formtHora));

        livros.add(livro);


    }

    public void cadastrarJogo(Integer id){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();

        jogo.setId(id);


        System.out.print("Nome do Jogo ");
        jogo.setNomeJogo(sc.nextLine());

        System.out.print("Preço do jogo - R$ ");
        jogo.setPreco(sc.nextDouble());

        sc.nextLine();// limpa o scanner

        System.out.print("Gênero do jogo: ");
        jogo.setGenero(sc.nextLine());

        System.out.print("Distribuidora do jogo: ");
        jogo.setDistribuidora(sc.nextLine());

        System.out.print("Estúdio de criação do jogo: ");
        jogo.setEstudio(sc.nextLine());

        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        jogo.setDataCadastro(dataHora.format(formtData));
        jogo.setHoraCadastro(dataHora.format(formtHora));

        jogos.add(jogo);


    }

    public void cadastrarFilme(Integer id){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme();

        filme.setId(id);


        System.out.print("Nome do filme: ");
        filme.setNomeFilme(sc.nextLine());

        System.out.print("Preço do filme - R$ ");
        filme.setPreco(sc.nextDouble());

        sc.nextLine();// limpa o scanner

        System.out.print("Gênero do filme: ");
        filme.setGenero(sc.nextLine());

        System.out.print("Estúdio de filmagem: ");
        filme.setEstudio(sc.nextLine());

        System.out.print("Diretores do filme: ");
        filme.setDiretores(sc.nextLine());

        System.out.print("Produtores do filme: ");
        filme.setProdutores(sc.nextLine());

        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        filme.setDataCadastro(dataHora.format(formtData));
        filme.setHoraCadastro(dataHora.format(formtHora));

        filmes.add(filme);

    }

    public void cadastrarAlbumDeMusica(Integer id){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        AlbumDeMusica albumDeMusica = new AlbumDeMusica();

        albumDeMusica.setId(id);


        System.out.print("Nome do Album: ");
        albumDeMusica.setNomeAlbum(sc.nextLine());

        System.out.print("Preço do album - R$ ");
        albumDeMusica.setPreco(sc.nextDouble());

        sc.nextLine();// limpa o scanner

        System.out.print("Músicos/Banda do album: ");
        albumDeMusica.setMusicosBanda(sc.nextLine());

        System.out.print("Gênero do album: ");
        albumDeMusica.setGenero(sc.nextLine());

        System.out.print("Gravadora/Selo do album: ");
        albumDeMusica.setSelos(sc.nextLine());

        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        albumDeMusica.setDataCadastro(dataHora.format(formtData));
        albumDeMusica.setHoraCadastro(dataHora.format(formtHora));

        albunsDemusica.add(albumDeMusica);

    }

    public void cadastrarBrinquedo(Integer id){


        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Brinquedo brinquedo = new Brinquedo();

        brinquedo.setId(id);

        System.out.print("Nome do brinquedo: ");
        brinquedo.setNomeBrinquedo(sc.nextLine());

        System.out.print("Preço do brinquedo - R$ ");
        brinquedo.setPreco(sc.nextDouble());

        sc.nextLine();// limpa o scanner

        System.out.print("Tipo do brinquedo ");
        brinquedo.setTipo(sc.nextLine());

        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        brinquedo.setDataCadastro(dataHora.format(formtData));
        brinquedo.setHoraCadastro(dataHora.format(formtHora));

        brinquedos.add(brinquedo);


    }

    public void listarLivros(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (Livro livro: livros) {
            System.out.print("\nID #" + livro.getId());
            System.out.print("\nNome do livro: " + livro.getNomeLivro());
            System.out.print("\nPreço do livro - R$ " + livro.getPreco());
            System.out.print("\nGênero do livro: " + livro.getGenero());
            System.out.print("\nEscritor do livro: " + livro.getEscritor());
            System.out.print("\nEditora do livro: " + livro.getEditora());
            System.out.println("\n=======================================");
            System.out.println("Cadastrado em " + livro.getDataCadastro() + " as " + livro.getHoraCadastro());
            System.out.println("=======================================");


            System.out.print("\n");

        }


    }

    public void listarJogos(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (Jogo jogo: jogos) {
            System.out.print("\nID #" + jogo.getId());
            System.out.print("\nNome do jogo: " + jogo.getNomeJogo());
            System.out.print("\nPreço do jogo - R$ " + jogo.getPreco());
            System.out.print("\nGênero do jogo: " + jogo.getGenero());
            System.out.print("\nDistribuidora do jogo: " + jogo.getDistribuidora());
            System.out.print("\nEstúdio de criação do jogo: " + jogo.getEstudio());
            System.out.println("\n=======================================");
            System.out.println("Cadastrado em " + jogo.getDataCadastro() + " as " + jogo.getHoraCadastro());
            System.out.println("=======================================");

            System.out.print("\n");


        }


    }

    public void listarFilmes(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (Filme filme: filmes) {
            System.out.print("\nID #" + filme.getId());
            System.out.print("\nNome do filme: " + filme.getNomeFilme());
            System.out.print("\nPreço do filme - R$ " + filme.getPreco());
            System.out.print("\nGênero do filme: " + filme.getGenero());
            System.out.print("\nEstúdio do filme: " + filme.getEstudio());
            System.out.print("\nDiretores do filme: " + filme.getDiretores());
            System.out.print("\nProdutores do filme: " + filme.getProdutores());
            System.out.println("\n=======================================");
            System.out.println("Cadastrado em " + filme.getDataCadastro() + " as " + filme.getHoraCadastro());
            System.out.println("=======================================");



            System.out.print("\n");

        }


    }

    public void listarAlbuns(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (AlbumDeMusica album:albunsDemusica) {
            System.out.print("\nID #" + album.getId());
            System.out.print("\nNome do album/Músico: " + album.getNomeAlbum());
            System.out.print("\nPreço do album - R$ " + album.getPreco());
            System.out.print("\nGênero do album: " + album.getGenero());
            System.out.print("\nEstúdio de gravação/selo do album: " + album.getSelos());
            System.out.println("\n=======================================");
            System.out.println("Cadastrado em " + album.getDataCadastro() + " as " + album.getHoraCadastro());
            System.out.println("=======================================");

            System.out.print("\n");


        }
    }

    public void listarBrinquedos(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        for (Brinquedo brinquedo: brinquedos) {
            System.out.print("\nID #" + brinquedo.getId());
            System.out.print("\nNome do brinquedo: " + brinquedo.getNomeBrinquedo());
            System.out.print("\nPreço do brinquedo - R$ " + brinquedo.getPreco());
            System.out.print("\nTipo do brinquedo: " + brinquedo.getTipo());
            System.out.println("\n=======================================");
            System.out.println("Cadastrado em " + brinquedo.getDataCadastro() + " as " + brinquedo.getHoraCadastro());
            System.out.println("=======================================");


        }
    }

    public void listarTodos(){

        livros.forEach(System.out::println);
        jogos.forEach(System.out::println);
        filmes.forEach(System.out::println);
        albunsDemusica.forEach(System.out::println);
        brinquedos.forEach(System.out::println);

        Integer total = livros.size() + filmes.size() + jogos.size() + albunsDemusica.size() + brinquedos.size();
        System.out.printf("Total de produtos em estoque [%d] \n\n", total);
    }

    public void totalLivros(){
        System.out.printf("Temos um total de [%d] livros em estoque ", livros.size());
    }

    public void totalJogos(){

        System.out.printf("Temos um total de [%d] jogos em estoque ", jogos.size());

    }

    public void totalFilmes(){

        System.out.printf("Temos um total de [%d] filmes em estoque ", filmes.size());

    }

    public void totalAlbuns(){
        System.out.printf("Temos um total de [%d] Álbuns em estoque ", albunsDemusica.size());

    }

    public void totalBrinquedos(){

        System.out.printf("Temos um total de [%d] brinquedos em estoque ", brinquedos.size());

    }




    public void buscarLivro(){

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");

        System.out.println("Digite o nome do livro para buscar: ");

        System.out.println("======================================");

        System.out.print("==> ");

        String nomeLivro = sc.nextLine();

        for (int i =0; i < livros.size(); i++) {
            Livro livroTemp = livros.get(i);

            if (nomeLivro.equals(livroTemp.getNomeLivro())) {
                System.out.println("\n<==> LIVRO ENCONTRADO <==>");
                System.out.println(livros.get(i));
                break;
            }

        }

    }

    public void buscarJogo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");

        System.out.println("Digite o nome do jogo para buscar: ");

        System.out.println("===================================");

        System.out.print("==> ");

        String nomeJogo = sc.nextLine();

        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogoTemp = jogos.get(i);

            if (nomeJogo.equals(jogoTemp.getNomeJogo())) {
                System.out.println("\n<==> JOGO ENCONTRADO <==>");
                System.out.println(jogos.get(i));
                break;
            }

        }
    }


    public void buscarFilme() {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");

        System.out.println("Digite o nome do filme para buscar: ");

        System.out.println("====================================");

        System.out.print("==> ");

        String nomeFilme = sc.nextLine();

        for (int i = 0; i < filmes.size(); i++) {
            Filme filmeTemp = filmes.get(i);

            if (nomeFilme.equals(filmeTemp.getNomeFilme())) {
                System.out.println("\n<==> FILME ENCONTRADO <==>");
                System.out.println(filmes.get(i));
                break;
            }

        }
    }

    public void buscarAlbum(){

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");

        System.out.println("Digite o nome do álbum para buscar: ");

        System.out.println("====================================");

        System.out.print("==> ");

        String nomeAlbum = sc.nextLine();

        for (int i = 0; i < albunsDemusica.size(); i++) {
            AlbumDeMusica albumTemp = albunsDemusica.get(i);

            if (nomeAlbum.equals(albumTemp.getNomeAlbum())) {
                System.out.println("\n<==> ÁLBUM ENCONTRADO <==>");
                System.out.println(albunsDemusica.get(i));
                break;
            } else {
                System.out.println("Produto não encontrado");
            }

        }

    }

    public void buscarBrinquedo(){

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");

        System.out.println("Digite o nome do brinquedo para buscar");

        System.out.println("=======================================");

        System.out.print("==> ");

        String nomeBrinquedo = sc.nextLine();

        for (int i = 0; i < brinquedos.size(); i++) {
            Brinquedo brinTemp = brinquedos.get(i);
            if (nomeBrinquedo.equals(brinTemp.getNomeBrinquedo())) {
                System.out.println("\n<==> BRINQUEDO ENCONTRADO <==>");
                System.out.println(brinquedos.get(i));
                break;
            }


        }

    }

    public void editarLivro(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        for (int i = 0; i < livros.size(); i++) {
            Livro livroTemp = livros.get(i);
            System.out.println(livroTemp);
        }

        System.out.print("Digite o ID: ");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        System.out.print("Novo nome do livro: ");
        String novoNome = sc.nextLine();

        System.out.print("Novo preço do livro - R$ ");
        Double novoPreco = sc.nextDouble();

        sc.nextLine();// limpa o scanner

        System.out.print("Novo gênero do livro: ");

        String novoGenero = sc.nextLine();

        System.out.print("Escritor do livro: ");

        String novoEscritor = sc.nextLine();

        System.out.print("Editora do livro: ");

        String novoEditora = sc.nextLine();

        Livro livro1 = livros.get(idBusca - 1);
        sc.nextLine();

        livro1.setNomeLivro(novoNome);
        livro1.setPreco(novoPreco);
        livro1.setGenero(novoGenero);
        livro1.setEscritor(novoEscritor);
        livro1.setEditora(novoEditora);


        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        livro.setDataCadastro(dataHora.format(formtData));
        livro.setHoraCadastro(dataHora.format(formtHora));


    }


    public void editarJogo(){
        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();

        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogoTemp = jogos.get(i);
            System.out.println(jogoTemp);
        }

        System.out.print("Digite o ID: ");

        Integer idBusca = sc.nextInt();


        sc.nextLine();

        System.out.print("Novo nome do jogo: ");
        String novoNome = sc.nextLine();

        System.out.print("Novo preço do jogo - R$ ");
        Double novoPreco = sc.nextDouble();

        sc.nextLine();// limpa o scanner

        System.out.print("Novo gênero do jogo: ");

        String novoGenero = sc.nextLine();

        System.out.print("Distribuidora do jogo: ");

        String novaDistribuidora = sc.nextLine();

        System.out.print("Estúdio de criação do jogo: ");

        String novoEstudioC = sc.nextLine();

        Jogo jogo1 = jogos.get(idBusca - 1);
        sc.nextLine();

        jogo1.setNomeJogo(novoNome);
        jogo1.setPreco(novoPreco);
        jogo1.setGenero(novoGenero);
        jogo1.setEstudio(novoEstudioC);
        jogo1.setDistribuidora(novaDistribuidora);


        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        jogo.setDataCadastro(dataHora.format(formtData));
        jogo.setHoraCadastro(dataHora.format(formtHora));




    }

    public void editarFilme(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        Scanner sc = new Scanner(System.in);
        Filme filme = new Filme();

        for (int i = 0; i < filmes.size(); i++) {
            Filme filmTemp = filmes.get(i);
            System.out.println(filmTemp);
        }

        System.out.print("Digite o ID: ");

        Integer idBusca = sc.nextInt();


        sc.nextLine();

        System.out.print("Novo nome do filme: ");
        String novoNome = sc.nextLine();

        System.out.print("Novo preço do filme - R$ ");
        Double novoPreco = sc.nextDouble();

        sc.nextLine();// limpa o scanner

        System.out.print("Novo gênero do filme: ");
        String novoGenero = sc.nextLine();

        System.out.print("Novo estúdio do filme: ");
        String novoEstudio = sc.nextLine();

        System.out.print("Diretores do filme: ");
        String novoDiretor = sc.nextLine();

        System.out.print("Produtores do filme:");
        String novoProdutor = sc.nextLine();

        Filme filme1 = filmes.get(idBusca - 1);
        sc.nextLine();

        filme1.setNomeFilme(novoNome);
        filme1.setPreco(novoPreco);
        filme1.setGenero(novoGenero);
        filme1.setEstudio(novoEstudio);
        filme1.setDiretores(novoDiretor);
        filme1.setProdutores(novoProdutor);


        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        filme.setDataCadastro(dataHora.format(formtData));
        filme.setHoraCadastro(dataHora.format(formtHora));

    }

    public void editarAlbuns(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        Scanner sc = new Scanner(System.in);
        AlbumDeMusica albumDeMusica = new AlbumDeMusica();

        for (int i = 0; i < albunsDemusica.size(); i++) {
            AlbumDeMusica albumTemp = albunsDemusica.get(i);
            System.out.println(albumTemp);
        }

        System.out.print("Digite o ID: ");

        Integer idBusca = sc.nextInt();


        sc.nextLine();

        System.out.print("Novo nome do álbum: ");
        String novoNome = sc.nextLine();

        System.out.print("Novo preço do álbum - R$ ");
        Double novoPreco = sc.nextDouble();

        sc.nextLine();// limpa o scanner

        System.out.print("Novo gênero do album: ");
        String novoGenero = sc.nextLine();

        System.out.print("Novo estúdio de gravação/selo do album: ");
        String novoEstudio = sc.nextLine();

        AlbumDeMusica albumDeMusica1 = albunsDemusica.get(idBusca - 1);
        sc.nextLine();

        albumDeMusica1.setNomeAlbum(novoNome);
        albumDeMusica1.setPreco(novoPreco);
        albumDeMusica1.setGenero(novoGenero);
        albumDeMusica1.setSelos(novoEstudio);


        System.out.println("=============================================");

        System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

        System.out.println("=============================================");

        albumDeMusica.setDataCadastro(dataHora.format(formtData));
        albumDeMusica.setHoraCadastro(dataHora.format(formtHora));

    }

    public void editarBrinquedo(){

        LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formtHora = DateTimeFormatter.ofPattern("HH:mm:ss");


        Scanner sc = new Scanner(System.in);
        Brinquedo brinquedo = new Brinquedo();

        for (int i = 0; i < brinquedos.size(); i++) {
            Brinquedo brinTemp = brinquedos.get(i);
            System.out.println(brinTemp);
        }

        System.out.print("Digite o ID: ");

        Integer idBusca = sc.nextInt();


            sc.nextLine();

            System.out.print("Novo nome do brinquedo: ");
            String novoNome = sc.nextLine();

            System.out.print("Novo preço do brinquedo - R$ ");
            Double novoPreco = sc.nextDouble();

            sc.nextLine();// limpa o scanner

            System.out.print("Novo tipo do brinquedo ");
            String novoTipo = sc.nextLine();

            Brinquedo brinquedo1 = brinquedos.get(idBusca - 1);
            sc.nextLine();

            brinquedo1.setNomeBrinquedo(novoNome);
            brinquedo1.setPreco(novoPreco);
            brinquedo1.setTipo(novoTipo);


            System.out.println("=============================================");

            System.out.println("Produto cadastrado em " + dataHora.format(formtData) + " as " + dataHora.format(formtHora));

            System.out.println("=============================================");

            brinquedo.setDataCadastro(dataHora.format(formtData));
            brinquedo.setHoraCadastro(dataHora.format(formtHora));

    }

    public void removerLivro(){

        Scanner sc = new Scanner(System.in);

        livros.forEach(System.out::println);

        System.out.print("\nDigite o ID do produto para ser removido: # ");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        livros.removeIf(livro -> livro.getId().equals(idBusca));

        System.out.println("\nProduto Removido!");

        System.out.println("\nLISTA ATUAL DE PRODUTOS EM ESTOQUE:");

        livros.forEach(System.out::println);

    }

    public void removerJogo(){

        Scanner sc = new Scanner(System.in);

        jogos.forEach(System.out::println);

        System.out.print("\nDigite o ID do produto para ser removido: # ");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        jogos.removeIf(jogo -> jogo.getId().equals(idBusca));

        System.out.println("\nProduto Removido!");

        System.out.println("\nLISTA ATUAL DE PRODUTOS EM ESTOQUE:");

        jogos.forEach(System.out::println);

    }

    public void removerFilme(){

        Scanner sc = new Scanner(System.in);

        filmes.forEach(System.out::println);

        System.out.print("\nDigite o ID do produto para ser removido: # ");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        filmes.removeIf(fil -> fil.getId().equals(idBusca));

        System.out.println("\nProduto Removido!");

        System.out.println("\nLISTA ATUAL DE PRODUTOS EM ESTOQUE:");

        filmes.forEach(System.out::println);

    }

    public void removerAlbum(){

        Scanner sc = new Scanner(System.in);

        albunsDemusica.forEach(System.out::println);

        System.out.print("\nDigite o ID do produto para ser removido: # ");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        albunsDemusica.removeIf(alb -> alb.getId().equals(idBusca));

        System.out.println("\nProduto Removido!");

        System.out.println("\nLISTA ATUAL DE PRODUTOS EM ESTOQUE:");

        albunsDemusica.forEach(System.out::println);

    }

    public void removerBrinquedo(){

        brinquedos.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ID do produto para ser removido: #");

        Integer idBusca = sc.nextInt();

        sc.nextLine();

        brinquedos.removeIf(brinq -> brinq.getId().equals(idBusca));

        System.out.println("\nProduto Removido!");

        System.out.println("\nLISTA ATUAL DE PRODUTOS EM ESTOQUE:");

        brinquedos.forEach(System.out::println);

    }


    public void pausaMenu(){
        Scanner sc = new Scanner(System.in);

        sc.nextLine();

    }


}
