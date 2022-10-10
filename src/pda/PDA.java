/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pda;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author iTTaste
 */
public class PDA {

    /**
     * @param args the command line arguments
     */
    
    static char st[] = new char[200];
    static int pntr = 0;
 
    static void push(char e) {
        st[pntr] = e;
        pntr++;
    }
 
    static void pop() {
        pntr--;
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        File text = new File("file.txt");
     
        //Creating Scanner instance to read File in Java
        Scanner scan = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        
        String line = null;
        while(scan.hasNextLine()){
            line = scan.nextLine();
            boolean f = false;
        int i;
        for (i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '0') {
                push('0');
            } else {
                break;
            }
        }
        for (; i < line.length(); i++) {
            if (line.charAt(i) == '0') {
                f = false;
                break;
            } else {
                pop();
            }
        }
        if (pntr == 0) {
            f = true;
        }
        if (f == true) {
            System.out.println(line+"   String Accepted");
            pntr=0;
        } else {
            System.out.println(line+"   String rejected");
            pntr=0;
        }
            
        }
    }
        }
    
