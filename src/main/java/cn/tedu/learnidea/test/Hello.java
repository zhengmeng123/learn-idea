package cn.tedu.learnidea.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengmeng
 * @date 2018/11/30 - 12:56
 */
public class Hello {
    public static void main(String[] args) {
        int i = 0;
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(13);

        System.out.println(list1);
        print();



    }
    public static void print() {
        System.out.println("delete1");
        System.out.println("delete2");
        System.out.println("delete3");
        System.out.println("delete4");
    }

}
