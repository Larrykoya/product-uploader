/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productupload;

import javax.swing.*;

/**
 *
 * @author LARRY
 */
public class ProductUpload extends JFrame{
    
    public ProductUpload(){
            uploaderFrame();
    }
    private void uploaderFrame() {
        JPanel p1 = new JPanel();
        JLabel productImageLabel = new JLabel("*Product Image: ");
        JLabel productNameLabel = new JLabel("*Product Name: ");
        JLabel productDescriptionLabel = new JLabel("Product Description: ");
        JTextField productName = new JTextField(20);
        JTextArea description = new JTextArea(4,15);
        JButton newProduct = new JButton("Add Item");
        JButton allproducts = new JButton("View All Products");
        this.setSize(400,300);
        this.setTitle("Product Uploader");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(p1);
        p1.add(productNameLabel);
        p1.add(productName);
        p1.add(productDescriptionLabel);
        p1.add(description);
        p1.add(newProduct);
        p1.add(allproducts);
        
        
                
    }
    
    public static void main(String[] args) {
        new ProductUpload();
    }

    
}
