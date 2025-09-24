package models;

//Para gerar uma Classe  generica, utilizamos uma propriedade generica
//O nome da prop gen pode ser  definida por uma letra
//Letras mais utilizadas
//T - Type
// E - Element
// N - Number
// K - Key
// V - Value
public class ImpressoraGenerica<T>{

    //DONE: Propriedades

    private T dado;

    //DONE: Constutores

    public ImpressoraGenerica(T dado) {
        this.dado = dado;
    }


    //DONE; Gatters e Setters

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    //DONE: Métod0
    public void imprimirDado(){
        System.out.println(dado);
    }


}
