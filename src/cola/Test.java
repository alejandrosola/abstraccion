package cola;

public class Test {
    public static void main(String[] args) {
        ColaBuena cola = new ColaBuena();

        cola.push("Hola");
        cola.push("Mundo");
        cola.push("Me");
        cola.push("Llamo");
        cola.push("Alejandro");

        int tam = cola.size();
        for (int i = 0; i < tam; i++) {
            System.out.println(cola.pop());
        }
    }
}
