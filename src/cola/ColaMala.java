package cola;

public class ColaMala {
    private String[] cola = new String[100];
    private int indice = 0;

    // Como el constructor vacío está implementado por defecto,
    // no hay necesidad de agregar uno

    public String pop() {
        if (indice == 0) {
            return null;
        }
        String valor = cola[0];
        indice--;

        // Desplazar la cola (MUY INEFICIENTE)
        for (int i = 0; i < indice; i++) {
            cola[i] = cola[i + 1];
        }

        return valor;
    }

    public void push(String valor) {
        if (indice == cola.length - 1) {
            System.out.println("Pila llena");
            return;
        }
        cola[indice] = valor;
        indice++;
    }

    public int size() {
        return indice;
    }

}
