package contarpares;

public class ContadorPares {

    public static void main(String[] args) {
        int cantidadPares = mostrarCantidadPares(100); // Llama al método mostrarCantidadPares con 100
        System.out.println("Hay " + cantidadPares + " números pares del 0 al 100");
    }

    public static int mostrarCantidadPares(int n) {
        int contadorPares = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                contadorPares++;
        }
        return contadorPares; // Devuelve la variable contadorPares
    }
}