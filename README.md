# Fundamental of Java

## Hierarchy of Data Types

**👉 Two Types of Data Types**

1. Primitive Data Type  

- Boolean  
- Char    
- byte,shor,int,long, float, double
- Primitive data Type is never null but can be 0

2. Non-Primitive Data Type  

- Class
- Array
- enum
- interface
- package


###  ✴️Boolean

- Can take only two values: True or False
- Requires 1 bit to specify True/False
- Default value is False  
` E.g: boolean isPresent = false
boolean isNotPresent = true `

###  ✴️Character

- char data type is used to a single character
- A character is enclosed in single quotation marks.
- Requires 	2 bytes/16 bits to store a single unicode character.  
- Unicode means include all country languages supported likes *hindi* , *punjabi* another **c++** programming use ascii character  
` E.g: 'A', 'd', '*', '0' `

###  ✴️Byte

- The 1 byte/8 bits data type can store whole numbers from *-128 to 127*
- Default value is 0.
- Can be used to store int of smaller size to save memory

<!-- ` E.g: 'A', 'd', '*', '0' ` -->

---
## Storage Size And Range
 - 👉 Decimal Number: Base 10.
 - 37 = 3 * 10<sup>1</sup> + 7 * 10<sup>0</sup>  
 - 658 = 6 * 10<sup>2</sup> + 5 * 10<sup>1</sup> + 8 * 10<sup>0</sup>
   
 - 👉 Binary Number: Base 2.
 - _ _ (2 bits).
 - Possible numbers: *0 0* or *0 1* or *1 0* or *1 1*
 - 1 1 (2 bits) = 1 * 2<sup>1</sup> + 1 * 2<sup>0</sup> =  2 + 1 = 3  (1 1 is binary to 3 decimal number hota hai)
 - 0 to 3 (0 to 2<sup>2-1</sup>) ( if the numbers are positive / unsigned and must be 2 bits)
 - -2 to 1 (-2<sup>1</sup> to 2<sup>1</sup> - 1)
 - 2<sup>7</sup> 2<sup>6</sup> 2<sup>5</sup> 2<sup>4</sup> 2<sup>3</sup> 2<sup>2</sup> 2<sup>1</sup> 2<sup>0</sup> ((8 bits) of isNegative sign of last left side one bits asign only to leave it then after 7 bits use for value)
 - -2<sup>7</sup> to 2<sup>7</sup> - 1 ((8 bits) of negative sign range(-128 to 127))
---
###  ✴️Short

- Requires 2 bytes/16 bits of memory for storage.
- The short data type can store whole numbers from *-32768 to 32767*
- Default value is 0.

###  ✴️Integer

- The int data type can store the integer value
- Requires 4 bytes/32 bits of memory for storage
- Value range could be -2<sup>31</sup> to 2<sup>31</sup> - 1
- Stores whole numbers from *-2,147,483,648 to 2,147,483,647*

###  ✴️Long

- The long data type can store the large integer value
- Requires 8 bytes/64 bits of memory for storage.
- Value range could be -2<sup>63</sup> to 2<sup>63</sup> - 1
- Stores whole numbers from *-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807*
- Default value is 0.

###  ✴️Float

- The Float data type can store the floating point value
- It folows IEEE 754 standard for storage.
- Requires 4 bytes/32 bits of memory for storage.
- It uses 23 bits for mantissa and 8 bits for exponent.
- Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
- Range of Number: 3.4 e-<sup>38</sup> to 3.4 e+38.
- Default value is 0.0f

###  ✴️Double

- The Double data type can store the floating point value with higher precision
- Requires 8 bytes/64 bits of memory for storage.
- It uses 52 bits fro mantisa and 11 bits for exponent.
- Stores fractional numbers. Sufficient for storing 15 decimal digits
- Range of Number: 1.7 e-<sup>308</sup> 1.7 e+<sup>308</sup>
- default value is 0.0

