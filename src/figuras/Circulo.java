package figuras;

public class Circulo extends figurageometrica{ //Herencia
    public Circulo(double valor1){
        super(valor1);
    }

    @Override  //Polimorfismogit 
    public double getArea(){
        double radio = super.getValor1();
        return  Math.PI * Math.pow(radio,2);
    }
}
