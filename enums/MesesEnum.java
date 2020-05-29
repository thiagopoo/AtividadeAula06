package enums;

public enum MesesEnum {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Desembro");

    private String valor;

    private MesesEnum(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return this.valor;
    }
}
