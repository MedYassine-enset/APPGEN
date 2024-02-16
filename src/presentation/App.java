package presentation;

import metier.StockageGenerique;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        StockageGenerique<Integer> stockageInteger=new StockageGenerique<>(new ArrayList<>());
        stockageInteger.addElement(12);
        stockageInteger.addElement(10);
        System.out.println(stockageInteger.getSize());
        try {
            System.out.println(stockageInteger.getElement(5));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        StockageGenerique<Double> stockageDouble=new StockageGenerique<>(new ArrayList<>());
        stockageDouble.addElement(12.0);
        stockageDouble.addElement(15.0);
        try {
            System.out.println(stockageDouble.getElement(0));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
