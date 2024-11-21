import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Integer> sumarDos = x -> x + 2;
        Function<Integer, Integer> multiplicarTres = x -> x * 2;
        Function<Integer, Integer> dividirDos = x -> x % 2 == 0 ? x / 2 : x;

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        System.out.println("Sumar 2:");
        Operacion.aplicarOperacion(numeros, sumarDos);

        System.out.println("Multiplicar 3:");
        Operacion.aplicarOperacion(numeros, multiplicarTres);

        System.out.println("Dividir 2:");
        Operacion.aplicarOperacion(numeros, dividirDos);
        // TODO : seguir con el ejercicio 5
        // luego con los demas y volver al proyecto del JSON
    }
}