package pila;

public class Pila {
    private String[] pila = new String[100];
    private int indice = 0;

    // Como el constructor vacío está implementado por defecto,
    // no hay necesidad de agregar uno

    public String pop() {
        if (indice == 0) {
            return null;
        }
        String valor = pila[indice - 1];
        indice--;
        return valor;
    }

    public void push(String valor) {
        if (indice == pila.length) {
            System.out.println("Pila llena");
            return;
        }
        pila[indice] = valor;
        indice++;
    }



}
