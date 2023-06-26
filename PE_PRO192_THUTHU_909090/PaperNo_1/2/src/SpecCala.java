
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
        super();
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, color: %d", super.toString(),color);
    }
    public void setData(){
        setOwner(getOwner().substring(0, 2) + "XX" + getOwner().substring(3));
        }
    int getValue(){
        if (color%2==0) {
            setPrice(getPrice()+3);
        } else {
            setPrice(getPrice()+7);
        }
        return getPrice();
        }
    }