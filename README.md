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