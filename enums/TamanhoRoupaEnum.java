package enums;

public enum TamanhoRoupaEnum {
    P("Pequeno"),
    M("Médio"),
    G("Grande"),
    GG("Super Grande"),
    XG("Extra Grande");

    private String descricao;

    private TamanhoRoupa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
