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
[The Big O Notation Cheat Sheet.pdf](Cheat%20Sheet%20-%20Big%20O.pdf)

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
[Arrays- Exercises.pdf](Arrays-%20Exercises.pdf)

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

