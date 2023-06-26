/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{

    @Override
    public int f1(String string) {
        String[] arr = string.split(" ");
        int count = 0;
        for (String str : arr) {
            if(str.charAt(1) >= '0' && str.charAt(1) <= '9'){
                if(str.charAt(1) % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
//        String[] arr = string.split(" ");
//        int count =0;
//        for (String string1 : arr) {
//            if(string1.charAt(count))
//        }
return null; 
    }
    
}
