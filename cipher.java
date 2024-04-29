import java.util.*;

class cipher {
  public static void main(String[] args) {
    //First Scanner
    Scanner scan = new Scanner(System.in);
    
    //Variables
    int let = 0;
    String decsion = " ";
    String choice = " ";
    int shift = 0;
    boolean x = true;
    boolean y = false;
    boolean z = true;

//While Loops
    while (z == true) {

      //Basic Questions To Encrypt or Decrypt
      while (x == true) {
        System.out.print("Encrypt or Decrypt: ");
        decsion = scan.nextLine();
        decsion = decsion.toLowerCase();
        if (decsion.equals("encrypt") || decsion.equals("decrypt")) {

          System.out.print("Enter text: ");
          choice = scan.nextLine();

          System.out.print("Shift Value: ");
          Scanner scan2 = new Scanner(System.in);
          shift = scan2.nextInt();
          x = false;
        }

      }
      
      //Encrypt and Decrypt
      for (int i = 0; i < choice.length(); i++) {
        let = (int) choice.charAt(i);

        //Encrypt
        if (decsion.equals("encrypt")) {
          if (let > 64 && let < 91) {
            let = let + shift;
            while (let > 90) {
              let = let - 26;
            }
            char text = (char) let;
            System.out.print(text);
          }

          else if (let > 96 && let < 123) {
            let = let + shift;
            while (let > 122) {
              let = let - 26;
            }
            char text = (char) let;
            System.out.print(text);
          } else {
            char text = (char) let;
            System.out.print(text);
          }
          y = true;
          z = false;
        }

        // Decrypt
        if (decsion.equals("decrypt")) {
          if (let > 64 && let < 91) {
            let = let - shift;
            while (let < 65) {
              let = let + 26;
            }
            char text = (char) let;
            System.out.print(text);
          }

          else if (let > 96 && let < 123) {
            let = let - shift;
            while (let < 97) {
              let = let + 26;
            }
            char text = (char) let;
            System.out.print(text);
          } else {
            char text = (char) let;
            System.out.print(text);
          }
          y = true;
          z = false;
        }

      }
      
      //Use Cipher Again Code
      String again = " "; 
      while (y == true) {
        System.out.print("\nAnother one? ");
        again = scan.nextLine();
        again = again.toLowerCase();
        if (again.equals("yes")) {
          z = true;
          x = true;
          y = false;
        } else if (again.equals("no")) {
          y = false;
        }
      }
    }

  }
}