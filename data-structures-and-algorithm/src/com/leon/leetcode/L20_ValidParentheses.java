package com.leon.leetcode;

import java.util.Stack;

/**
 * Solution20 https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * @package: com.leon.leetcode
 * @author: 陈明磊<swchenminglei@163.com>
 * @date: 2018/8/8 16:00
 * @ModificarionHistory who     when   what
 * --------------|------------------|--------------
 */
public class L20_ValidParentheses {

   public boolean isValid(String s){

       Stack<Character> stack = new Stack<Character>();
       for(int i = 0 ; i < s.length() ; i++){
           char c = s.charAt(i);
           if(c == '{' || c == '[' || c == '('){
              stack.push(c);
           }else{
               if(stack.isEmpty()){
                   return false;
               }

               char topChar = stack.pop();
               if(c == ')' && topChar != '('){
                   return false;
               }
               if(c == '}' && topChar != '{'){
                   return false;
               }
               if(c == ']' && topChar != '['){
                   return false;
               }
           }
       }

       return stack.isEmpty();
   }

    public static void main(String[] args) {

        String s = "[{()}]";

        L20_ValidParentheses validParentheses = new L20_ValidParentheses();

        System.out.println(validParentheses.isValid(s));
    }


}
