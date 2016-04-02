package com.example.HelloWorldTest;

import com.example.helloworld.HelloWorld;
import java.util.LinkedList;

/**
 * Created by alexandershakun on 02.04.16.
 */
public class HelloWorldTest {

        public static void main(String[] args) {
            System.out.println(testsum());
        }

        public static String testsum() {
            LinkedList testList = new LinkedList();
            testList.add(1);
            testList.add(2);
            testList.add(1);

            LinkedList check = HelloWorld.sum(3);
            if (check.containsAll(testList)) {
                return "all right";
            }

            return "Ooops, check out your solution!";
        }

}
