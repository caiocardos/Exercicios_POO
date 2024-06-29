public class atv00 {
    public static double sqrt(double n, double epsilon) {
        if(n < 1){
            return 0.0;
        }
        double x, y, abs;
        boolean res;
        x = n/2;
        do{
            y = (1.0/2)*(x + (n/x));
            abs = (y-x<0) ? -(y-x):(y-x);
            res = abs < epsilon;
            x = y;
        } while(!res);
        return y;
    }

    public static boolean isPerfectNumber(long number) {
        return false;
    }

    public static String encrypt(String message, int key) {
        return "";
    }

    public static String decrypt(String encryptedMessage, int key) {
        return "";
    }
    
    public static void main(String[] args) throws Exception {
        System.out.print("A raiz quadrada de 2 com precisao de 0.001 eh: ");
        System.out.printf("%.6f \n", sqrt(2.0, 0.001));
    }
}
