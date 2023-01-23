package br.com.polotech.dadosdosprodutos;

public class Brinquedo extends Produto {

    private String nomeBrinquedo, tipo;

    private Integer id = 1;

    private String horaCadastro;

    private String dataCadastro;


    public Brinquedo(){

    }

    public String getNomeBrinquedo() {
        return nomeBrinquedo;
    }

    public void setNomeBrinquedo(String nomeBrinquedo) {
        this.nomeBrinquedo = nomeBrinquedo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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



    public Double venderBrinquedo(Double precoVenda){

        Double soma = getPreco() + precoVenda;

        return soma;
    }


    @Override
    public String toString(){
        return "\nID #" + getId()
                + "\nNome do brinquedo: " + getNomeBrinquedo()
                + "\nPreço do brinquedo - R$ " + getPreco()
                + "\nTipo do brinquedo: " + getGenero()
                + "\n";

    }

}
