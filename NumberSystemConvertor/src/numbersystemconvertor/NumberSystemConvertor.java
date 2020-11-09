package numbersystemconvertor;

import java.util.Scanner;


public class NumberSystemConvertor {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello my name is Andreas and i am a number convertor ,what's yours?");
        String name = sc.nextLine();
        
        System.out.println("So " + name + " do you want to convert numbers? Y/N");
        String answer = sc.nextLine();
        if (answer.equals("Y")){
            System.out.println("Great ,let's convert your number");
            System.out.println("Enter a number:");
            String n = sc.next();
            System.out.println("Type the number's base : D/d for decimal ,B/b for binary, H/h for hexademical or O/o for octal");
            String firstBase = sc.next();
            System.out.println("Type the base you wish the conversion to be done , D/d for decimal ,B/b for binary, H/h for hexademical or O/o for octal");
            String secondBase= sc.next();
            
            
            if (firstBase.equals("D")){
                int number = Integer.parseInt(n);
                if (secondBase.equals("B")){
                    String binaryNumber = Integer.toBinaryString(number);
                    System.out.println(number + " = " + binaryNumber);
                }
                else if (secondBase.equals("H")){
                    String hexNumber = Integer.toHexString(number);
                    System.out.println(number + " = " + hexNumber);
                }
                else if (secondBase.equals("O")){
                    String octalNumber = Integer.toOctalString(number);
                    System.out.println(number + " = " + octalNumber);
                }
            
            }
        
            else if (firstBase.equals("B")){
                int x = Integer.parseInt(n,2);
                if (secondBase.equals("D")){
                    System.out.println(n + " = " + x);
                }
                else if (secondBase.equals("H")){
                    System.out.println(n + " = " + Integer.toHexString(x));
                }
                else if (secondBase.equals("O")){
                    System.out.println(n + " = " + Integer.toOctalString(x));
                }   
            }
            else if (firstBase.equals("H")){
                int x = Integer.parseInt(n,16);
                if (secondBase.equals("D")){
                    System.out.println(x);
                }
                else if (secondBase.equals("B")){
                    System.out.println(n + " = " + Integer.toBinaryString(x));
                }
                else if (secondBase.equals("O")){
                    System.out.println(n + " = " + Integer.toOctalString(x));
                }   
            }
            else if (firstBase.equals("O")){
                int x = Integer.parseInt(n,8);
                if (secondBase.equals("D")){
                    System.out.println(n +" = " + x);
                }
                else if (secondBase.equals("B")){
                    System.out.println(n + " = " + Integer.toBinaryString(x));
                }
                else if (secondBase.equals("H")){
                    System.out.println(n + " = " + Integer.toHexString(x));
                }   
            }
            
            }
            else {
                System.out.println("Ok nice to meet you ,goodbye");
            }
        
    }
    
}
