/*Brunna Vila Chã
0050016542*/

public class BikeTester {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.marca = "Caloi";
        bike.qtdMarchas = 5;
        bike.cor = "Azul";

        bike.andar();
        bike.frear();
    }
}