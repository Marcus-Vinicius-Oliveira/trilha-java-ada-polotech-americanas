package br.com.polotech.dadosdosprodutos;

public class Jogo extends Produto {

    private String nomeJogo, distribuidora, estudio;

    private Integer id = 1;

    private String horaCadastro;

    private String dataCadastro;

    public Jogo(){

    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoraCadastro(){
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
                + "\nNome do jogo: " + getNomeJogo()
                + "\nPreço do jogo - R$ " + getPreco()
                + "\nGênero do jogo: " + getGenero()
                + "\nDistribuidora do jogo: " + getDistribuidora()
                + "\nEstúdio de criação do jogo: " + getEstudio()
                + "\n";

    }


}
