package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 459.重复的子串 建议再看 优先级不高
 * 如果一个长度为 nn 的字符串 ss 可以由它的一个长度为 n 的子串 s'重复多次构成，那么：
 * ① n一定n‘的倍数
 * ② s’一定是s的前缀
 * ③ 对任意的i∈[n’,n)，有 s[i] = s[i-n']。
 * 即s中长度为n‘的前缀就是s’,并且在这之后的每一个位置上的字符s[i],都需要与它之前的第n’个字符s[i-n']相同
 */
public class FiftyNine {

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        //从小到大枚举n‘ 注意因为子串至少需要重复一次,所以n’不会大于n的一半
        for (int i = 1; i * 2 <= n; i++) {
            //用于标记是否满足条件,
            boolean match = true;
            //0-i的数组下标即为 n'
            if (n % i == 0) {
                //对字符串s进行遍历
                for (int j = i; j < n; j++) {
                    //不满足即
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        FiftyNine fiftyNine = new FiftyNine();
        System.out.println(fiftyNine.repeatedSubstringPattern("abcabcabcabc"));
    }
}
