package com.fk.test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *
 * 提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
 * 遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），
 * 按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。
 * */
public class Test02 {
    public static void main(String[] args) {
        //提示用户输入
        System.out.println("请输入一个字符串（必须包含数字和字母）：");
        //创建键盘录入对象
        String str = new Scanner(System.in).nextLine();
        //定义字符字符
        String word = "";
        //定义数字字符
        String num = "";
        //遍历字符串分别筛选出数字和字母
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                word += c;
            } else if (c >= '0' && c <= '9') {
                num += c;
            }
        }
        System.out.println("新的字符串：" + num + word);
    }
}
