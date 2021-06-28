/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaio
 */
public class demobicycle {
    public static void main(String[] args) {
        bicycle bike1=new bicycle();
        bike1.setCadence(50);
        bike1.setGear(5);
        bike1.setSpeed(60);
        
        bike1.info();
        
        
        bicycle bike2=new bicycle();
        bike2.setCadence(70);
        bike2.setGear(8);
        bike2.setSpeed(90);
        
        bike2.info();
    }
}
