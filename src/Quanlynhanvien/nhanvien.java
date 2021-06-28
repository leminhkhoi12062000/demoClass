/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quanlynhanvien;

/**
 *
 * @author Vaio
 */
public class nhanvien {
    String hoten;
    String diachi;
    String manv;
    String phone;
    long luong;
    
    
    public nhanvien(){
        hoten = "Nguyen Van An";
        manv ="0001";
        diachi="FPT Q9";
        phone="097865434";
        luong= 15000000;
    }
    
    public nhanvien(String manv, String hoten, String phone , String diachi, long luong){
        this.manv = manv;
        this.diachi = diachi;
        this.hoten = hoten;
        this.luong =luong;
        this.phone = phone;
    }
    
    public void outputinfo(){
        
        System.out.println("" + manv + "\t-\t" + hoten + "\t-\t" + diachi + "\t-\t" + phone + "\t-\t" + luong );
    }
}
