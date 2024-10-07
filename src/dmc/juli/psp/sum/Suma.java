package dmc.juli.psp.sum;
public class Suma {

    public static final int OPERADOR_1 = 0;
    public static final int OPERADOR_2 = 1;
    public static void main(String[] args) throws Exception {
        definirSumar(Integer.parseInt(args[OPERADOR_1]), Integer.parseInt(args[OPERADOR_2]));
    }

    private static void definirSumar(int numero1, int numero2){
        System.out.println((numero1 > numero2)? sumar(numero2, numero1) : (numero2 > numero1)? sumar(numero1, numero2) : numero1);
    }

    private static int sumar(int numero1, int numero2){
        int total = 0;
        for (int i = numero1; i <= numero2; i++) {
            total += i;
        }

        return total;
    }
}