package br.com.polotech.dadosdosprodutos;

public class AlbumDeMusica extends Produto {

    private String nomeAlbum, musicosBanda, selos;

    private Integer id = 1;

    private String horaCadastro;

    private String dataCadastro;

    public AlbumDeMusica(){

    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getMusicosBanda() {
        return musicosBanda;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(String horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    @Override
    public String toString(){

        return "\nID #" + getId()
                + "\nNome do album/Músico: " + getNomeAlbum()
                + "\nPreço do album - R$ " + getPreco()
                + "\nGênero do album: " + getGenero()
                + "\nEstúdio de gravação/selo do album: " + getSelos()
                + "\n";

    }

}
