# The Ultimate Data Structures & Algorithms: Part 1

## Getting Started
Nothing to note

## The Big O Notation

### 3- O(1) Constant
``` java
public void log(int[] numbers){
    // CONSTANT O(1)
    // because of concrete index numbers, increasing in list does not affect the performance
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
}
```

### 4- O(n) Linear
```java
public void log(int[] numbers, String[] names) {
    // LINEAR O(n)
    // As the list increases, calculation time increases
    // if there are O(1) between O(n), we can eliminate O(1)s
    // we can use O(n) instead of O(2n) because Time Complexity increases linearly
    // we can eliminate O(m) because Time Complexity still increases linearly
    System.out.println(); // O(1)

    for (int i = 0; i < numbers.length; i++) // O(n)
        System.out.println(numbers[i]);
    for (int number : numbers) // O(n)
        System.out.println(number);
    for (String name : names) // O(m)
        System.out.println(name);

    System.out.println(); // O(1)
}
```

### 5- O(nˆ2) Quadratic
```java
public void log(int[] numbers) {
    // QUADRATIC O(n^2)
    // we can eliminate O(n) when there is a O(n^2) etc
    for (int number : numbers) // O(n)
        System.out.println(number);

    for (int first : numbers) // O(n)
        for (int second : numbers) // O(n)
            for (int third : numbers) // O(n)
                System.out.println(first + ',' + second + ',' + third);
}
```

### 6- O(log n) Logarithmic
Nothing to note

### 7- O(2^n) Exponential
Nothing to note

### 8- Space Complexity
```java
public void greet(String[] names){
    // SPACE COMPLEXITY - O(n) space
    // as the number of inputs increases, space usage is increases too
    String[] copy = new String[names.length];

    for (int i = 0; i < names.length; i++) {
        System.out.println("Hi" + names[i]);
    }
}

```

### 9- Cheat Sheet
[The Big O Notation Cheat Sheet.pdf](Cheat Sheet - Big O.pdf)

## Arrays

### 3- Working with Arrays in Java
```java
int[] numbers = new int[3];
// int[] numbers = {10, 20, 30};

numbers[0] = 10;
System.out.println(Arrays.toString(numbers));
```
### 4- Exercise- Array Class
```java
var numbers = new Array(4);
numbers.insert(10);
numbers.insert(20);
numbers.insert(30);
numbers.insert(40);

System.out.println(numbers.indexOf(100));
numbers.print();
```
       
### 9- Dynamic Arrays
```java
// Vector: 100% - synchronized (only one thread)
// ArrayList: 50% increment after being full
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.remove(0);
list.toArray();
System.out.println(list);
```

### 10- Arrays- Exercises
[Arrays- Exercises.pdf](Arrays- Exercises.pdf)

## Linked Lists

### 3- Working with Linked Lists

```java
 // If you do not use Generic Type (LinkedList<>) that means list will store Objects
LinkedList list = new LinkedList();
list.addLast(10);
list.addLast(20);
list.addLast(30);
list.addFirst(1);

System.out.println(list);
System.out.println( list.contains(10));
System.out.println( list.indexOf(10));
System.out.println( list.size());

var array = list.toArray();
System.out.println(Arrays.toString(array));
```

## 4- Exercise- Building a Linked List
nothing to code for a while
## 9- Solution- removeFirst
```java
var list = new LinkedList();
// list.addLast(10);
// list.addLast(20);
// list.addLast(30);

// If the list is empty, we should handle the exception deliberately 
// like "throw new NoSuchElementException();"
list.removeFirst();
System.out.println(list.contains(10));
```

## 17- Solution- Reversing a Linked List
```java
var list = new LinkedList();
list.addLast(10);
list.addLast(20);
list.addLast(30);

var array = list.toArray();
System.out.println(Arrays.toString(array));

list.reverse();
array = list.toArray();
System.out.println(Arrays.toString(array));
```
## Stacks

### 3- Working with Stacks
```java
// Stack.search() is not used generally,
// purpose of Stacks are different
Stack<Integer> stack =new java.util.Stack<>();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println(stack);

// pop() removes last item and returns it
var top = stack.pop();
System.out.println(top);
System.out.println(stack);

// peek() returns last item
top = stack.peek();
System.out.println(top);
System.out.println(stack);
```

### 5- Solution - Reversing a String
```java
var str = "abcd";

var reverser = new StringReverser();
String result = reverser.reverse(str);

System.out.println(result);
```
### 6- Exercise- Balanced Expressions
noting to code

### 7- Solution- A Basic Implementation
```java
// Edge Cases
// ()
// (()
// ) (
// ( ]
String str = ")1 + 2(";
Expression exp = new Expression();
var result = exp. isBalanced(str);
System.out.println(result);
 ```

 ### 12- Solution- Implementing a Stack Using an Array
```java
Stack stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.pop();

// println() automatically calls stack.toString()
System.out.println(stack);
// returns the last item without removing it
System.out.println(stack.peek());
System.out.println(stack.isEmpty());

``` 

## Queues
 
 1- Introduction (0:26)
 
 2- What are Queues (2:04)
 
 ### 3- Queues in Java (5:12)
```java
import java.util;
Queue<Integer> queue = new ArrayDeque<>();
queue.add(10);
queue.add(20);
queue.add(30);

System.out.println(queue);
System.out.println(queue.remove());
System.out.println(queue);
```
 4- Exercise- Reversing a Queue
 
 5- Solution- Reversing a Queue
 
 6- Exercise- Building a Queue Using an Array (2:03)
 
 7- Solution- A Basic Implementation (6:32)
 
 8- Solution- Circular Arrays (5:54)
 
 9- Exercise- Implementing a Queue Using a Stack (0:55)
 
 10- Solution- Building a Queue Using a Stack (7:43)
 
 11- Priority Queues (1:53)
 
 12- Exercise- Building a Priority Queue (3:57)
 
 13- Solution- Building a Priority Queue (8:51)
 
 14- Solution- Refactoring (3:02)
 
 15- Queues- Exercises
 
 16- Summary (0:57)
Hash Tables (68 m)
 
 1- Introduction (0:26)
 
 2- What are Hash Tables (2:44)
 
 3- Working with Hash Tables (6:06)
 
 4- Exercise- Find the First Non-repeated Character (0:54)
 
 5- Solution- First Non-repeating Character (7:39)
 
 6- Sets (2:23)
 
 7- Exercise- First Repeated Character (0:32)
 
 8- Solution- First Repeated Character (2:36)
 
 9- Hash Functions (5:55)
 
 10- Collisions (1:06)
 
 11- Chaining (1:40)
 
 12- Open Addressing- Linear Probing (2:41)
 
 13- Open Addressing- Quadratic Probing (1:29)
 
 14- Open Addressing- Double Hashing (3:19)
 
 15- Exercise- Build a HashTable (2:36)
 
 16- Solution- put() (6:07)
 
 17- Solution- get() (4:29)
 
 18- Solution- remove() (2:30)
 
 19- Solution- Refactoring (11:04)
 
 20- Hash Tables- Exercises
 
 21- Summary (1:25)
 
 22- Course Wrap Up (0:32)
 
 23- Thank You
