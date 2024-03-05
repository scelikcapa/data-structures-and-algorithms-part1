package com.codewithmosh;

import java.util.Stack;

public class StringReverser {
  public String reverse(String input) {
    if (input == null)
      throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();

    // Instead of using for loop, foreach is better
    // Trick is changing string to CharArray in Java
    for (char ch : input.toCharArray())
      stack.push(ch);

    // Solution below is expensive because of lots of concatenations
    // In every concatenations, new string is created. 
    // because Strings are immutable in Java
    // 
    // String reversed = "";
    // while(!stack.empty()){
    //   reversed += stack.pop();
    // }

    StringBuffer reversed = new StringBuffer();
    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}
