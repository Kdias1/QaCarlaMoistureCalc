import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Enter [1] for Fine (Clay), [2]  for Medium (Loamy) or [3] for Coarse (Sandy)");
        int type = scan.nextInt();
     
        System.out.println("Enter with moisture Value");
    
     float moisture = scan.nextFloat();
     Soil soil = new Soil();
     String answer = soil.calculMoisture(moisture, type);
     
     System.out.println("The moisture Status " + answer);
     
  }
}