public class Esercizio3 {
    public static void main(String[] args) {
        int latoA = 2;
        int latoB = 10;
        double latoC = 10.5;
        double latoD = 20.6;
        double latoE = 30.1;
//       int sumPerimetro = (latoA *2 + latoB *2);
//        System.out.println("Questo è il perimetro: " + perimetro);
        System.out.println(perimetro(latoC, latoD));

     if (perimetro(latoA, latoB) % 2 == 0 ) {
         System.out.println("0");
     } else {
         System.out.println("1");
     }

     double p = (latoC + latoD + latoE) /2 ;
        System.out.println(p);
     double a  = Math.sqrt(p * (p - latoC) * (p-latoD) * (p-latoE));
        System.out.println("L'area è: " + a);
    }
    public static double perimetro(double n1, double n2) {
        return n1 * 2 + n2 * 2;
    }
    public static int perimetro(int n1, int n2) {
        return n1 * 2 + n2 * 2;
    }
}
