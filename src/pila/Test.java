package pila;

public class Test {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push("Mundo");

        System.out.println(pila.pop());

        pila.push("Hola");
        System.out.println(pila.pop());
        System.out.println(pila.pop());


    }
}
