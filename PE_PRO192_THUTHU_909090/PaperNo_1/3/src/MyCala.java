

import com.sun.org.apache.xerces.internal.impl.XMLErrorReporter;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> list) {
        int count = 0;
        for (Cala cala : list) {
            if(cala.getOwner().charAt(1) >= 'A' && cala.getOwner().charAt(1) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> list) {
        Cala min = list.get(0);
        for (Cala cala : list) {
            if(cala.getPrice() < min.getPrice()){
                cala = min;
            }
            
        }
        Cala secondMin = null;
        int count = 0;
        for (Cala cala : list) {
            if(cala.getPrice() < min.getPrice()){
                count++;
            }
            if(count == 2){
                secondMin = cala;
                break;
            }
        }
        if(secondMin != null){
            list.remove(secondMin);
        }
    }

    @Override
    public void f3(List<Cala> list) {
        Collections.sort(list);
            
        
    }
    
}
