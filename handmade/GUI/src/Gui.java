

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author ADMIN
 */
public class Gui { 
    public static void main(String[] args) {
        JFrame frame= new JFrame();//tạo frame
        frame.setTitle("title goes here");
        frame.setVisible(true);//make frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setSize(600, 600);//đặt cao rộng cho frame
        frame.setResizable(false);//ngăn resize frame
        ImageIcon image =new ImageIcon("src\\image\\test.jpg");//tạo logo app (để ý dường dẫn)
        frame.setIconImage(image.getImage());//đổi icon app
    }
}
