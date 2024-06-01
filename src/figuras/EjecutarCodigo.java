package figuras;

public class EjecutarCodigo {
    public static void main(String[] args) {

        Circulo circulo1= new Circulo(5.4);
        System.out.println(circulo1.getArea());

        Cuadrado cuadrado1 = new Cuadrado(5);
        System.out.println(cuadrado1.getArea());

        triangulo triangulo1 = new triangulo(8, 2);
        System.out.println(triangulo1.getArea());

        Rectangulo rectangulo1 = new Rectangulo(6, 6);
        System.out.println(rectangulo1.getArea());

    }
}
