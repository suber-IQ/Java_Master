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
---
## 🌟Shift Operators

1. 👉Left Shift Operator
- They are binary operators.
`Example :-  int x = 17; x<<2; //output: 68`
- Decimal 17: Binary 10001
- Left Shift the bits: (1st time) 100010 : decimal 34
- (2nd time)  1000100 : decimal 68

2. 👉Right Shift Operator
- They are binary operators.
`Example:-  int x = 17; x>>2; //output: 4`
- Decimal 17: Binary 10001
- Right shift the bits: (1st time) 01000 : decimal 8
- (2nd time) 00100 :decimal 4

3. 👉Unsigned right shift operator
- >>>
- For Positive number, >> and >>> behaves same
- For negative number, >>> changes parity bit (MSB) to 0


### 👉 Decimal to Binary conversions Tricks

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

## 👉 Binary to Decimal conversions Tricks

- (num * (power(2,n)) // left shift 
- (num / (power(2,n)) // right shift 

`Exmaple :- Binary =  1000100  output: 68`

 **1 × 2<sup>6</sup> + 0 × 2<sup>5</sup> + 0 × 2<sup>4</sup> + 0 × 2<sup>3</sup> + 1 × 2<sup>2</sup> + 0 × 2<sup>1</sup> + 0 × 2<sup>0</sup>**  

`Exmaple :- Binary =  100010  output: 34`

 **1 × 2<sup>5</sup> + 0 × 2<sup>4</sup> + 0 × 2<sup>3</sup> + 0 × 2<sup>2</sup> + 1 × 2<sup>1</sup> + 0 × 2<sup>0</sup>**

```java
int x = 10   =    0000 0000 0000 0000 0000 0000 0000 1010
            

🌟left shift(<<2 to 10) = 00 0000 0000 0000 0000 0000 0000 1010 00 // 1 × 2^5 + 0 × 2^4 + 1 × 2^3 + 0 × 2^2 + 0 × 2^1 + 0 × 2^0 = output: 40 (10 = 20 = 40) {// left shift to value is double}

🌟right shift(>>2 to 10) = 00 0000 0000 0000 0000 0000 0000 0000 10 // 1 × 2^1 + 0 × 2^0  = output: 2 (10 = 5 = 2) {// right shift to value is half and In case >>> Unsined Right shift is behaviour is positive same example:- >> = >>> (only for positive value)}

// 2's compliment value of 10 with write oposite value e.g 0 to 1 and 1 to 0
            1111 1111 1111 1111 1111 1111 1111 0101 
                                                 +1  (1 + 1 = 2 to binary = 10)
            ---------------------------------------
     -10 =  1111 1111 1111 1111 1111 1111 1111 0110    
     
//      👉 if -10 is :- 
 
// 🌟 left shift to negative value (-10){ int x = -10}

Left shift (<<2) :-
            11 1111 1111 1111 1111 1111 1111 0110 00 // (left most cut two bits  and most right two cut bits then shift at position two zero) { after left shift perfome not coverte into decimal and some calculation the rest is there } 

            // ➡️ left most bits is 1 then is negative value and left most bits is 0 then is positive value
          11 1111 1111 1111 1111 1111 1111 0110 00
           1 1111 1111 1111 1111 1111 1111 0110 00 // {left side one bit have to leave }
           0 0000 0000 0000 0000 0000 0000 1001 11 // (OPOSITE VALUE)
                                                +1
          ----------------------------------------
           0 0000 0000 0000 0000 0000 0000 1010 00 //output: -(40) how to -40 🔎 you one (1) bit have leave 1 is sign to negative value so -40 is output
// 🌟 right shift to negative value (-10){ int x = -10}

Right shift (>>2) :-
           11 1111 1111 1111 1111 1111 1111 1111 01 // (🔎 is right shift to negative value you cut right most two bits and then left most bits shift with 🌠 11  NOT THAT 00 🌠 only use 11 } 

            // ➡️ left most bits is 1 then is negative value and left most bits is 0 then is positive value
          11 1111 1111 1111 1111 1111 1111 1111 01 
           1 1111 1111 1111 1111 1111 1111 1111 01 // {left side one (1) bit have to leave }
           0 0000 0000 0000 0000 0000 0000 0000 10  // (OPOSITE VALUE)
                                                +1
          ----------------------------------------
           0 0000 0000 0000 0000 0000 0000 0000 11 //output: -(3) how to -3 🔎 you one (1) bit have leave 1 is sign to negative value so -3 is output    
// 🌟 unsigned right shift to negative value (-10){ int x = -10}

Unsigned Right shift (>>>2) :-
            00 1111 1111 1111 1111 1111 1111 1111 01 (🔎 is Unsigned right shift to negative value you cut right most two bits and then left most bits shift with 🌠 00  NOT THAT 11 🌠 only use 00)

            
          00 1111 1111 1111 1111 1111 1111 1111 01 // (not compute this binary why? left most two bits is 0 it is positive binary value And You directly convert into decimal)
          OUTPUT :- 1073741821  
             
 ```
---
---
## 🌟Relational & Logical Operator in Java

### Relational Operator
```java
Example:- int a = 5; , int b = 5;    
   a == b // True
   a != b // False
   a < b // False
   a > b // False
   a <= b // True
   a >= b // True
```
### Logical Operator
1. 👉Logical AND' Operator (&&):
- Binary operator
- This operator returns true when both the condition under consideration are true
- condition && condition2
```java
Example:- int a = 5; int b = 7; int c = 8;
       (a < b) && (a < c)
```
2. 👉 Logical OR' Operator (||):
- Binary operator
- This operator returns true when **either** of the conditions under consideration are true or both are true
- condition1 || condition2
```java
Example:- int a = 5; int b = 7; int c = 2;
       (a < b) || (a < c)
``` 

---

---
## 🌟Bitwise Operators in Java

1. 👉 Bitwise AND' Operator (&):
- This operator is a binary operator, denoted by ‘&.’ It returns bit by bit AND of input values, i.e., if both bits are 1, it gives 1, else it shows 0. 

```java
  Example:-  
            int a = 5 = 0101 //(🔎In Binary) 
            int b = 7 = 0111 //(🔎In Binary)
            
            ▶️ Bitwise AND Operation of 5 and 7 
            0 1 0 1
          & 0 1 1 1
          ----------
            0 1 0 1  = 5 //(🔎In Decimal)       
     
```

2. 👉 Bitwise OR' Operator (|):
-  This operator is a binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e., if either of the bits is 1, it gives 1, else it shows 0. 

```java
  Example:-  
            int a = 5 = 0101 //(🔎In Binary) 
            int b = 7 = 0111 //(🔎In Binary)
            
            ▶️ Bitwise OR Operation of 5 and 7 
            0 1 0 1
          | 0 1 1 1
          ----------
            0 1 1 1  = 7 //(🔎In Decimal)  
```
3. 👉 Bitwise XOR' Operator (^):
-  This operator returns 1 when either of the bit under consideration is 1 but not both. 

```java
  Example:-  
            int a = 5 = 0101 //(🔎In Binary) 
            int b = 7 = 0111 //(🔎In Binary)
            
            ▶️ Bitwise XOR Operation of 5 and 7
            0 1 0 1
          ^ 0 1 1 1
          ----------
            0 0 1 0  = 2 //(🔎In Decimal)  
```
4. 👉 Bitwise Complement (~):
-  This operator is a unary operator, denoted by ‘~.’ It returns the one’s complement representation of the input value, i.e., with all bits inverted, which means it makes every 0 to 1, and every 1 to 0. 

```java
  Example:-  
            int a = 5 = 0101 //(🔎In Binary) 
            
            ▶️ Bitwise Complement Operation of 5
          ~ 0 1 0 1
          ----------
            1 0 1 0  = 10 //(🔎In Decimal)  

```
`🤘Note: Compiler will give 2’s complement of that number, i.e., 2’s complement of 10 will be -6.`

---

---
## 🌟Assignment Operators in Java

- It is used to assign the value of right side to the vaiable on the left.
- They are binary operators.

`Example:- int x = 17 (x is assigned 17) {it is use to assign the value of right side to the variable on the left.}`

### Compound Operators
 
- +=
- a += 10 // a = a + 10;
- -=
- a -= 10 // a = a - 10;
- *=
- /=
- %=
- &= ^= |=
- <<= >>= >>>=

---

---
## 🌟Conditional Operators in Java

- Also known as ternary operator.
- variable = expression1 ? expression2 : expression3  
`Example:- if(expression1){
  vaiable = expression2;
}else{
  variable = expression3;
}`
---

---
## ✴️Garbage Collection in Java
- Garbage means unreferenced objects
- Garbage Collection is the process by which the runtime unused memory is reclaimed and given back to operating system

- Stack Memory and Heap Memory

- By making the reference nul  
 `Example:- Sumit = null; 
 Student Sumit = new Student();
 Student SuberIQ = new Student();
 Sumit = SuberIQ;`
### 👉GC() Method
- Used to invoke the garbage collector to perform cleanup processing
- Found in System and Runtime classes
### 👉finalize() Method
- Invoke each time just before the object gets destroyed.
- The Signture of method is:
`public void finalize(){}`  
```java
class GarbageCollection{
  public void finalize(){
    System.out.println("object is garbage collected");
  }
  public static void main(String args[]){
    GarbageCollection gc1 = new GarbageCollection();
    GarbageCollection gc2 = new GarbageCollection();
    gc1 = null;
    gc2 = null;
    System.gc();
  }
  
}
```
---

# Control Structure Of Java

## 🌟 Conditional Statements
- It controls/decides which statement should be executed and when
- Decision-making statements evaluate the Boolean expression.

### 👉 Types of Conditional Statements

- if Statements (if else, elseif)
- Switch-case Statements

#### ✴️ if Statements
- The expression with "if" gives a boolean value: **true/false**
- Simple if
- if-else statement
- if-else-if ladder
- Nested if

- Simple if is used when we want to execute the block of code based on the condition.

`Syntax: `
```java
 if(expression){
  statements...
 }
 more statements...
```

#### ✴️ if-else Statement
- If the expression evaluates to true it executes a statement/block of statements, otherwise it executes the else statement/block of statements.  

`Syntax: `
```java
if(expression){
  statements...
}
else{
  other statments...
}
more statments...

```

#### ✴️ if-else-if Ladder
- if the expression evaluates to true it executes a statement/block of statements, otherwise it has multiple if-else blocks.   

`Syntax: `
```java
if(expression 1){
  statements; //executes when expression 1 evaluates to true
}
else if(expression 2){
  statements; // executes when expression 2 evaluates to true
}
else{
  statement 2; //executes when all the expressions evaluates to false
}
```

#### ✴️ Nested if Ladder
- If any statement contains another if-else block, similarly else block may contain another if-else block within the same programming.

`Syntax: `
```java
if(expression 1){
  statement 1; //executes when expression 1 is true
  if(expression 2){
    statement 2; //executes when expression 1 as well as 2  is true
  }else{
    statements 3; //executes when expression 1 is true and expression 2 is false
  }

}
```
#### ✴️ Switch-case
- One can select only one option from given number of options very easily.
- It is similar to if-else-if ladder.
- The switch statement works with bytes, short ,int, long, enum types, String and some wrapper types like byte, short, int, and Long.

`Syntax: `
```java
  switch(expression){
    case value1:
     //code to be executed;
     break;  // optional
    case value2:
     //code to be executed;
     break; // optional
     ......
    
    default:
     //code to be executed if all cases are not matched;
  }
```
## 🌟 Iterative Statements

- Iterative statements that are used to execute a statement/block of statements repeatedly as long as the given expression is True.
- Also known as looping statement/repetitive statement.

#### ✴️ 'while' Statement
- The while statment is used to execute a single statement or block of statements repeatedly as long as the given condition is True.
- The while Statement is also known as **Entry control
looping statement**.

`Syntax: `
```java
    while(boolean expression){
      // block of statements;
    }
    // statements after while

    Example:-
       public class WhileLoopExample {
          public static void main(String[] args) {
            int count = 0;
        
             // This while loop will run until the count reaches 5
            while (count < 5) {
            System.out.println("Count: " + count);
            count++; // Increment count by 1 in each iteration
            }
        
            System.out.println("Loop has ended!");
          }
      }

```

#### ✴️ 'do-while' Statement

- The do-while statement is used to execute a single statement or block of statements repeatedly as long as the given condition is TRUE.

- The do-while statement is also known as **Exit control looping statement.**

`Syntax: `
```java
    do{
       //block of statements;
    }while(boolean expression);
      // statements after do-while


    Example:-
        public class DoWhileLoopExample {
            public static void main(String[] args) {
              int count = 0;
        
              // This do-while loop will run until the count reaches 5
            do {
               System.out.println("Count: " + count);
              count++; // Increment count by 1 in each iteration
            } while (count < 5);
        
           System.out.println("Loop has ended!");
          }
      }

      🔸//Output:-
            Count: 0
            Count: 1
            Count: 2
            Count: 3
            Count: 4
            Loop has ended!

``` 
   
#### ✴️ 'for' Statement

- For loop is used to iterate a block of statements multiple times.
- Mostly used when we have fixed number of iterations.

`Syntax: `
```java
   for(int expr(s); test-expression; Increment/decrement(s)){
    //  block of statements;
   }

   Example:-
        public class ForLoopExample {
            public static void main(String[] args) {
               // This for loop will print the numbers from 1 to 5
                  for (int i = 1; i <= 5; i++) {
                    System.out.println("Number: " + i);
                 }
        
              System.out.println("Loop has ended!");
           }
        }
    🔸//Output:-
            Number: 1
            Number: 2
            Number: 3
            Number: 4
            Number: 5
            Loop has ended!

```

#### ✴️ 'forEach' Statement

- It is generally used for arrays/collections.

`Syntax: `
```java
   for(data type var_name:array){
     //statements using var_name;
   }

   Example:-
        public class ForEachLoopExample {
            public static void main(String[] args) {
               // Example array of integers
                  int[] numbers = {1, 2, 3, 4, 5};
                 // Using forEach loop to iterate over the elements of the array
                  for (int number : numbers) {
                     System.out.println("Number: " + number);
                  }
        
              System.out.println("Loop has ended!");
           }
        }
    🔸//Output:-
            Number: 1
            Number: 2
            Number: 3
            Number: 4
            Number: 5
            Loop has ended!

```

### 👉 Jump Statement

- They transfer the program execution control to a specific statement.
- It is generally used to skip some statements or come out of loop.

- Break, continue, return

#### ✴️ 'Break': Jump Statement

- Inside the switch case to come out of switch block.
- It is used Within the loops, to break the loop execution based on certain condition.
- *The break connot be used outside the loop or switch statement.*

`Example: `
```java
    class JumpStatement {
      public static void main(String[] args){
            // ✴️ 'Break': Jump Statement
            int num = 10;
            for(int i = 1; i <= num; i++){
                  if(i == 7)
                     break;
                     System.out.println(i);
            }
            System.out.println("Just came out of loop!");

      }
    }
    🔸//output
       1
       2
       3
       4
       5
       6
       Just came out of loop!

```

#### ✴️ 'Continue': Jump Statement

- When it is encountered, it skips the remaining statements of the current iteration and continues with next iteration.
- *The continue statement cannot be used outside the loop*  
   
`Example: `
```java
    public class ContinueExample {
      public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Using a loop to print even numbers in the array
        for (int number : numbers) {
            if (number % 2 == 1) {
                // If the number is odd, skip to the next iteration
                continue;
            }
            System.out.println("Even Number: " + number);
        }
        
        System.out.println("Loop has ended!");
      }
   }

    🔸//output
      Even Number: 2
      Even Number: 4
      Loop has ended!

```

#### ✴️ 'Labelled Break' AND 'Labelled Continue' : Jump Statement

- It is used in nested loops to break and continue a particular loop.

`Example: `

```java
  First Example:- 

    class LabelledBreakDemo{
      public static void main(String[] args) {
         out:
          for(int i = 1; i <= 5; i++){
             System.out.println("outer");
               for(int j = 1; j <= 5; j++){
                 System.out.println("inner");
                  if(j==2){
                    //break; //🔎 this will exit from inner loop only
                    break out; //🔎 this will exit from both loops
                  }
               }
          }
      }
    }

  Second Example:- 

   class LabelledContinueDemo{
      public static void main(String[] args) {
         out:
          for(int i = 1; i <= 5; i++){
             System.out.println("outer");
               for(int j = 1; j <= 5; j++){
                 System.out.println("inner");
                  if(j==2){
                    //  continue;
                    continue out;
                  }
               }
          }
      }
    }

    //👉 Please go to practical then will be clear

```

#### ✴️ 'Return': Jump Statement

- Return statement finishes the execution of a method and returns the control to the caller of method.

`Example: `

```java
    public class ReturnExample {
       public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("The result is: " + result);
       }
    
          // A method to add two numbers and return the sum
       public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returning the sum as the result of the method
      }
    }

    🔸//output:-
      The result is: 15

```

---
# Arrays in Java

## 🌟 Arrays

- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
- Array is a collection of similar types of elements which are stored in contiguous memory location.
- We can store primitive values or objects in an array in java.
- Java array is an object (**precisely reference**) which contains elements of homogeneous data types.

### ✴️ Declaring Arrays

- To declare an array, define the variable type with square brackets: 
   
   `dataType [] ref-name;`   
   `dataType ref-name [];`

- To assign the value, place the values in a comma-separated list, inside curly braces.   
   `String [] names = { 'Sita', 'Mita', 'Gita','Rohan','Sumit'};`   
   `int[] age = {30,33,38,40,45,100,55,21,28};`

#### ✴️ Accessing Elements in Arrays

```java
    👉 Individual elements can be accessed using index.   
    👉 index starts with '0'.   
    👉 String [] names = { 'Sita', 'Mita', 'Gita','Rohan','Sumit'};
    👉 System.out.println(names[0]); //prints 'Site'
```
#### ✴️ Array Length
- To know the number of elements in an array, length property can be used.   
   `String [] names = { 'Sita', 'Mita', 'Gita','Rohan','Sumit'};`   
   `System.out.println(names.length); //prints 5'`

#### ✴️ Loop through an Array
- The array elements can be accessed with "for loop".
- The array length property is used in a for loop for specifying the number of times loop should run.

### ✴️ Example of Arrays in Java

```java
      public class JavaArrayExample {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers = new int[5];

        // Initializing the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 2: " + numbers[2]);

        // Array length
        int arrayLength = numbers.length;
        System.out.println("Array length: " + arrayLength);

        // Iterating through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
  }

     //👉 Output:- 
      //Element at index 0: 10
     //Element at index 2: 30
     //Array length: 5
     //Array elements:
     //10 20 30 40 50
```

## 🌟 Single & Multi Dimensional Arrays in Java

### ✴️ Declaring an array:
- DataType [] ArrayRefVar;
### ✴️ Instantiation of an array:
- arrayRefVar = new datatype[size];

### ✴️ Accessing Array Using ForEach   
      
   ```java
   //👉 Example 01:-
      int arr[] = {33,25,35,88,29};

      for(int elem:arr){
        System.out.println(elem)
      }
   //👉 Example 02:-
       String [] names = { 'Sita', 'Mita', 'Gita','Rohan','Sumit'};

       for(String ele:names){
           System.out.println(ele);
       }
   ```
   
### ✴️ Multi Dimensional Array in Java

- Data is stored in rows and columns.   

   `dataTypen [][]arrayRefVar;`   
   `dataTypen arrayRefVar[][];`   
   `dataTypen []arrayRefVar[];`   

### ✴️ Jagged Array

- In Java, a jagged array is an array of arrays where each sub-array can have a different length. This means the elements of the main array are themselves arrays.   
  `Example:- `   

  ```java
         public class JaggedArrayExample {
            public static void main(String[] args) {
                // Creating a jagged array of integers
                int[][] jaggedArray = new int[3][];

                // Initializing sub-arrays with different lengths
                jaggedArray[0] = new int[]{1, 2, 3};
                jaggedArray[1] = new int[]{4, 5, 6, 7};
                jaggedArray[2] = new int[]{8, 9};

                // Accessing elements of the jagged array
                System.out.println("Element at [0][1]: " + jaggedArray[0][1]);
                System.out.println("Element at [1][3]: " + jaggedArray[1][3]);
                System.out.println("Element at [2][0]: " + jaggedArray[2][0]);

                // Array length of sub-arrays
                System.out.println("Length of sub-array at index 0: " + jaggedArray        [0].length);
                System.out.println("Length of sub-array at index 1: " + jaggedArray        [1].length);
                System.out.println("Length of sub-array at index 2: " + jaggedArray        [2].length);

                // Iterating through the jagged array
                System.out.println("Jagged array elements:");
                for (int i = 0; i < jaggedArray.length; i++) {
                    for (int j = 0; j < jaggedArray[i].length; j++) {
                        System.out.print(jaggedArray[i][j] + " ");
                    }
                    System.out.println();
                 }
          }
       }
     //👉 Output:-  
               // Element at [0][1]: 2
               // Element at [1][3]: 7
               // Element at [2][0]: 8
               // Length of sub-array at index 0: 3
               // Length of sub-array at index 1: 4
               // Length of sub-array at index 2: 2
               // Jagged array elements:
               // 1 2 3 
               // 4 5 6 7 
               // 8 9        
  ```
### ✴️ Multi-Dimensional Arrays Example

   `Example: `   

      ```java
           // 👉 2D Array Example:-
                        public class TwoDimensionalArrayExample {
                                  public static void main(String[] args) {
                                       // Creating a 2D array of integers
                                       int[][] twoDArray = new int[3][4];

                                       // Initializing the 2D array elements
                                       twoDArray[0][0] = 1;
                                       twoDArray[0][1] = 2;
                                       twoDArray[0][2] = 3;
                                       twoDArray[0][3] = 4;

                                       twoDArray[1][0] = 5;
                                       twoDArray[1][1] = 6;
                                       twoDArray[1][2] = 7;
                                       twoDArray[1][3] = 8;

                                       twoDArray[2][0] = 9;
                                       twoDArray[2][1] = 10;
                                       twoDArray[2][2] = 11;
                                       twoDArray[2][3] = 12;

                                       // Accessing 2D array elements
                                       System.out.println("Element at [0][0]: " + twoDArray[0][0]);
                                       System.out.println("Element at [1][2]: " + twoDArray[1][2]);

                                       // 2D array dimensions (rows and columns)
                                       int numRows = twoDArray.length;
                                       int numCols = twoDArray[0].length;
                                       System.out.println("Number of rows: " + numRows);
                                       System.out.println("Number of columns: " + numCols);

                                       // Iterating through the 2D array
                                       System.out.println("2D Array elements:");
                                       for (int i = 0; i < numRows; i++) {
                                           for (int j = 0; j < numCols; j++) {
                                               System.out.print(twoDArray[i][j] + " ");
                                           }
                                           System.out.println();
                                       }
                                 }
                        }
        // 👉 3D Array Example:-

                   public class ThreeDimensionalArrayExample {
                        public static void main(String[] args) {
                            // Creating a 3D array of integers
                            int[][][] threeDArray = new int[2][3][4];

                            // Initializing the 3D array elements
                            threeDArray[0][0][0] = 1;
                            threeDArray[0][0][1] = 2;
                            // ... (initialize other elements)

                            // Accessing 3D array elements
                            System.out.println("Element at [0][0][0]: " + threeDArray[0][0][0]);
                            // ... (access other elements)

                            // 3D array dimensions (depth, rows, and columns)
                            int depth = threeDArray.length;
                            int numRows = threeDArray[0].length;
                            int numCols = threeDArray[0][0].length;
                            System.out.println("Depth: " + depth);
                            System.out.println("Number of rows: " + numRows);
                            System.out.println("Number of columns: " + numCols);

                            // Iterating through the 3D array
                            System.out.println("3D Array elements:");
                            for (int i = 0; i < depth; i++) {
                                for (int j = 0; j < numRows; j++) {
                                    for (int k = 0; k < numCols; k++) {
                                        System.out.print(threeDArray[i][j][k] + " ");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                            }
                        }
                  }
                    


      ```

## 🌟 Copy / Clone an Array in java

- we can copy an array to another by the arraycopy() method of System class.   

 `Syntax: System.arraycopy()`      
       `public static void arraycopy(Objec src, int srcPos, Object dest, int destPos, int length)`

   - src: The source array from which elements will be copied.
   - srcPos: The starting position in the source array from where copying begins.
   - dest: The destination array where elements will be copied to.
   - destPos: The starting position in the destination array where elements will be copied.
   - length: The number of elements to be copied from the source array to the destination array.

`Example usage of System.arraycopy():`   

   ```java
         public class ArrayCopyExample {
             public static void main(String[] args) {
              // Source array
              int[] sourceArray = {1, 2, 3, 4, 5};

              // Destination array
              int[] destinationArray = new int[5];

              // Copy elements from sourceArray to destinationArray
              System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.      length);

              // Print the destinationArray
              System.out.print("Destination Array: ");
              for (int element : destinationArray) {
                  System.out.print(element + " ");
              }
           }
        }
        
     //👉 Output:-  
            //Destination Array: 1 2 3 4 5

   ```
### ✴️ Cloning Array

- Java Array can be cloned.
- Single-Dimensions array: *🔎deep copy of the array*
- Multi-Dimensions array: *🔎shallow copy of the array*

### ✴️ Shallow Copy V/s Deep Copy

- Shallow Copy store the reference of objects to the original memory address.

 `Example of Clone() method:- `   

  ```java
         public class ArrayCloneExample {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5};

        // Using clone() method to copy the array
        int[] destinationArray = sourceArray.clone();

        // Print the destinationArray
        System.out.print("Destination Array: ");
        for (int element : destinationArray) {
            System.out.print(element + " ");
        }
    }
}
    // 👉 output:- 
        // Destination Array: 1 2 3 4 5

  ```

---
---
# Methods in Java

## 🌟 Method Declaration in Java

### ✴️ UnderStanding Methods

- A collection of Statements / block of code which runs only when it is called.  

### ✴️ Declaration of Method

- It includes visibility, return type, method-name, list of parameter.   

```java
      accessModifier returnType methodName(parameter1Type parameter1Name, parameter2Type parameter2Name, ...) {
    // Method body - the code that defines the behavior of the method
    // You can use the parameters and perform operations inside the method body.
    
    // Optional return statement if the method has a non-void return type
    return returnValue;
}
//  👉 Example:- 
             public class ExampleClass {
    // Method with no parameters and void return type
    public void greet() {
        System.out.println("Hello, World!");
    }

    // Method with parameters and int return type
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

```

### ✴️ Types of Method

- Standard Libray (Built-in): *🔎  Print Method & copyarray() *
- User Defined: : *🔎 CheckPrime or isPrime { function name by user}*

```java
  // 👉Example of Method:- 
             public class PrimeNumberChecker {

    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number from 2 to sqrt(number), it's not prime
            }
        }

        return true; // If the number is not divisible by any number from 2 to sqrt(number), it's prime
    }

    public static void main(String[] args) {
        PrimeNumberChecker checker = new PrimeNumberChecker();

        // Test the isPrime() method with some sample numbers
        int number1 = 7;
        int number2 = 12;
        int number3 = 37;

        System.out.println(number1 + " is prime? " + checker.isPrime(number1));
        System.out.println(number2 + " is prime? " + checker.isPrime(number2));
        System.out.println(number3 + " is prime? " + checker.isPrime(number3));
    }
}


      // 👉 output:-  
           // 7 is prime? true
           // 12 is prime? false
           // 37 is prime? true

```

## 🌟 Method Overloading in Java

- Multiple methods with same name and different parameters.
 
- Area of circle and Area of Rectangle and  Area of Triangle   

`Example of Overloading`

```java
   public class AreaCalculator {

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Test the overloaded methods
        double circleRadius = 5.0;
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double triangleBase = 8.0;
        double triangleHeight = 3.0;

        double circleArea = calculator.calculateArea(circleRadius);
        double rectangleArea = calculator.calculateArea(rectangleLength, rectangleWidth);
        double triangleArea = calculator.calculateArea(triangleBase, triangleHeight);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
}

    // 👉 Output:- 
          //  Circle Area: 78.53981633974483
          //  Rectangle Area: 24.0
          //  Triangle Area: 12.0

```
## 🌟 Recursive Methods in Java

- Recursion is the technique of function calling itself.
- Used to break down the complexity in logic.
- it makes the code compact but difficult to understand.  

### ✴️ Method Recursion: Infinite


`Syntax: `
   - *returntype methodname(){ methodname(); }*
   ```java
          public class RecursionExample{
             static void p(){
                 System.out.println("hello");
                 p();
             }
             public static void main(String[] args){
              p();
             }
          }
   ```
### ✴️ Method Recursion: finite

`Syntax: `
   - *returntype methodname(){ methodname(); }*
   ```java
          public class FactorialCalculator {

    // Recursive method to calculate factorial
    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive call to calculate factorial
        }
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        // Test the recursive method with some sample numbers
        int number1 = 5;
        int number2 = 0;
        int number3 = 8;

        int factorial1 = calculator.calculateFactorial(number1);
        int factorial2 = calculator.calculateFactorial(number2);
        int factorial3 = calculator.calculateFactorial(number3);

        System.out.println("Factorial of " + number1 + " is: " + factorial1);
        System.out.println("Factorial of " + number2 + " is: " + factorial2);
        System.out.println("Factorial of " + number3 + " is: " + factorial3);
    }
}
   // 👉 Output:- 
        // Factorial of 5 is: 120
        //Factorial of 0 is: 1
        //Factorial of 8 is: 40320

   ```   

`Explan:- `   

```java
    n! = n * (n-1) * (n-2) * ... * 2 * 1

  //🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠

     factorial(5);
     5 * factorial(4)
     4 * factorial(3)
     3 * factorial(2)
     2 * factorial(1)

     return 1
     return 2*1 = 2
     return 3*2 = 6
     return 4*6 = 24
     return 5*24 = 120

  //🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠

     calculateFactorial(5)
    -> return 5 * calculateFactorial(4)
         -> return 4 * calculateFactorial(3)
             -> return 3 * calculateFactorial(2)
                 -> return 2 * calculateFactorial(1)
                     -> return 1 * calculateFactorial(0)
                         -> return 1  (Base case: factorial of 0 is 1)
                         
  //🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠🌠

    calculateFactorial(0) returns 1
    calculateFactorial(1) returns 1 * 1 = 1
    calculateFactorial(2) returns 2 * 1 = 2
    calculateFactorial(3) returns 3 * 2 = 6
    calculateFactorial(4) returns 4 * 6 = 24
    calculateFactorial(5) returns 5 * 24 = 120
                     

```

---
---
# Objects And Classes in Java

## 🌟 Class and Object Declaration in Java

### ✴️ Declaration of class and Objects

- Object: Any real-life entity that has the state and behaviour.
- State is stored in feild (data member).
- Behavior is shown using method (function).
- A class is a blue-print from which the object can be created.

### ✴️ Class Declaration  

`Syntax: `

```java
   class ClassName{
      data-type field;
      method;
   }

  //  👉 Example :- 
              public class Example {
                // Fields (variables)
                private int number;
                private String text;

                // Constructor
                public Example(int number, String text) {
                    this.number = number;
                    this.text = text;
                }

                // Methods
                public void displayInfo() {
                    System.out.println("Number: " + number);
                    System.out.println("Text: " + text);
                }
            }

```
## 🌟 Access Modifiers in Java

- Public Static void main (String agrs)

### ✴️ Type of Modifiers in java

1. Access Modifiers
2. Non-access Modifiers
    
#### 🌠 Access Modifiers Types

- Private
- Default
- Protected
- Public

#### 🌠 Non-access Modifiers Types

- Static
- Transient
- Volatile
- Abstract 
- Final

### 🌠 Access Modifiers

1. Private: **accessible only in the class**
2. Default: **accessible only in the package**
2. Protected: **accessible int the package and also to the sub-classes**
2. Public: **accessible from anywhere**

| Access Modifier  | Within class  | within Package | outside package & sub-classess | Outside package |
|----------------  | ------------- | -------------- | ------------------------------ | --------------- | 
| **Private**      |      Y        |      N         |           N                    |      N          |
| **Default**      |      Y        |      Y         |           N                    |      N          |
| **Protected**    |      Y        |      Y         |           Y                    |      N          |
| **Public**       |      Y        |      Y         |           Y                    |      Y          |

## 🌟 Array of Objects in Java

### ✴️ Creating Array of Objects

- Array is a collection of elements of homogeneous data types stored in a  contiguous memory location. (Without hole)

### ✴️ Declaring Array

```java
 int arr[];
     arr = new int[3];

  //  👉 Example :- 
      class ArrayDemo{
	       public static void main(String [] args){
		           Employee e[];
		          e = new Employee[5];
		          for (int i=0;i<5;i++){
		          	e[i] = new Employee();
		          	e[i].setEmployee(i+1,10000*(i+1));
		          }
		
		          /*for (int i=0;i<5;i++)
		          	e[i].printEmployee();*/
		          //e[3].printEmployee();
		          for (int i=0;i<e.length;i++)
		          	if (e[i].getSalary() <15000)
		          		System.out.println("Bonus: Rs. 3000");
		          	else
		          		System.out.println("Bonus: Rs. 1000");
		
	       }
      }

      class Employee{
	          private int empId;
	          private float salary;
	          
	          public void setEmployee(int id, float s){
	          	empId = id;
	          	salary = s;
	          }
	          
	          public void printEmployee(){
	          	System.out.println("Employee ID:" + empId + " Salary:           " + salary);
	          }
	          
	          public float getSalary(){
	          	return salary;
	          }
      }
```


## 🌟 Constructors in Java

### ✴️ Constructor

- Name of method is as same as of the class name.
- It does not have any return type.
- It will be called when the object will be declared.   
   `Employee e = new Employee();`

### ✴️ Types of Constructors

- Default (no parameter) constructor.
- Parameterized constructor

```java
   class Student{
      int rollNo;
      float marks;

      Student(){   //🔎 default constructor
         rollNo = 101;
         marks = 50.0f;
      }
      Student(int rollNo, float marks){ //🔎 parameterized constructor
         this.rollNo = rollNo;
         this.marks = marks;
      }

      public static void main(String args[]){
        Student s1 = new Student();  //🔎Call default constructor
        Student s2 = new Student(102,60.0f);//🔎Call parameterized constructor
      }
   }
```

### ✴️ Default Constructors

- The default constructor is created by the compiler at runtime when programmer does not write any constructor in a class.

- Constructor can be overloaded.
- **Static** and **final** keywords cannot be used with constructor.

`Example:- `

```java
          class ConstructorDemo{
	             public static void main(String [] args){
	             	Student s = new Student(101,45.5f);
	             	Student s2 = new Student(102);
	             	Student s1 = new Student();
	             	s.displayStudent();
	             	s1.displayStudent();
	             	s2.displayStudent();


	             }
          }

             class Student{
             	private int rollNo;
             	private float marks;
             	
             	public Student(){
             		rollNo = 1;
             		marks = 50f;
             	}
             	
             	public Student(int r){
             		rollNo = r;
             		marks = 50f;
             	}
	
             	public Student(int r, float m){
             		rollNo = r;
             		marks = m;
             	}
             	public void displayStudent(){
             		System.out.println("RollNo:" + rollNo + " Marks: " + marks);
             	}
            }             
```
## 🌟 'this' Keyword in Java


### ✴️ 'this' Keyword

- Speacial keyword in Java, which is used to refer the current object in a class.
- It's most common use is to eliminate the confusion/ambiguity
between the same name of local variables and instance variables.

### ✴️  Usage of 'this' keyword

- Pass current object in the method
- Refers current class instance variable/method.
- Invoke current class constructor.
- Returns current class instance.
- Pass current object in the method.

## 🌟 'static' Keyword in Java


### ✴️  Usage of 'static' keyword

- Used to manage memory.
- Can be used with variables, method, block and nested class.
- Makes the member as a class data rather than instance member.


### ✴️  Static Variables

- Static variables get memory only once, when the class is loaded, regardless of the number of objects created.
- Static method can be invoked directly by class name rather than by instance name.
- Static method can access static members only.
- 'this' and 'super' keywords cannot be used in static method.

`Example:- `

```java
     class Student{
	int rollNo;
	static int passingMarks;
	float marks;

	public static void setPassingMarks(int pm){
		passingMarks = pm;
			
	}
	
	public void set(int rollNo, float marks){
		this.rollNo = rollNo;
		this.marks = marks;
		 
	}
	
	public void display(){
		System.out.println("RollNo: " + rollNo);
		System.out.println("marks: " + marks);
		if (marks < passingMarks)
			System.out.println("Grade : Fail");
		else
			System.out.println("Grade : Pass");
	}
}
class StaticDemo{
	
	public static void main(String [] args){
		Student.setPassingMarks(40);
		
		Student s1 = new Student();
		Student s2 = new Student();

		s1.set(101, 49);
		s2.set(102, 22);
		s1.display();
		s2.display();
	}
}
```

## 🌟 Initializer Block in Java

### ✴️  Initializer Block 

- It is used to initialize the instance data member.
- It executes when any object is created.
- It is execuited before the constructor of the class gets executed.
- A class can have multiple initializer block, in that case it gets executed in the order in which it appears.

`Excutes:- `

1. Main Method
2. Object declared: initialzer block
3. constructor

`Example:- `

```java
 class InitializerBlockDemo{
	private int i=0;
	public InitializerBlockDemo(){
		i++;
		System.out.println("Inside Constructor: "+i);
	}
	
	{
		i++;
		System.out.println("Initializer Block 1: "+i);
	}
	
	{
		i++;
		System.out.println("Initializer Block 2: " + i);
	}
	
	public static void main(String [] args){
		System.out.println("Main Started");
		InitializerBlockDemo obj1 = new InitializerBlockDemo();
		System.out.println("Main Mid Way");
		InitializerBlockDemo obj2 = new InitializerBlockDemo();
		System.out.println("Main End");
	}
}
```


### ✴️ Static Initializer Block 

- It is executed before main() method.
- Any number of a static block can be defined, and this static blocks will be executed from top to bottom.

`Excutes:- `

1. Static initializer block
2. Main Method
3. Object declared: initialzer block
4. constructor


`Example:- `

```java
        class StaticInitializerBlockDemo{
        	private int i=0;
        	private static int j = 1;
        	public static void main(String [] args){
        		System.out.println("Main Started");
        		StaticInitializerBlockDemo obj1 = new StaticInitializerBlockDemo();
        		System.out.println("Main End");
        	}
        	
        	{
        		i++;
        		System.out.println("Initializer Block - 1: "+ j);
        	}
        	{
        		i++;
        		System.out.println("Initializer Block - 2:" + i);
        	}
        	
        	public StaticInitializerBlockDemo(){
        		i++;
        		System.out.println("Inside Constructor: "+ i);
        	}
	
        	static{
        		j++;
        		System.out.println("Static Initializer Block - 1: " + j);
        	}
        	
        	static {
        		System.out.println("Static Initializer Block - 2");
        	}
        }
```

## 🌟 Wrapper class in Java

### ✴️ Wrapper Class

- Wrapper class in Java provides the mechanism to convert primitive.


| Primitive Type   | Wrapper class |
|----------------  | ------------- | 
|   byte           |      Byte     |      
|   short          |      Short    |      
|   int            |      Integer  |      
|   long           |      Long     |      
|   float          |      Float    |      
|   double         |      Double   |      
|   char           |    Character  |      
|   boolean        |     Boolean   |      


#### 🌠 Autoboxing & Unboxing

### ✴️ Autoboxing

- The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing.

`Example:- `

```java
       int i = 20;
       Integer obj_i = Integer.valueOf(i);   // converting explicitly
       Integer obj_j = i;        // autoboxing
```

### ✴️ Unboxing

- The automatic conversion of wrapper type into its corresponding wrapper primitive type is known as unboxing.

`Example:- `

```java
       Integer obj_i = new Integer(3);

       int i = obj_i.intValue(); // 🔎 converting explicity

       int j = obj_i;  //🔎 unboxing
```

### ✴️ Methods of Wrapper Class

- Method used to get the value associated with the corresponding wrapper object.

1. intValue()
2. byteValue()
3. shortValue()
4. longValue()
5. floatValue()
6. doubleValue()
7. charValue()
8. booleanValue()

### ✴️ Wrapper to String

`Example:- `

```java
    public class WrapperDemo{
        public static void main(String[] args){
          Integer myInt = 1001;
          String myString = myInt.toString();
          System.out.println(myString.length());
        }
    }
```
---
---
# Inheritance in Java

## 🌟 Inheritance in Java

### ✴️ Inheritance

- A mechanism in which one object acquires all the properties and behaviours of already existing object.

- Inheritance represents the **IS-A** relationship which is also known as a parent-child relationship. 

`Significance:- `

- For method overriding: To achieve runtime polymorphism
- For code reusability: A class only needs to write the unique features, and the rest of the code can be extended from the other class.

`Terminology:- `

- Super Class/ Parent class/ Base Class: The class from where a new clas inherits the features.

- Sub Class/ Child Class/ Derived Class: A class which inherits the other class.   

`Syntax:- `

```java
  class Subclass-name extends Superclass-name{
      // methods and fields
  }
   
```

`Example:- `

```java
       //  👉 Explain (Derived Object)

💧 Employee object will have two data members:
  ➡️ String empid
  ➡️ String empname

💧 FullTimeEmployee object will have three data members:
  ➡️ String empid
  ➡️ String empname
  ➡️ Float salary

       //  👉 Example (Derived Object)
 
            class InheritanceDemo1{
	public static void main(String [] args){
		Employee e1 = new Employee();
		FullTimeEmployee ft1 = new FullTimeEmployee();
		e1.setEmployee("E101","Sonal");
		ft1.setFullTimeEmployee("E102","Parth",75000);
		
		e1.printEmployee();
		ft1.printEmployee();
	}
}
class Employee{
	protected String empId;
	protected String empName;
	
	public void setEmployee(String empId, String empName){
		this.empId = empId;
		this.empName = empName;
	}
	
	public void printEmployee(){
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + this.empName);
	}
}

class FullTimeEmployee extends Employee{
	private double salary;
	
	public void setFullTimeEmployee(String empId, String empName, double salary){
		//setEmployee(empId, empName);
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void printFullTimeEmployee(){
		printEmployee();
		System.out.println("Employee Salary: " + this.salary);
	}
}   
```

## 🌟 Types of Inheritance in Java


### 🌠 Types of Inheritance

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance
4. Multiple Inheritance  **(not supported in Java)**
5. Hybrid Inheritance  **(not supported in Java)**

### ✴️ Single Inheritance

- When a class inherits another class, it is known as a single inheritance.   

`Example:- `

```java
  class A {
    // Members of class A
}

class B extends A {
    // Members of class B
}

```

### ✴️ Multilevel Inheritance

- When there is a chain of inheritance, it is known as a multilevel inheritance.   

`Example:- `

```java
class A {
    // Members of class A
}

class B extends A {
    // Members of class B
}

class C extends B {
    // Members of class C
}


```

### ✴️ Hierarchical Inheritance

- When two or more classes inherits a single class, its is known as hierarchical inheritance.


`Example:- `

```java
class A {
    // Members of class A
}

class B extends A {
    // Members of class B
}

class C extends A {
    // Members of class C
}
```
### ✴️ Multiple Inheritance (not supported in Java):

- When a class is created from two or more classes, its is known as multiple inheritance.


`Example:- `

```java
// This is not possible in Java due to ambiguity.
// class A { ... }
// class B { ... }
// class C extends A, B { ... }

```
### ✴️ Hybrid Inheritance (not supported in Java):

- Special type of hybrid inheritance leads to ambiguity and so is not supported in Java.


`Example:- `

```java

//👉 note likes to circle
class A {
    // Members of class A
}

class B extends A {
    // Members of class B
}

class C extends A {
    // Members of class C
}

class D extends B {
    // Members of class D
}


```

## 🌟 'super' Keyword in Java

### ✴️ Super Keyword

- Special type of reference variable that refers to the immediate parent class.
- Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

`Usages:- `

- To refer immediate parent class instance variable.
- To call immediate parent class instance method.
- To call immediate parent class' constructor.   

`Example:- `   

```java

  class SuperDemo {
      public static void main(String[] args){
        Derived obj1 = new Derived();
        obj1.printJ();
      }
}

class Base{
      protected int i;
      Base(){
            i = 10;
      }
     public void printI(){
            System.out.println(i);
      }
}

class Derived extends Base{
      private int j;
      Derived(){
            // super.i = 20;
            super();
            this.j = 30;
      }
      public void printJ(){
            super.printI();
            // System.out.println(i);
            System.out.println(j);
      }

}

```
## 🌟 Constructors in Inheritance in Java

### ✴️ Default Constructor

- Constructor of base class with no argument gets automatically called in derived class constructor.

`Example:- `

```java
  
class ConstructorCallDemo1 {
	public static void main(String [] args){
		Derived dObj = new Derived(10,20);
		
		dObj.printIJ();
	}
}



class Base{
	protected int i;
	public Base(){
		System.out.println("Base Default Constructor Called");

		i = 15;
	}
	public Base(int i){
		System.out.println("Base Parameterized Constructor Called");
		this.i = i;
	}
	public void printI(){
		System.out.println(i);
	}
}

class Derived extends Base{
	int j;
	
	public Derived(int i, int j){
		super(i);
		System.out.println("Derived Constructor Called");
		this.j = j;
	}
	
	public void printIJ(){
		System.out.println("I:" + i);
		System.out.println("J:" + j);
	}
}
```

## 🌟 Method Overriding in Java

### ✴️ Method Overriding

- If the same method is defined in base class and derived class, the mechanism is termed as 'method overriding'.
- If a childclass provides the specific implementation of the same method that has been declared by one of its parent class, it is known as method overriding.

- To achieve runtime polymorphism.
- It provides the specific implementation to the method that is inherited from the base class.

`Condition:- `

- The name of the methods should be same.
- The parameter of the methods should be same.
- The methods must be defined in the base class and derived class.
- The access modifier in the derived class can be same or made broader but not narrower. That means a protected method of the base class can be made protected or public but not private.
- A constructor cannot be overridden, as the name of constructor of base class would be different than the name of constructor of derived class.

`Example:- `

```java
// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound.");
    }
}

// Derived class Dog inheriting from Animal
class Dog extends Animal {
    // Method overriding - providing a specific implementation for makeSound() in Dog class
    // @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();

        // Calling the makeSound() method on objects of both Animal and Dog classes
        genericAnimal.makeSound(); // Output: Generic animal sound.
        dog.makeSound();           // Output: Dog barks: Woof! Woof!
    }
}

```

### ✴️ Runtime Polymorphism

`Example of Polymorphism`

```java
import java.util.Scanner;

class MethodOverridingDemo2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to create Batsman and 2 to create Bowler");
		int choice = sc.nextInt();
		sc.close();
		
		Cricketer c;
		if (choice == 1)
			c = new Batsman("India","Rohit Sharma",4,2);
		else 
			c = new Bowler("India","Irfan Pathan",4,10);
		c.print();
	}
}

class Cricketer{
	String countryName;
	String playerName;
	
	public Cricketer(String countryName, String playerName){
		this.countryName = countryName;
		this.playerName = playerName;
	}
	
	public void print(){
		System.out.println("County Name:" + countryName);
		System.out.println("Player Name:" + playerName);
	}
}

class Batsman extends Cricketer{
	int no50s;
	int no100s;
	
	public Batsman(String countryName, String playerName, int no50s, int no100s){
		super(countryName, playerName);
		this.no100s = no100s;
		this.no50s = no50s;
	}
	
	public void print(){
		super.print();
		System.out.println("No of 50s:" + no50s);
		System.out.println("No of 100s:" + no100s);
	}
}

class Bowler extends Cricketer{
		int wickets;
		int runsGiven;
		
		public Bowler(String countryName, String playerName, int wickets, int runsGiven){
			super(countryName, playerName);
			this.wickets = wickets;
			this.runsGiven = runsGiven;
		}
		public void print(){
			super.print();
			System.out.println("No. of Wickets Taken:" + wickets);
			System.out.println("No of runs Given:" + runsGiven);
		}
}
```

## 🌟 'final' keyword in Java

### ✴️ 'final' keyword

`Use:- `

- Variable: (Cannot modify the final variable)
- Method: (Cannot override the final method) 
- Class: (Cannot inherit the final class)

### ✴️ Initializing 'final' Variable

- It's compulsory to initialize a final variable.

> There are three ways to do so:

  - When the variable is declared.
  - A blank final variable can be intialzed in initializer block or constructor.
  - A blank static final variable can be initialized in static initializer block.


### ✴️  'final' Variable:

- A final variable is a constant whose value cannot be changed after initialization.

`Example:- `

```java
public class FinalVariableExample {
    public static void main(String[] args) {
        final int constantValue = 100;
        // constantValue = 200; // This will cause a compilation error because constantValue is final and cannot be changed.
        System.out.println("Constant value: " + constantValue);
    }
}

```

### ✴️  'final' Method:

- A final method is a method that cannot be overridden by subclasses. When a method is marked as final in the superclass, subclasses cannot provide a different implementation for that method.

`Example:- `


```java
 class Parent {
    public final void finalMethod() {
        System.out.println("This method cannot be overridden.");
    }
}

class Child extends Parent {
    // Attempting to override finalMethod will cause a compilation error.
    // public void finalMethod() { // Compilation error: Cannot override the final method from Parent
    //     // Some implementation here
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.finalMethod();
    }
}

```
### ✴️  'final' Class:

- A final class is a class that cannot be subclassed or extended. It prevents other classes from inheriting from it.

`Example:- `


```java
  final class FinalClass {
    // Some members and methods here
}

// Attempting to subclass FinalClass will cause a compilation error.
// class Subclass extends FinalClass { // Compilation error: Cannot inherit from final FinalClass
//     // Some members and methods here
// }

public class FinalClassExample {
    public static void main(String[] args) {
        // Code using the FinalClass here
    }
}

```

## 🌟 Introduction to Object Class in Java

### ✴️  Object Class

- Object class is the base of all the classes in Java

`Example:- System Class, Scanner Class , String Class`

- All the classes directly or indirectly are inherited from Object Class.

`Example:- Object ▶️ Person ▶️ Student `

- All objects, including arrays, implement the methods of this class.
- It is declared in Java.lang.package. (default import not require import )


## 🌟 toString() Method in Java

### ✴️  To String

- Used to provide a String representation of any object.
- The default behaviour: Returns the name of class, "@" and the hash code of the object generated.
- Whenever we print my object, it internally calls the toString() method of the class.

`Explan :- `

```java
  Employee e = new Employee();
  System.out.println(e);
  System.out.println(e.toString());
```


`Example:- `

```java
      class Rectangle{
	int length;
	int width;
	
	public void set(int l, int w){
		length = l;
		width = w;
	}
	
	/*public void print(){
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		
	*/
	
	public String toString(){
		String msg;
		msg = "Length: " + length + " Width: " + width;
		return msg;
	}
		
	public static void main(String [] args){
		Rectangle r = new Rectangle();
		r.set(10,20);
		
		System.out.println(r);
		
	}
}
```
## 🌟 hashCode() Method in Java

### ✴️  Hash Code Methods

- For every object, JVM generates a unique code.
- If overriding hashCode(), then every object should return unique number.

- *Example:- Employee class, we can return the employee id.*


`Example:- `

```java
   class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
      this.rollNo = rollNo;
      this.name = name;

// 👉 use with student hashCode method to give output:- 101 Sumit
      public String toString(){
        return rollNo + name
      }

      // 👉 use with student hashCode method to give output:- 101
      // public int hashCode() {
      //   return rollNo;
      // }
    }

    public static void main(String [] args){
      Student s1 = new Student(101, "Sumit");
      System.out.println(s1);  //output: Student@3fee733d
      // String hash s1 = String.valueOf(s1.hashCode());
 
      // System.out.println(Integer.toHexString(s1.hashCode));  //output:- 3fee733d
      System.out.println(s1.hashCode());  //output:- 65 
    }
   }
```
## 🌟 Equals() Method in Java

### ✴️  Equals Method

- It compares the given object to the current object.

`Example:- `

```java

class Rectangle{
	int length;
	int width;
	
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "Length:" + length + " Width: " + width;
	}
	
	public boolean equals(Object obj){
		Rectangle r = (Rectangle) obj;
		if ((this.length == r.length) && (this.width == r.width))
			return true;
		return false;
	}
	
	
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 20);
		//Rectangle r3 = r1;
		if (r1.equals(r2))
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Different");

      // 👉 work with primitive data types
		
		/*String s1 = "Hello";
		String s2 = new String("Hello");
		
		if (s1 == s2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are Different");*/
	}
}
	
```
## 🌟 clone() Method in Java

### ✴️  Method of Object Class 

-  **Clone()**

- Creates and returns a copy of the object

- The Java.lang.Cloneable interface must be implemented by the class, whose object clone we want to create.

`Example:- `

```java
class Rectangle implements Cloneable{
	int length;
	int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public String toString(){
		return "Length: " + length + " Width: " + width;
	}
	
	public static void main(String [] args){
		Rectangle r1 = new Rectangle(10,20);
		try{
			Rectangle r2 = (Rectangle) r1.clone();
			System.out.println(r1);
			System.out.println(r2);
		
			r2.length = 35;
			System.out.println("After Modifying R2 - length");
		
			System.out.println(r1);
			System.out.println(r2);
		}
		catch(CloneNotSupportedException ce){
			System.out.println(ce);
		}
		
	}
		
}

```
## 🌟 getClass() Method in Java

### ✴️  Method of Object Class 

- **getClass()**

- Returns the object of Class for the current object.
- Class objects are constructed automaticallyby the Java Virtual Machine and is Final.
- public final Class<?>getClass()   

`Class Class has the flowing methods:- `   
  - ▶️ getConstructors()
  - ▶️ getFields()
  - ▶️ getMethods()
  - ▶️ getName()
  - ▶️ getSuperclass()
  - ▶️ getInterfaces()


  `Example:- GetClass`

  ```java
      class GetClassDemo{
        public static void main(String args[]){
          GetClassDemo obj = new GetClassDemo();
          String className = obj.getClass().getSuperClass().getName();
          System.out.println(className);
          System.out.println(className.getClass().getName());
        }
      }
  ```

## 🌟 finalize() Method in Java

### ✴️  Method of Object Class 

- **finalize()**

- This method is called just before an object is garbage collected.

- finalize() method is overridden to dispose of system resources, perform clean-up activities and minimize memory leaks.

- **protected void finalize() throws Throwable**

- **wait(), notify(), notifyAll()**

- These methods are used for interthread communication.

`Example:- `

```java
   class FinalizeDemo{
    protected void finalize(){
       System.out.println("Finalize Method is called);
    }

    public FinalizeDemo(){
       System.out.println("FinalizeDemo is created);

    }
     public static void main(String args[]){
      FinalizeDemo obj = new FinalizeDemo();

      obj = null;
      System.gc();
      System.out.println("Main Exiting");
     }
   }
   
```

---
---
# Abstract Class And Interface

## 🌟 Abstract Classes and Methods in Java

### ✴️  Abstract Class

- It is the Class whose object cannot be created. It cannot be instantiated.
- To create an abstract Class, use 'abstract' keyword
- An abstract Class can have abstract method as well as regular (non-abstract) methods.
- Constructors are allowed.
- We can have an abstract Class without any abstract method.

### ✴️  Abstract method

- A method which is declared as abstract and does not have implementation is known as an abstract method.
- The implementation of abstract Class is given by its sub Class.
- If a Class contains an abstract method, then the Class should be declared abstract. Otherwise, it will generate an error

`Example:- `

```java
    // Abstract class
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Abstract method
    public abstract double calculateArea();
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

```

## 🌟 Abstract Class and Final Class in Java

### ✴️  Abstract and Final

- An abstract Class/method cannot be made final.
- Both are mutually exclusive concepts.
- To create an abstract class, use 'abstract' keyword.
- An abstract Class can have abstract method as well as regular (non-abstract) methods.

### ✴️  Abstract and Final Difference Between

| S.No. | ABSTRACT ClASS            |  Final Class  | 
|-------|-------------------------- |---------------|
| 1.    | Uses the **"abstract"** key word. | Uses the **"Final"** key word|
| 2.    | This helps to achieve abstraction | This helps to restrict other classes from accessing its properties and methods.|
| 3.    | For later use, all the abstract methods should be overridden | Overriding concept does not arise as final class cannot be inherited |
| 4.    | A few methods can be implemented and a few cannot | All methods should have implementation |
| 5.    | Cannot create immutable objects (infact, no objects can be created) | Immutable objects can be created (eg. String class) |
| 6.    | Abstract class methods functionality can be altered in subclass | Final class methods should be used as it is by other classes |
| 7.    | Can be inherited | Cannot be inherited |
| 8.    | 	Cannot be instantiated | Can be instantiated |
| 9.    | 	Abstract class may have final methods. | Final class does not have abstract methods or final methods. |
| 10.    | 	Abstract class  helps in to achieve Abstraction. | Final class can help to restrict the other classes from accessing the properties and methods. |

## 🌟 Interface in Java

### ✴️  Interface

- Used to define the behavior of the Class.
- Termed as blueprint of a Class Represents IS-A relationship.
- It consists of: 
   - ▶️ Static constants
   - ▶️ Abstract methods.
- All the methods would be abstract.
- It is Used to achieve multiple inheritance.
- A Class can inherit multiple interfaces.
- Interface must specify what a class should do and not how to do.
- If a Class implements the interface, then it should implement all the method declared int the interface, or else the class should be declared as abstract.

### ✴️ Syntax And Example of Interface

- Interface data members are public, static and final by default and the methods are public and abstract by default.

`Syntax:- `   

```java
    interface Ihello{
        int no;
        void f1();
    }

    🔃 compiler

    interface Ihello{
       public static final int no;
       public abstract void f1();
    }
```

`Example:- `

```java
  // Define an interface named "Drawable"
interface Drawable {
    void draw(); // Abstract method without implementation
}

// Implement the interface in a class
class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

class Square implements Drawable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle(5.0);
        Drawable square = new Square(4.0);

        circle.draw(); // Calling the draw method of Circle class
        square.draw(); // Calling the draw method of Square class
    }
}

```

### ✴️ Relationship b/w Class and Interface

```java
         Class                 intreface                  interface
           ⬆️                       ⬆️                          ⬆️
           ⬆️                       ⬆️                          ⬆️  
           ⬆️ 🔀 extends            ⬆️ 🔀 implements            ⬆️ 🔀 extends
           ⬆️                       ⬆️                          ⬆️   
           ⬆️                       ⬆️                          ⬆️
         Class                   Class                    interface
           
```
   
### ✴️ Interface in Java 8

- Default implementation of methods could be given in an interface.
- Static methods could be defined in the interface and can be called independently without an object, directly with reference of interface.

`Example:- `  

```java
  // Define an interface with default and static methods
interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method with an implementation
    default void defaultMethod() {
        System.out.println("This is a default method in MyInterface.");
    }

    // Static method with an implementation
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface.");
    }
}

// Implement the interface
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in MyClass.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod(); // Call the overridden abstract method
        myClass.defaultMethod();  // Call the default method from the interface
        MyInterface.staticMethod(); // Call the static method from the interface
    }
}
```
---
