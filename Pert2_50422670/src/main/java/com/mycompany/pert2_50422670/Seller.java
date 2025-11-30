/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2_50422670;

/**
 *
 * @author nando
 */
public class Seller {
    private String product;
    
    public void addProduct(String productName){
        System.out.println("Seller menggunakan produk " + productName);
        this.product = productName;
    }
}
