import java.util.Scanner;


public class IntegerCheck {
    
//  Declaring class variables
    static String result;
    static int count;
    static int size;
    static boolean k = false ;
    static String failMessage = "Invalid input\n";
    static String passMessage = " is a valid integer ,thank you.\n";
    
    
//  Start of the calling method
    static void isInteger(String input){
        
//      Checks if the input is empty
        if (input.isEmpty()){
           System.out.println(failMessage); 
           
       }
//      Use of String method trim to erase whitespaces from both start and end of the input
//      and checking again if it is emmpty
        else {
            result = input.trim();
            if (result.isEmpty()){
                System.out.println(failMessage);   
            }
            
//          if none of the above then we have a valid String so we measure its length 
//          and check whether each character is a digit, whitespace or '-'
            else{
                size = result.length();
                count = 0;
                for (int i = 0 ; i < size ; i++){
                    if (result.charAt(i) == '0' || result.charAt(i) == '1' 
                        || result.charAt(i) == '2' || result.charAt(i) == '3'
                        || result.charAt(i) == '4' || result.charAt(i) == '5' 
                        || result.charAt(i) == '6' || result.charAt(i) == '7' 
                        || result.charAt(i) == '8' || result.charAt(i) == '9'
                        || result.charAt(i) == '-'){
                        
                        count += 1;   
                }
//              even one character doesn't match then possibly not an integer so break the loop
                else {
                    break;
                }
             }
//           if the for-loop procedure was succesful proceed for additional checkings 
//           else 'count' variable is 0 so go to line 83
             if (count == size){
//               checks the case user has input more than once the minus symbol
                 if(result.indexOf("-") - result.lastIndexOf("-") < 0){
                    System.out.println(failMessage);     
                 }
                 
//               checks if the minus symbol is somewhere in the String except 0 index
                 else if(result.indexOf("-")> 0){
                    System.out.println(failMessage);
                 }
                 
//               if not the above then the minus symbol might be at 0 index of the string 
//               so we are ready to convert the string number to integer number
                 else if(result.indexOf("-")== 0){
                    int number = Integer.parseInt(result);
                    System.out.println(number + passMessage);
//                  Once the conversion is done k variable stops the while loop in main method
                    k = true;
                 }
                 
//               It is the case where there isn't any minus symbol 
//               so we proceed the conversion with a 'positive' String number 
                 else{
                    int number = Integer.parseInt(result);
                    System.out.println(number + passMessage);
                    k = true;
                 }  
             }
             else{
                    System.out.println(failMessage);        
             }
            }  
        }
    }
    public static void main(String[] args) {
//     Creation of a new object of type Scanner
       Scanner obj = new Scanner(System.in);
       
//     Asking the user to input an integer until it is valid using a while loop
        while (k == false) {
            System.out.println("Please enter an Integer: ");
            String input  = obj.nextLine();
          
//          Calls a method inside the loop
            isInteger(input); 
        }
       
       
//      End of program
        obj.close();
           
    } 
       
}