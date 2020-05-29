package produto;

import enums.TamanhoRoupaEnum;

public class Camisa {

    private TamanhoRoupaEnum tamanho;
    private String cor, categoria;

    public Camisa(TamanhoRoupaEnum tamanho, String cor, String categoria){
        this.tamanho = tamanho;
        this.cor = cor;
        this.categoria = categoria;
    }

    public String toString(){
        return "Tamanho: " + tamanho.getDescricao() + " - Cor: " + cor + " - Categoria: " + categoria;
    }

    public TamanhoRoupaEnum getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoRoupaEnum tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
