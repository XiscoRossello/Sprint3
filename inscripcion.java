import java.util.Scanner;

public class inscripcion {
    public static void main(String[] args) {
    int points = 0;
    int alumn =(int) (Math.random() * 101);
    
    System.out.println("Alumne: " + alumn);
    Scanner scanner = new Scanner(System.in); 

    System.out.println("Té l'alumne almenys un germà al centre? y/n");
    String brotherString = scanner.nextLine();
    System.out.println("Viu a la mateixa població on s'ubica el centre? y/n");
    String locationString = scanner.nextLine();
    System.out.println("Algun dels pares fa feina a la mateixa població on s'ubica el centre? y/n");
    String workString = scanner.nextLine();
    System.out.println("Té l'alumne cap discapacitat superior al 33% o malaltia cronica? y/n");
    String disableString = scanner.nextLine();
    System.out.println("Forma part l'alumne d'una familia nombrosa o monoparental? y/n");
    String familyString = scanner.nextLine();

    if (brotherString.equals("y")) {
        points += 40;
    }
    if (locationString.equals("y")) {
        points += 30;
    }
    if (workString.equals("y")) {
        points += 20;
    }
    if (disableString.equals("y")) {
        points += 10;
    }
    if (familyString.equals("y")) {
        points += 15;
    }

    System.out.println("L'alumne " + alumn + " té " + points + " punts.");
    scanner.close();
}
}

