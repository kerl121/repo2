package com.fk.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 提示并从键盘录入数据
        System.out.println("请输入一个包含数字和字母的字符串:");
        String s = new Scanner(System.in).nextLine();

        // 方法一:使用charAt()方法返回索引值进行遍历
        // 字母字符
        String word = "";
        // 数字字符
        String num = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                word += c;
            } else if (c >= '0' && c <= '9') {
                num += c;
            }
        }
        System.out.println("拼接成的新字符串为:" + num + word);

    }
}
