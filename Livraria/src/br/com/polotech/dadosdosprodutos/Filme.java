package br.com.polotech.dadosdosprodutos;

public class Filme extends Produto {

    private String nomeFilme, estudio, diretores, produtores;

    private Integer id = 1;

    private String horaCadastro;

    private String dataCadastro;

    public Filme(){

    }

    public String getNomeFilme(){
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }

    public String getEstudio(){
        return estudio;
    }

    public void setEstudio(String estudio){
        this.estudio = estudio;
    }

    public String getDiretores(){
        return diretores;
    }

    public void setDiretores(String diretores){
        this.diretores = diretores;
    }

    public String getProdutores(){
        return produtores;
    }

    public void setProdutores(String produtores){
        this.produtores = produtores;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getHoraCadastro() {
        return horaCadastro;
    }


    public void setHoraCadastro(String horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString(){
        return "\nID #" + getId()
                + "\nNome do filme: " + getNomeFilme()
                + "\nPreço do filme - R$ " + getPreco()
                + "\nGênero do filme: " + getGenero()
                + "\nEstúdio do filme: " + getEstudio()
                + "\nDiretores do filme: " + getDiretores()
                + "\nProdutores do filme: " + getProdutores()
                + "\n";

    }


}