---
## Type Casting - Primitive types
### ✴️Widening Casting
- byte -> short -> char -> int -> long -> float -> double   
` Example:- `
```java
 public class TypeConversion{
      public static void main( String[] args){
            int i_val = 3;
            double d_val = i_val; (Automatic casting : int to double)
            System.out.println(i_val); (outputs 3)
            System.out.println(d_val); (outputs 3.0)
      }
 }
```
### ✴️Narrowing Casting
- double -> float -> long -> int -> char -> short -> byte  
` Example:- `
```java
 public class TypeConversion{
      public static void main( String[] args){
            int d_val = 3.45;
            double i_val = (int) d_val; (Manual Casting: double to int)
            System.out.println(i_val); (outputs 3)
            System.out.println(d_val); (outputs 3.45)
      }
 }
```
---

---
 ## Reference Data types in Java
 ### ✴️class, Array ,interface, enum , String etc.
 - Reference Data type will **contain a memory address** of **variable value** and *will not store the value directly*.
 - They are called non-primitive data type.
 - They are created by the programmer.
 - They can be null.
 - 0 != null (0 and null not equal. 0 means some data 0 and null means nothing).

---

---
 ## Operators in Java
 ### ✴️The value/data on which they operate, are referred as operator.
```java
  ⏩ A + 5 // here '+' is operator and 'A' & '5' are operands.
  ⏩ A + 3 // here '+' is operator and 'A' & '3' are operands.
  ⏩ A - 3 // here '-' is operator and 'A' & '3' are operands.
```

### ✴️Classification
- Based on the number of operands,it works on
 1. Unary *A* 🔜 *A* (1 value on work)
 2. Binary X and Y -> X 🔁 Y (2 value on work)
 3. Ternary (3 oprands on work is Conditinal operator Only) 

### ✴️Types of Operator
 1. Arithemetic
 2. Shift
 3. Relational
 4. Bitwise
 5. Logical
 6. Assignment
 7. Conditional  
 
 ### 🌟Arithemetic Operators
 ` Exmaple:- `
  ```java
  int x = 17, y = 2;
  System.out.println(x + y) // prints addition 19
  System.out.println(x - y) // prints submission 15
  System.out.println(x * y) // prints multiplication 34
  System.out.println(x / y) // prints divide 8
  System.out.println(x % y) // prints modules 1

  ```
 #### 👉 Unary Operator
 1. Unary ++
 2. Unary --
 3. Unary -

 ```java
 ▶️ Unary Increment: ++
 ▶️ Unary Decrement: --
 ▶️ Post and Pre
 ▶️ Post Increment / Post Decrement and Pre Increment / Pre Decrement
 ➡️ Post ( Post means first use then increase)
 ➡️ Pre ( Pre means first increase then use)
 

 Example:-
     int x = 17;
     System.out.println(x++)  // prints 17 first, then increase to 18
     
     System.out.println(++x) // increment to 19 and then print 19

     int y = 19;
     System.out.println(y--)  // prints 19 first, then decrease to 18
     System.out.println(--y)  // decrement to 18 and then print 18


 ```
---

---
## 👉Decimal to Binary conversions Tricks

`Example :- int x = 68; output:- 1000100 (bottom to top)`  
| 2  | 68  | 0  |
|--- | --- |----|
| 2  | 34  | 0  |
| 2  | 17  | 1  |
| 2  | 8  | 0  |
| 2  | 4  | 0  |
| 2  | 2  | 0  |
| 2  | 1  | 1  |
|    | 0  |   |

`Exmaple :- int x = 34; output:- 100010 (bottom to top)`  
| 2  | 34  | 0  |
|--- | --- |----|
| 2  | 17  | 1  |
| 2  | 8  | 0  |
| 2  | 4  | 0  |
| 2  | 2  | 0  |
| 2  | 1  | 1  |
|    | 0  |   |

## 👉Binary to Decimal conversions Tricks
`Exmaple :- Binary =  1000100  output: 68`

 **1 × 2<sup>6</sup> + 0 × 2<sup>5</sup> + 0 × 2<sup>4</sup> + 0 × 2<sup>3</sup> + 1 × 2<sup>2</sup> + 0 × 2<sup>1</sup> + 0 × 2<sup>0</sup>**  

`Exmaple :- Binary =  100010  output: 34`

 **1 × 2<sup>5</sup> + 0 × 2<sup>4</sup> + 0 × 2<sup>3</sup> + 0 × 2<sup>2</sup> + 1 × 2<sup>1</sup> + 0 × 2<sup>0</sup>**


---
