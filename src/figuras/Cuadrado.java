package figuras;

import java.awt.*;

public class Cuadrado extends figurageometrica{ //Herencia
    public Cuadrado(double valor1){
        super(valor1);
    }

    @Override  //Polimorfismo
    public double getArea() {
        double lado = super.getValor1();
        return Math.pow(lado,2);
    }

}
