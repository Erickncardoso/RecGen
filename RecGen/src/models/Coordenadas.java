package models;

public class Coordenadas<X, Y> {

    //Propriedades
    private X coordX;
    private Y coordY;

    //Construtor

    public Coordenadas(X coordX, Y coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }


    //Métod0

    public void imprimirCoordenadas(){
        System.out.println("Coordenadas X: " + coordX);
        System.out.println("Coordenadas Y: " + coordY);

    }
}
