import java.util.Scanner;
class Resta {
    int a, b;

    Resta() {
        System.out.println("SE ESTA CONSTRUYENDO LA RESTA");
    }

    public void restaA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        a = scanner.nextInt();
    }

    public void restaB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el segundo numero: ");
        b = scanner.nextInt();
    }

    public void mostrarResultado() {
        System.out.println("El resultado es: " + (a - b));
    }
}