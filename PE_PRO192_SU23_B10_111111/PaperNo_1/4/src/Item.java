/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Item implements IService{
    private String id;
    private String name;
    private int size;

    public Item(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    @Override
    public String formatSize() {
        if (id.equals("ZARA")&&size>=0&&size<=4) {
            return "XS";
        }
        else if (id.equals("ZARA")&&size>4&&size<=6) {
            return "S";
        }
        else if (id.equals("MANGO")&&size>=0&&size<=4){
            return "S";
        }
        else if (id.equals("MANGO")&&size>4&&size<=6){
            return "M";
        }
        return "L";
    }

    @Override
    public String FormatName() {
        return String.format("[%s]", name.trim());
    }
    
}
