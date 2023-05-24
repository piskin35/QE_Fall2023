package day50_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        //Queue is great for First one in first one out operations

        Queue<String> letters = new LinkedList<>();
        letters.

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("A");

        System.out.println(letters);//[A, B, C, A] // this is not "set", so we can add same elements more than once

        System.out.println(letters.remove());//A the data first in
        System.out.println(letters);//[B, C, A]


    }

}
