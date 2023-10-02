public class Esercizio {
    public static void main(String[] args) {
        String[] fiveString = {"primo", "secondo", "terzo", "quarto", "quinto"};
        System.out.println("Hello world");
        int primoNum = 2;
        int secondoNum = 3;
        int risultato = primoNum * secondoNum;
        System.out.println("La somma è = " + risultato);

        String str = "Sono il primo numero";
        System.out.println(str + " " + primoNum);
        String[] myArray = newArray(fiveString, "NUOVO ELEMENTO");
        System.out.println("Primo array di 5: ");
        for (String elements : fiveString) {
            System.out.println(elements);
        }
        System.out.println("Array con il nuovo elemento: ");
        for (String elements : myArray) {
            System.out.println(elements);
        }
    }


    public static String[] newArray(String[] array, String newString) {
        String[] myArray = new String[array.length + 1];
        for (int i = 0; i < 2; i++) {
            myArray[i] = array[i];
        }
        myArray[2] = newString;
        for (int i = 2; i< array.length; i++) {
            myArray[i +1] = array[i];
        }
        return myArray;
    }
}
