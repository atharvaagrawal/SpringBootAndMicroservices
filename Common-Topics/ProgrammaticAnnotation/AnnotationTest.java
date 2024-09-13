package com.nt.annot;

import java.util.*;

public class AnnotationTest 
{

    private int a = 10;
    private int b = 20;

    @Override
    public String toString() {
        return "a="+a+", b="+b;
    }

    @SuppressWarnings(value={"unchecked", "deprecation"})
    public static void main(String args[]) {
        AnnotationTest at = new AnnotationTest();

        System.out.println(at);

        List list = new ArrayList();
        list.add(10);
        System.out.println("list data::"+list);

        Date d = new Date();
        System.out.println("current month::"+d.getMonth());
    }
}