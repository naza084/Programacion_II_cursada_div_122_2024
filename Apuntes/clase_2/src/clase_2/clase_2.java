package clase_2;
import model.Estudiante;

public class clase_2 {
    enum DiaDeLaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    
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

        

        DiaDeLaSemana diaEnum = DiaDeLaSemana.MARTES;
        
        switch (diaEnum) {
            case LUNES -> System.out.println("Inicio de semana");
            case MARTES, MIERCOLES, JUEVES -> System.out.println("Días de trabajo");
            case VIERNES -> System.out.println("Casi fin de semana");
            case SABADO, DOMINGO -> System.out.println("Fin de semana");
            default -> System.out.println("Dia desconocido");
        }
        
        int nota = 85;
        String calificacion = switch (nota / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };

        System.out.println("La calificación es: " + calificacion);
        
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
        
        Estudiante estudiante = new Estudiante("Naza", "Cruz", 19, "Programacion II", 8);
        System.out.println("");

        System.out.println(estudiante);
        System.out.println(estudiante.mostrarInformacion());
    }
}
