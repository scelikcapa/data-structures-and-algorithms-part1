package com.codewithmosh;

public class Array {
  private int[] items;
  private int count;

  public Array(int length) {
    items = new int[length];
  }

  public void insert(int item) {
    resizeIfRequired();

    items[count++] = item;
  }

  public void insertAt(int item, int index) {
    if (index < 0 || index > count)
      throw new IllegalArgumentException();

    // Note that I've extracted the logic for
    // resizing the array into this private
    // method so we can reuse in insert() and
    // insertAt() methods.
    //
    // This also made our code cleaner and
    // more readable.
    resizeIfRequired();

    for (int i = count - 1; i >= index; i--)
      items[i + 1] = items[i];

    items[index] = item;
    count++;
  }

  private void resizeIfRequired() {
    // If the array is full, resize it
    if (items.length == count) {
      // Create a new array, twice the size
      int[] newItems = new int[count * 2];

      // copy all the existing items
      for (int i = 0; i < count; i++)
        newItems[i] = items[i];

      // Set 'items' to this new array
      items = newItems;
    }
  }

  public void reverse() {
    int[] newItems = new int[count];

    for (int i = 0; i < count; i++)
      newItems[i] = items[count - i - 1];

    items = newItems;
  }

  public int max() {
    // O(n): Because we have to iterate over
    // the entire array to find the largest
    // number. This number may be at the end
    // of the array (worst case scenario).
    int max = 0;
    for (int item : items)
      if (item > max)
        max = item;

    return max;
  }

  public Array intersect(Array other) {
    var intersection = new Array(count);

    for (int item : items)
      if (other.indexOf(item) >= 0)
        intersection.insert(item);

    return intersection;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count)
      throw new IllegalArgumentException();

    // Shift the items to the left to fill the hole
    // [10, 30, 40]
    // index: 1
    // 1 <- 2
    // 2 <-3
    for (int i = index; i < count; i++)
      items[i] = items[i + 1];

    count--;
  }

  public int indexOf(int item) {
    // If we find it, return index
    // Otherwise, return -1
    // O(n) - when doing big O(n) analysis always consider worse case scenario
    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;

    return -1;
  }

  public void print() {
    for (int i = 0; i < count; i++)
      System.out.println(items[i]);
  }
}
