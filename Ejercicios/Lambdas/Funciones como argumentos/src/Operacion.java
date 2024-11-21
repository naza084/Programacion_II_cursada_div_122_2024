import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Operacion {

    public static void aplicarOperacion(List<Integer> enteros, Function<Integer, Integer> transformacion) {
        List<Integer> listaResultante = new ArrayList<>();

        for (Integer elemento : enteros) {
            listaResultante.add(transformacion.apply(elemento));
        }

        mostrarLista(listaResultante);
    }

    private static void mostrarLista(List<Integer> elementos) {
        elementos.forEach(System.out::println);
    }
}
