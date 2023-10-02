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

        System.out.println(reverse(name, surname, eta));
        System.out.println(contact(name, surname, eta));

        input.close();
    }
    public static String reverse(String str1, String str2, String str3) {
        return str3 + str2 + str1;
    }
    public static String contact(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }
}

