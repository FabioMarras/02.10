import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome");
        String name = input.nextLine();
        System.out.println("Scrivi il tuo cognome");
        String surname = input.nextLine();
        System.out.println("Scrivi la tua età");
        String eta = input.nextLine();
        System.out.println("Ti chiami: " + name + " " + surname + " e hai: " + eta + " anni");
        String [] myArray = {name, surname, eta };


        for (int i = 0 ; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}

