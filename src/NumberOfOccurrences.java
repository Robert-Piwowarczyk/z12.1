import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

 class NumberOfOccurrences {
     public static void main(String[] args) {
         final String fileName = "Numbers.txt";

         TreeSet<String> number = new TreeSet<>(new Comparator<String>() {
             @Override
             public int compare(String number1, String number2) {
                 return number1.compareTo(number2);
             }
         });
         try(Scanner sc = new Scanner(new File(fileName))) {
             while (sc.hasNextLine()) {
                 number.add(sc.nextLine());
             }
             System.out.println(number + " - liczba wystąpień: ");
             } catch (FileNotFoundException e) {
             System.err.println("Brak pliku " + fileName);
         }
     }
 }