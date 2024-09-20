package com.nit.main;

import com.nit.ston.Printer;

public class App {
    public static void main(String[] args) {
    	// singleton test
    	Printer printer1 = Printer.getInstance();
    	Printer printer2 = Printer.getInstance();
    	
    	System.out.println(printer1.hashCode()+"  "+printer2.hashCode());
    	System.out.println("----------------");
    	System.out.println(printer1==printer2);
    }
}
