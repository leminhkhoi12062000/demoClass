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
public class Food extends Product{
    String date;
    String expiredDate;
    
    
    public Food(){
        super();
    }
    public Food(String date,String expiredDate,String code ,String name,String make,long price){
        super(code,name,make,price);
        this.date=date;
        this.expiredDate=expiredDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
    public void printout(){
        System.out.print(code + "-" + name + "-" + make + "-" + price + "-") ;
        System.out.println(date + "-" + expiredDate);
        System.out.println("-------------------");
    }
}

