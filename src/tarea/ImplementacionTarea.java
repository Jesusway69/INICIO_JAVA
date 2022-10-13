package tarea;

public class ImplementacionTarea extends Walter implements Operaciones {

    @Override
    public double cuadrado(double x) {
        double y = x;
        double z = y * y;
        return z;
    }

    @Override
    public double cubo(double x) {
        return Math.pow(x,3);
    }

    @Override
    public double raizcuadrada(double x) {
        double y = distanciaEntreDosPuntos(x, x);                   //distanciaEntreDosPuntos(5, 7);
        return Math.sqrt(y);
    }

    @Override
    public double cuadrado(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area(double base, double altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double area(double lado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
