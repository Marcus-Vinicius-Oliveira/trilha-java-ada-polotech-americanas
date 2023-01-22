package br.com.polotech.dadosdosprodutos;

public abstract class Produto {

    private String nome, genero;
    private Double preco;


    public Produto(){

    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }


}





