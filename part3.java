/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class part3 {
    public static String toTitleCase(String input){
        StringBuilder titleCase =new StringBuilder(input.length());
        boolean nextTitleCase=true;
        for (char c:input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase=true;
            } else if(nextTitleCase) {
                c=Character.toTitleCase(c);
                nextTitleCase=false;
            }
            titleCase.append(c);
        }
        return titleCase.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

for(int j = 0;j < 10; j++) {

       System.out.println(" enter student name:");

              String str1 = sc.nextLine();

       StringBuffer newStr=new StringBuffer(str1);  

             for(int i = 0; i < str1.length(); i++) {  

                  //Checks for lower case character  

          if(Character.isLowerCase(str1.charAt(i))) {  

              //Convert it into upper case using toUpperCase() function  

              newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  

          }  

          }  

      System.out.println("String after case conversion : " + newStr);  

  }  

}  
}
