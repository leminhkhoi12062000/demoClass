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
public class Product {
    String code;
    String name;
    String make;
    long price;
    public Product(){
        super();
        
    }
    public Product(String code,String name,String make,long price){
        this.code= code;
        this.name= name;
        this.make=make;
        this.price=price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
