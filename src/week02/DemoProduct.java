/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;

/**
 *
 * @author Vaio
 */
public class DemoProduct {
    public static void main(String[] args) {
        Electric e1 = new Electric("3 years", "220v", "800w","B0001", "Microwave", "Korea", 800);
        e1.printout();
        Ceramic c1 = new Ceramic("Porcelain", "c0002","Porcelain Vases","Viet Nam", 30);//Bình hoa làm bằng sứ
        c1.printout();
        Food f1= new Food("chocolate","f0002","France","90000","12062000",90000);
        f1.printout();
    }
}
