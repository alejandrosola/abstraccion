package cola;

public class ColaBuena {
    private String[] cola = new String[100];
    private int indice = 0;
    private int primero = 0;
    private int ultimo = -1;

    // Como el constructor vacío está implementado por defecto,
    // no hay necesidad de agregar uno

    public String pop() {
        if (size() == 0) {
            return null;
        }

        String valor = cola[primero];

        if (primero == cola.length) {
            primero = 0;
        } else {
            primero++;
        }
        indice--;
        return valor;
    }

    public void push(String valor) {
        if (indice == cola.length) {
            System.out.println("Pila llena");
            return;
        }

        if (ultimo == cola.length) {
            ultimo = 0;
        } else {
            ultimo++;
        }

        cola[ultimo] = valor;
        indice++;
    }

    public int size() {
        return ultimo - primero + 1;
    }

}
