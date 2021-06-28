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
public class Ceramic extends Product{
    String type;
    public Ceramic(){
        super();
    }
    public Ceramic(String type,String code, String name , String make, long price){
        super(code,name,make,price);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void printout(){
        System.out.println(code + "-" + name + "-" + make + "-" + price + "-" + type);
        System.out.println("------------------");
    }
}
