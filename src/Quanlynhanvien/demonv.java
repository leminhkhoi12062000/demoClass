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
public class demonv {
    public static void main(String[] args) {
        nhanvien nhanvien1=new nhanvien();
        nhanvien1.outputinfo();
        
        nhanvien nhanvien2=new nhanvien("1206","Le Minh Khoi","0909418120","Q7",20000000);
        nhanvien2.outputinfo();
    }
}
