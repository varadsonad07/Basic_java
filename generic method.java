package com.sunbeam;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

class Box<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class  Program {
	public static void main(String[] args) {
		
		Box <Integer>b1 = new Box<>();
		b1.setObj(11);
        Integer r1 = b1.getObj();
        System.out.println("r1 : " +r1);
        
        Box<String> b2 = new Box<>();
        b2.setObj("varad");
        String r2 = b2.getObj();
        System.out.println("r2 : " +r2);
        
        Box<Double> b3 = new Box();
        b3.setObj(33.33);
        Double r3 = b3.getObj();
        System.out.println("r3 : " +r3);
        
        List<Integer> list = new ArrayList<>();
        
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        
        for(Integer ele : list) {
        	System.out.println(ele);
        }
        
        Box<Date> b4 = new Box();
        b4.setObj(new Date());
        Date r4 = b4.getObj();
        System.out.println("r4 : "+r4);
	}
}
