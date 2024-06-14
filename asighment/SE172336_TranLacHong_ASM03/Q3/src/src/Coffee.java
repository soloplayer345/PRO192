
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Coffee extends Beverage {

    private int expire;
    private String type;

    public Coffee() {
    }

    public Coffee(String id, String name, double price, int quantity, String type, int expire) {
        super(id, name, price, quantity);
        setExpire(expire);
        setType(type);
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        if (expire >= 1 && expire <= 180) {
            this.expire = expire;
        } else {
            this.expire = 180;
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        type = Mylibs.toTitleCase(type);
        String[] listType = {"Special", "High", "Medium", "Low"};
        List checkType = Arrays.asList(listType);
        if (checkType.contains(type)) {
            this.type = type;
        } else {
            this.type = "Medium";
        }
    }

    @Override
    double subTotal() {
        double rate;
        if (super.getId().startsWith("DB") || type.equals("Special")) {
            rate = 1.2;
        } else {
            if (super.getId().startsWith("HC") || type.equals("High")) {
            rate = 1.1;
            }
            else{
                if (type.equals("Medium") && expire<=30) {
                    rate=0.5;
                } else {
                    rate = 1;
                }
            }
        }
        return super.getPrice() * super.getQuantity() * rate;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.03f,%d,%.03f", super.getId(), super.getName(), type, expire, super.getPrice(), super.getQuantity(), subTotal());
    }

}
