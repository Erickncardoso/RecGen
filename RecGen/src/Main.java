import models.Coordenadas;
import models.Documento;
import models.ImpressoraGenerica;
import models.ImpressoraString;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando objetos baseados em Records.
        Documento docA = new Documento("000.000.000-00" , "00.000.000-0");
        System.out.println(docA.cpf());
        System.out.println(docA.RG());

        //Trabalhando com Génericos
        //O diamente <> é um indicativo da utilizacão de genéricos
        ArrayList<String> beatles = new ArrayList<>();
        beatles.add("Jhon");
        beatles.add("Paul");
        beatles.add("George");
        beatles.add("Ringo");

        //Trabalhando com tipos sem Gerericos
        ImpressoraString dadoA = new ImpressoraString("teste");
        dadoA.imprimirDados();




        //uTILIZANDO IMPRESSORA GENERICA

        ImpressoraGenerica<String> dadoC = new ImpressoraGenerica<>("Texto");
        dadoC.imprimirDado();

        ImpressoraGenerica<Float> dadoD = new ImpressoraGenerica<>(15.77f);
        dadoD.imprimirDado();

        //Utilizando Coordenadas
        Coordenadas<String, Integer> coordA = new Coordenadas<>("145",444);
        coordA.imprimirCoordenadas();











    }
}