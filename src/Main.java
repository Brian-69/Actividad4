import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure;
        double length;
        String operation;

        System.out.println("¿Qué figura deseas calcular? (círculo o cuadrado)");
        figure = scanner.nextLine();

        System.out.println("¿Cuál es la longitud de la " + figure + "? (lado o radio)");
        length = scanner.nextDouble();

        System.out.println("¿Qué operación deseas realizar? (diagonal, perímetro, área o circunferencia)");
        operation = scanner.next();

        if (figure.equals("círculo")) {
            Circle circle = new Circle((double) length);
            if (operation.equals("circunferencia")) {
                System.out.println("La circunferencia del círculo es: " + circle.getCircumference());
            } else if (operation.equals("área")) {
                System.out.println("El área del círculo es: " + circle.getArea());
            } else {
                System.out.println("Operación inválida para un círculo");
            }
        } else if (figure.equals("cuadrado")) {
            Square square = new Square((double) length);
            if (operation.equals("diagonal")) {
                System.out.println("La diagonal del cuadrado es: " + square.getDiagonal());
            } else if (operation.equals("perímetro")) {
                System.out.println("El perímetro del cuadrado es: " + square.getPerimeter());
            } else if (operation.equals("área")) {
                System.out.println("El área del cuadrado es: " + square.getArea());
            } else {
                System.out.println("Operación inválida para un cuadrado");
            }
        } else {
            System.out.println("Figura inválida");
        }
    }
}