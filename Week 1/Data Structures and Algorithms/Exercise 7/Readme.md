# Financial Forecasting Example

A simple Java program demonstrating a **recursive algorithm** to forecast future value based on past growth rates.

## Formula

FutureValue = CurrentValue * (1 + growthRate) ^ years

## Concepts

- Recursion: Method calls itself to calculate future value.
- Time Complexity: O(n)
- Space Complexity: O(n) — recursion stack

## Optimization

- For large `n`, iterative solution is better (avoids stack overflow).
- Iterative version: O(n) time, O(1) space.

## Use Case

Useful in simple financial forecasting — e.g., investment growth over time.

## How to Run

1. Save the file
2. Compile
```
javac FinancialForecastingExample.java
```
4. Run:
```
java FinancialForecastingExample
```

## Output

![image](https://github.com/user-attachments/assets/21a6549c-2546-40ba-a816-a0a0dd7f2304)

Future Value after 5 years: 14025.52
