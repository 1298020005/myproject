package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 937.重新排列日志文件
 * 建议再看,没做出来
 * 有关自定义 Arrays.sort compareto 的理解
 * 地址 https://leetcode-cn.com/problems/reorder-data-in-log-files/solution/java-zi-ding-yi-pai-xu-xiang-xi-zhu-shi-ht7sy/
 */
public class ThirtySeven {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (a, b) -> {
            //分割字符串，split(String regex, int limit)，limit表示分割的份数。
            String[] splitA = a.split(" ", 2);
            String[] splitB = b.split(" ", 2);
            //判断日志类型
            boolean aIsDigit = Character.isDigit(splitA[1].charAt(0));
            boolean bIsDigit = Character.isDigit(splitB[1].charAt(0));
            //a和b都是字母日志
            if (!aIsDigit && !bIsDigit) {
                //在内容不同时，忽略标识符，按内容字母顺序排序；
                if (!splitA[1].equals(splitB[1])) {
                    return splitA[1].compareTo(splitB[1]);
                }
                //在内容相同时，按标识符排序。
                else {
                    return splitA[0].compareTo(splitB[0]);
                }
            }
            //a和b都是数字日志
            else if (aIsDigit && bIsDigit) {
                //保留原来的相对顺序。
                return 0;
            }
            //a是字母日志
            else if (!aIsDigit) {
                //所有字母日志都排在数字日志之前。
                return -1;
            }
            //b是字母日志
            else {
                //所有字母日志都排在数字日志之前。
                return 1;
            }
        });
        return logs;
    }

    public static void main(String[] args) {
        String[] logs = new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        ThirtySeven thirtySeven = new ThirtySeven();
        System.out.println(thirtySeven.reorderLogFiles(logs));
    }
}
