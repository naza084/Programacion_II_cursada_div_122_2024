public class Main {
    public static void main(String[] args) {

        Suma suma1 = new Suma();
        Suma suma2 = new Suma(){
            @Override
            public int operar(int a, int b) {
                return a + b;
            }
        };

        Operable suma3 = (a, b) -> a + b;

        System.out.println(suma1.operar(5, 5));
        System.out.println(suma2.operar(5, 5));
        System.out.println(suma3.operar(5, 5));
    }
}