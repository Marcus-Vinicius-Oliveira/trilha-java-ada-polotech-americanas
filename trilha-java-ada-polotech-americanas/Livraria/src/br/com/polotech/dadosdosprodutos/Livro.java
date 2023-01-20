package br.com.polotech.dadosdosprodutos;


public class Livro extends Produto {

    private String nomeLivro, escritor, editora;

    private Integer id = 1;

    private String horaCadastro;

    private String dataCadastro;

    public Livro(){

    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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
                + "\nNome do livro: " + getNomeLivro()
                + "\nPreço do livro - R$ " + getPreco()
                + "\nGênero do livro: " + getGenero()
                + "\nEscritor do livro: " + getEscritor()
                + "\nEditora do livro: " + getEditora()
                + "\n";

    }
}
