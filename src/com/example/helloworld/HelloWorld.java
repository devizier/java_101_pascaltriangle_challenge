package com.example.helloworld;

import java.util.LinkedList;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    public static LinkedList sum(int strNum) {

        LinkedList triangle = new LinkedList();
        LinkedList res = new LinkedList();
        int d = 0;

        for (int i = 0; i < strNum; i++) {
            triangle.add(0);
            d = i;
        }
        triangle.set(0, 1);

        for (int j = 1; j < strNum; j++) {
            for (int i = d; i >= 1; i--) {
                int a = (int) triangle.get(i - 1);
                int b = (int) triangle.get(i);
                triangle.set(i, a + b);
            }
        }

        for (int i = 0; i < strNum; i++) {
            if (triangle.get(i) != "0") {
                int y = (int) triangle.get(i);
                res.add(y);
            }
        }

        return res;
    }
}