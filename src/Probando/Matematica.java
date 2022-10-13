package Probando;

public class Matematica {
    
    //METODO QUE DEVUELVA LA HIPOTENUSA DE UN TRIANGULO RECTANGULO A PARTIR DE SUS CATETOS
    public static double hipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
    }
    
    //METODO QUE DEVUELVA LA COORDENAD POLAR A PARTIR DE UNA COORDENADA RECTANGULAR
    public static double[] obtenerCoordenadaPolar(double x, double y) {
        double radio = Math.sqrt(x*x + y*y);
        double angulo = Math.atan(x/y);
        double[] radioAngulo = new double[2];
        radioAngulo[0] = radio;
        radioAngulo[1] = angulo;
        return radioAngulo;
    }
    
    //METODO QUE DEVUELVA UN NUMERO ALEATORIO DADO [1,6]
    public static int obtenerNumeroAleatorio1_6() {
        return (int)(Math.random()*6 + 1);
    }
}
