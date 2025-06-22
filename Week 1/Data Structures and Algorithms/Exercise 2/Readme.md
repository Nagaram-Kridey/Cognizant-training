# Ecommerce Search Example

A simple Java program demonstrating **Linear Search** and **Binary Search** on an e-commerce product list.

## Research:

For huge product catalogs, binary search (with sorted arrays or better, a Tree or database index) is much faster.

If products are stored in a database with indexes (which is typical), the underlying database engine already uses B-tree or similar structures — giving O(log n) or better.

For real-time UI filtering (search-as-you-type), a binary search or hash-based structure (HashMap) is better.


## How to Run

1. Save the code
2. Compile
```
javac EcommerceSearchExample.java
```
3. Run:
```
java EcommerceSearchExample
```

## Output:

![image](https://github.com/user-attachments/assets/669eaaf3-18aa-4e28-a94e-b333daee41a9)

Linear Search:
Product ID: 9, Name: Book, Category: Books

Binary Search:
Product ID: 9, Name: Book, Category: Books
