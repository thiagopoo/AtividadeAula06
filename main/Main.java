package program;

import enums.MesesEnum;
import enums.TamanhoRoupaEnum;
import produto.Camisa;

public class Main {
    public static void main(String[] args) {

        // INFORMAR MESES
        System.out.println("--------------------------MESES---------------------------");
        System.out.println(MesesEnum.JANEIRO.getValor());
        System.out.println(MesesEnum.FEVEREIRO.getValor());
        System.out.println(MesesEnum.MARCO.getValor());
        System.out.println(MesesEnum.ABRIL.getValor());
        System.out.println(MesesEnum.MAIO.getValor());
        System.out.println(MesesEnum.JUNHO.getValor());
        System.out.println(MesesEnum.JULHO.getValor());
        System.out.println(MesesEnum.AGOSTO.getValor());
        System.out.println(MesesEnum.SETEMBRO.getValor());
        System.out.println(MesesEnum.OUTUBRO.getValor());
        System.out.println(MesesEnum.NOVEMBRO.getValor());
        System.out.println(MesesEnum.DEZEMBRO.getValor());


        //CRIAR CAMISETA

        Camisa camisa1 = new Camisa(TamanhoRoupaEnum.P, "Branco", "Infantil");
        Camisa camisa2 = new Camisa(TamanhoRoupaEnum.M, "Preto", "Adolescente");
        Camisa camisa3 = new Camisa(TamanhoRoupaEnum.G, "Roxo", "Adolescente");
        Camisa camisa4 = new Camisa(TamanhoRoupaEnum.GG, "Rosa", "Adulto");
        Camisa camisa5 = new Camisa(TamanhoRoupaEnum.XG, "Cinza", "Adulto");

        //MOSTRAR CAMISETA

        System.out.println("--------------------------CAMISETAS---------------------------");
        System.out.println(camisa1.toString());
        System.out.println(camisa2.toString());
        System.out.println(camisa3.toString());
        System.out.println(camisa4.toString());
        System.out.println(camisa5.toString());
    }
}
