/*
 * HARSH SHAKYA
 * FEB 17, 2022
 * COMP SCI ASSIGNMENT 2 
 * SIMPLE ENCRYPTION
 * Mr. Martins 
 */
package SimpleEncryptionHarsh;
import java.util.*; // Imports every single class in Java

public class SimpleEncryptionHarsh {
    
    public static String ENCRYPTPROGRAM1(String str, int changestring) { // Encrypt the string
    
       String ARRAY[] = str.split(" "); // Split command to turn them into individual values
       String encryptedstring = "";

       for (int i=0; i < ARRAY.length; i++){ // For loop created for the multiple values

           String word = ARRAY[i];
           char characters[] = word.toCharArray(); // Array of all letters

           for (int w=0; w < characters.length; w++){ // For loop 

               characters[w] += changestring; // Encryption
           }
           
           String encryp = String.valueOf(characters); // Turn the numeric values into a string

           // Encrypt the variable
           encryptedstring += encryp;
           encryptedstring += " ";
           encryp = "";
       }

       // returns the encrypted message
       return encryptedstring;
   }

   public static String DECRYPTPROGRAM2(String str, int changestring) { // Decrypt the string

       String array[] = str.split(" "); // Split command to turn them into individual values
       String decryptedstring = "";

       for (int i=0; i < array.length; i++){ // For loop created for the multiple values

           String decryptword = array[i];

           // array of all the characters 
           char characters[] = decryptword.toCharArray();

    
           for (int j=0; j < characters.length; j++){ // For loop
               characters[j] -= changestring;
           }

           String decryp = String.valueOf(characters); // convert the array into a string

           // decrypt the variable
           decryptedstring += decryp;
           decryptedstring += " ";
           decryp = "";
       }

       return decryptedstring; // Return the decrypted string
   }
   public static void main(String[] args) {

       Scanner userinput = new Scanner(System.in); // 

        System.out.println("--------------------------------");
        System.out.println("The ENCRYPTION PROGRAM - HARSH SHAKYA"); // Title
        System.out.print("Please enter a phrase: "); // Prompt the phrase command

       String str = userinput.nextLine(); // Command to input phrase
       str = str.toUpperCase();

       System.out.print("Please enter the character rotation amount (1-25): "); // shift amount 
       int changestring = userinput.nextInt();

       // options for user
       System.out.println("--------------------------------");
       System.out.println("Please pick");
       System.out.println("--------------------------------");
       System.out.println("1. Encrypt");
       System.out.println("2. Decrypt. ");
       System.out.println("--------------------------------");
       System.out.print("1 or 2: ");
       int options = userinput.nextInt(); // Prompt to pick between Encrypt or Decrypt

       // If statement setup for the user to either enter 1 or 2
       if (options == 1){ // Display the answers

           // answer 1 encryption
           String answer1 = ENCRYPTPROGRAM1(str, changestring);
           System.out.println("--------------------------------");
           System.out.println("The origninal phrase is: " + str);
           System.out.println("The encrypted phrase is: " +answer1);
           System.out.println("--------------------------------");
       }

       else if (options == 2){ // Display the answers

           // answer 2 decryption
           String answer2 = DECRYPTPROGRAM2(str, changestring);
           System.out.println("--------------------------------");
           System.out.println("The origninal phrase is: " + str);
           System.out.println("The decrypted phrase is: " +answer2);
           System.out.println("--------------------------------");
       }
   }
}


    

