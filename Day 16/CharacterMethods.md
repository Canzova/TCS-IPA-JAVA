# Character Class in Java


Java provides a wrapper class `Character` in the `java.lang` package. An object of type `Character` contains a single field, whose type is `char`. The `Character` class offers a number of useful class (i.e., static) methods for manipulating characters. You can create a `Character` object with the `Character` constructor.

## Creating a Character Object

```java
Character ch = new Character('a');
```

The above statement creates a `Character` object which contains 'a' of type `char`. There is only one constructor in the `Character` class that expects an argument of `char` data type.

If we pass a primitive `char` into a method that expects an object, the compiler automatically converts the `char` to a `Character` class object. This feature is called **Autoboxing** and **Unboxing**.

> **Note:** The `Character` class is immutable, like the `String` class, i.e., once its object is created, it cannot be changed.

## Methods in Character Class

### 1. `boolean isLetter(char ch)`

This method is used to determine whether the specified `char` value (ch) is a letter or not. It returns `true` if it is a letter (`[A-Z]`, `[a-z]`), otherwise it returns `false`.

**Syntax:**

```java
boolean isLetter(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns `true` if `ch` is an alphabet, otherwise returns `false`.

**Example:**

```java
// Java program to demonstrate isLetter() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.isLetter('A')); 
        System.out.println(Character.isLetter('0')); 
    } 
}
```

**Output:**

```
true
false
```

---

### 2. `boolean isDigit(char ch)`

This method is used to determine whether the specified `char` value (ch) is a digit or not.

**Syntax:**

```java
boolean isDigit(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns `true` if `ch` is a digit, otherwise returns `false`.

**Example:**

```java
// Java program to demonstrate isDigit() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.isDigit('A')); 
        System.out.println(Character.isDigit('0')); 
    } 
}
```

**Output:**

```
false
true
```

---

### 3. `boolean isWhitespace(char ch)`

Determines whether the specified `char` value (ch) is whitespace. Whitespace includes space, tab, or newline.

**Syntax:**

```java
boolean isWhitespace(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns `true` if `ch` is whitespace, otherwise returns `false`.

**Example:**

```java
// Java program to demonstrate isWhitespace() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.isWhitespace('A')); 
        System.out.println(Character.isWhitespace(' ')); 
        System.out.println(Character.isWhitespace('\n')); 
        System.out.println(Character.isWhitespace('\t')); 
        System.out.println(Character.isWhitespace(9)); // ASCII value of tab
        System.out.println(Character.isWhitespace('9')); 
    } 
}
```

**Output:**

```
false
true
true
true
true
false
```

---

### 4. `boolean isUpperCase(char ch)`

Determines whether the specified `char` value (ch) is uppercase or not.

**Syntax:**

```java
boolean isUpperCase(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns `true` if `ch` is upper case, otherwise returns `false`.

**Example:**

```java
// Java program to demonstrate isUpperCase() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.isUpperCase('A')); 
        System.out.println(Character.isUpperCase('a')); 
        System.out.println(Character.isUpperCase(65)); 
    } 
}
```

**Output:**

```
true
false
true
```

---

### 5. `boolean isLowerCase(char ch)`

Determines whether the specified `char` value (ch) is lowercase or not.

**Syntax:**

```java
boolean isLowerCase(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns `true` if `ch` is lower case, otherwise returns `false`.

**Example:**

```java
// Java program to demonstrate isLowerCase() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.isLowerCase('A')); 
        System.out.println(Character.isLowerCase('a')); 
        System.out.println(Character.isLowerCase(97)); 
    } 
}
```

**Output:**

```
false
true
true
```

---

### 6. `char toUpperCase(char ch)`

Returns the uppercase of the specified `char` value (ch). If an ASCII value is passed, then the ASCII value of its uppercase will be returned.

**Syntax:**

```java
char toUpperCase(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns the uppercase form of the specified `char` value.

**Example:**

```java
// Java program to demonstrate toUpperCase() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.toUpperCase('a')); 
        System.out.println(Character.toUpperCase(97)); 
        System.out.println(Character.toUpperCase(48)); 
    } 
}
```

**Output:**

```
A
65
48
```

---

### 7. `char toLowerCase(char ch)`

Returns the lowercase of the specified `char` value (ch).

**Syntax:**

```java
char toLowerCase(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns the lowercase form of the specified `char` value.

**Example:**

```java
// Java program to demonstrate toLowerCase() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.toLowerCase('A')); 
        System.out.println(Character.toLowerCase(65)); 
        System.out.println(Character.toLowerCase(48)); 
    } 
}
```

**Output:**

```
a
97
48
```

---

### 8. `String toString(char ch)`

Returns a `String` class object representing the specified character value (ch), i.e., a one-character string. Here we cannot pass an ASCII value.

**Syntax:**

```java
String toString(char ch)
```

**Parameters:**

- `ch` – a primitive character

**Returns:** It returns a `String` object.

**Example:**

```java
// Java program to demonstrate toString() method 
public class Test { 
    public static void main(String[] args) { 
        System.out.println(Character.toString('x')); 
        System.out.println(Character.toString('Y')); 
    } 
}
```

**Output:**

```
x
Y
```