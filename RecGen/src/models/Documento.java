package models;

//Records providencia classes rápidas que são
// capases de criar objetos imutáveis.

//Produzem automaticamente construtores e
// gatters para as suas propriedades.

//São utilizadas geralmente para obrigar
// um conceito chamado Dto - Data Transfer Object.



public record Documento(String cpf, String RG) {

    //Não preciso programar NADA!!!
    //A não ser, que necessidade de algum métod0 a mais.

}
