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
public class Electric extends Product{
    String guaranty;
    String voltage;
    String power;
    public Electric(){
        super(); //Gọi hàm khởi tạo của lớp cha
    }
    public Electric(String guaranty,String voltage,String power,String code,String name,String make,long price){
        super(code,name, make, price);//Gọi hàm khởi tạo có tham só của lớp cha
        this.guaranty= guaranty;
        this.voltage= voltage;
        this.power=power;
    }

    public String getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public void printout(){
        System.out.print(code + "-" + name + "-" + make + "-" + price + "-");
        System.out.println(guaranty + "-" + voltage + "-" + power);
        System.out.println("------------------");
    }
   
}

