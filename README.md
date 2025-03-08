# Inverted Right-Angled Triangle Pattern in Java

## Overview
This Java program prints an inverted right-angled triangle pattern using asterisks (`*`). It utilizes nested loops to control the number of printed stars in each row, decreasing by one in each iteration.

## Code
```java
public class InvertedRightAngledTriangle
{
    public static void main(String[] args)
    {
        int star = 5;  // Initialize the number of stars
        
        for(int i = 0; i <= 3; i++) // Outer loop runs 4 times (i = 0 to 3)
        {
            for(int j = 1; j < star; j++) // Inner loop controls star printing
            {
                System.out.print("*"); // Prints '*' without a new line
            }
            
            star--; // Decrease the star count after each row
            System.out.println(); // Moves to the next line
        }
    }
}
```

## Explanation

### 1. **Variables**
- `star`: Initializes the number of stars to `5`. It determines how many `*` characters should be printed in each row.
- `i`: Controls the number of rows printed (outer loop).
- `j`: Controls the number of `*` characters printed per row (inner loop).

### 2. **For Loops**
#### Outer Loop (`for(int i = 0; i <= 3; i++)`):
- Runs **4 times** (`i = 0` to `i = 3`), ensuring four rows are printed.
- Controls how many rows are printed.

#### Inner Loop (`for(int j = 1; j < star; j++)`):
- Controls the number of `*` printed per row.
- Runs until `j < star`, meaning the number of `*` decreases as `star--` reduces its value.

### 3. **Printing Statements**
- `System.out.print("*");`: Prints `*` without moving to a new line.
- `System.out.println();`: Moves to the next line after each row is printed.

## Output
```
****
***
**
*
```

### Iteration Breakdown:
| i (Row) | star | Printed Stars |
|---------|------|--------------|
| 0       | 5    | ****         |
| 1       | 4    | ***          |
| 2       | 3    | **           |
| 3       | 2    | *            |

## Summary
This program prints an inverted right-angled triangle pattern where the number of `*` decreases with each row. The outer loop controls rows, the inner loop controls printing `*`, and `star--` ensures decrementing in each iteration. This is a simple example of nested loops in Java for pattern printing.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Inverted_RightAngled_Triangle_Patterns.git
```
