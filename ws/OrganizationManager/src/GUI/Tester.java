/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

/**
 *
 * @author ADMIN
 */
public class Tester{
public static void main(String[] args){
Colony obj1=new BeeColony("honey", "land", 2000);
System.out.println(obj1);
obj1.grow();
obj1. reproduce();
University obj2=new FPTUniversity("cantho", "FPT", 100000);
System.out.println(obj2);
obj2.endroll();
obj2.educate();
Role df= new BeeColony("wasp", "land", 3000);
System.out.println(df);
df.createWorker();
df= new FPTUniversity("Hanoi", "FPT", 100000);
System.out.println(df);
df.createWorker();
}
}
