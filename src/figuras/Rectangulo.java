package figuras;

public class Rectangulo extends figurageometrica{ //Herencia
    public double valor1;
    public double altura;

    public Rectangulo(double valor1, double altura) {
        super(valor1);
        this.valor1 = valor1;
        this.altura = altura;

    }


    @Override //Polimorfismo
    public double getArea(){
        double valor1 = super.getValor1();
        return valor1 * altura;
    }
}
