package clase_2;

public class clase_2 {

    public static void main(String[] args) {

        // Variables
        int edad;
        String nombre; // se hace referencia a la clase string con mayuscula
        double salario;
        boolean esEmpleado;

        edad = 25;
        edad += 1;
        System.out.println("Mi edad es " + edad);

        // Declaración en una sola línea
        int numero1 = 10, numero2 = 20, numero3 = 30;
        String nombre2 = "Ana", apellido = "Pérez";

        // Un valor para múltiples variables
        int x, y, z;
        x = y = z = 80;

        System.out.println(x + y + z);

        // Condicionales
        if (x > 5) {
            System.out.println("x es mayor que 5");
        } else if (x < 0) {
            System.out.println("x es negativo");
        } else {
            System.out.println("x es neutro");
        }

        // Switch
        int dia = 5;
        String diaDeLaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número inválido";
        };
        System.out.println(diaDeLaSemana);

        
        enum DiaDeLaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
        }

        DiaDeLaSemana diaEnum = DiaDeLaSemana.MARTES;
        
        switch (diaEnum) {
            case LUNES -> System.out.println("Inicio de semana");
            case MARTES, MIERCOLES, JUEVES -> System.out.println("Días de trabajo");
            case VIERNES -> System.out.println("Casi fin de semana");
            case SABADO, DOMINGO -> System.out.println("Fin de semana");
            default -> System.out.println("Dia desconocido");
        }
        
        
    }
}
