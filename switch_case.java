package com.pbo;
import java.util.Scanner;

public class TestSwitchCase {    
    // Method Program 9
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    // Deklarasi Variabel Program 10
    int x = 5;
    
    // Deklarasi Variabel Program 11
    int y;
    
    public static void main(String[] args) {        
        System.out.println("=== Kumpulan Program PBO ===");
        System.out.println("1. Variabel");
        System.out.println("2. Tipe Data");
        System.out.println("3. Operator");
        System.out.println("4. String");
        System.out.println("5. Boolean");
        System.out.println("6. If Else");
        System.out.println("7. While Loop");
        System.out.println("8. Break");
        System.out.println("9. Method");
        System.out.println("10. Class & Object");
        System.out.println("11. Class & Atribut");
        System.out.println("12. Constructor");
        System.out.println("============================");
        System.out.print("Pilih program : ");
        
        
        Scanner scanP = new Scanner (System.in);
        int menu = scanP.nextInt();
        
        System.out.println("");
        
        
        switch (menu) {
            case 1:
                System.out.println("[Output Program 1]");
                String firstName = "SMKTI ";
                String lastName = "BaliGlobal";
                String fullName = firstName + lastName;
                System.out.println(fullName); 
                break;
            case 2:
                System.out.println("[Output Program 2]");
                int myNum = 5;
                float myFloatNum = 5.99f;
                char myLetter = 'D';
                boolean myBool = true;
                String myText = "Hello";
                System.out.println(myNum);
                System.out.println(myFloatNum);
                System.out.println(myLetter);
                System.out.println(myBool);
                System.out.println(myText);
                break;
            case 3:
                System.out.println("[Output Program 3]");
                int sum1 = 100 + 50;
                int sum2 = sum1 + 250;
                int sum3 = sum2 + sum2;
                System.out.println(sum1);
                System.out.println(sum2);
                System.out.println(sum3); 
                break;
            case 4:
                System.out.println("[Output Program 4]");
                String txt = "Hello World";
                System.out.println(txt.toUpperCase());
                System.out.println(txt.toLowerCase());
                break;
            case 5:
                System.out.println("[Output Program 5]");
                int x = 10;
                int y = 9;
                System.out.println(x > y); // returns true, because 10 is higher than 9
                break;
            case 6:
                System.out.println("[Output Program 6]");
                // Output 1
                System.out.println("-- Output 1 :");
                if (20 > 18) {
                System.out.println("20 is greater than 18"); // obviously
                } 
                // Output 2
                System.out.println("-- Output 2 :");
                int time = 20;
                if (time < 18) {
                    System.out.println("Good day.");
                } else {
                    System.out.println("Good evening.");
                }
                break;
            case 7:
                System.out.println("[Output Program 7]");
                int i = 0;
                while (i < 5) {
                System.out.println(i);
                    i++;
                }
                break;
            case 8:
                System.out.println("[Output Program 8]");
                // Penggunaan Break
                System.out.println("-- Break : ");
                for (int b = 0; b < 10; b++) {
                    if (b == 4) {
                        break;
                    }
                System.out.println(b);
                }
                // Penggunaan Continue
                System.out.println("-- Continue : ");
                for (int c = 0; c < 8; c++) {
                    if (c == 4) {
                        continue;
                    }
                System.out.println(c);
                }
                break;
            case 9:
                System.out.println("[Output Program 9]");
                myMethod();
                myMethod();
                myMethod();  
                break;
            case 10:
                System.out.println("[Output Program 10]");
                // Output 1
                System.out.println("-- Output 1 : ");
                KumpulanProgram myObj = new KumpulanProgram();
                System.out.println(myObj.x);
                
                // Output 2
                System.out.println("-- Output 2 : ");
                KumpulanProgram myObj1 = new KumpulanProgram();
                KumpulanProgram myObj2 = new KumpulanProgram();
                System.out.println(myObj1.x);
                System.out.println(myObj2.x);
                break;
            case 11:
                System.out.println("[Output Program 11]");
                KumpulanProgram myObjek = new KumpulanProgram();
                myObjek.y = 40;
                System.out.println(myObjek.y);
                break;
            case 12:
                System.out.println("[Output Program 12]");
                KumpulanProgram myObyek = new KumpulanProgram();
                System.out.println(myObyek.x);
                break;
        }
    }
}
