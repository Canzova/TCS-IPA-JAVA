# Java String Methods

Java provides a variety of methods for manipulating and analyzing strings. Here's a brief overview of the most commonly used methods along with examples.

## 1. `int length()`
Returns the number of characters in the String.

**Syntax**:
```java
int length()
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("String length: " + str.length());
```

**Output**:
```
String length: 13
```

---

## 2. `char charAt(int i)`
Returns the character at the specified index `i`.

**Syntax**:
```java
char charAt(int i)
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("Character at index 3: " + str.charAt(3));
```

**Output**:
```
Character at index 3: k
```

---

## 3. `String substring(int i)`
Returns the substring starting from index `i`.

**Syntax**:
```java
String substring(int i)
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("Substring from index 3: " + str.substring(3));
```

**Output**:
```
Substring from index 3: ksforGeeks
```

---

## 4. `String substring(int i, int j)`
Returns the substring from index `i` to `j-1`.

**Syntax**:
```java
String substring(int i, int j)
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("Substring between index 2 and 5: " + str.substring(2, 5));
```

**Output**:
```
Substring between index 2 and 5: eks
```

---

## 5. `String concat(String str)`
Concatenates the specified string to the end of this string.

**Syntax**:
```java
String concat(String str)
```

**Example**:
```java
String s1 = "Geeks";
String s2 = "forGeeks";
System.out.println("Concatenated string: " + s1.concat(s2));
```

**Output**:
```
Concatenated string: GeeksforGeeks
```

---

## 6. `int indexOf(String s)`
Returns the index of the first occurrence of the specified string `s`. Returns `-1` if not found.

**Syntax**:
```java
int indexOf(String s)
```

**Example**:
```java
String str = "Learn Share Learn";
System.out.println("Index of 'Share': " + str.indexOf("Share"));
```

**Output**:
```
Index of 'Share': 6
```

---

## 7. `int indexOf(String s, int i)`
Returns the index of the first occurrence of the specified string, starting search from index `i`.

**Syntax**:
```java
int indexOf(String s, int i)
```

**Example**:
```java
String str = "Learn Share Learn";
System.out.println("Index of 'a' after index 3: " + str.indexOf('a', 3));
```

**Output**:
```
Index of 'a' after index 3: 8
```

---

## 8. `int lastIndexOf(String s)`
Returns the index of the last occurrence of the specified string. Returns `-1` if not found.

**Syntax**:
```java
int lastIndexOf(String s)
```

**Example**:
```java
String str = "Learn Share Learn";
System.out.println("Last index of 'Learn': " + str.lastIndexOf("Learn"));
```

**Output**:
```
Last index of 'Learn': 12
```

---

## 9. `boolean equals(Object otherObj)`
Compares this string to the specified object for equality.

**Syntax**:
```java
boolean equals(Object otherObj)
```

**Example**:
```java
String str1 = "Geeks";
String str2 = "Geeks";
System.out.println("Are strings equal? " + str1.equals(str2));
```

**Output**:
```
Are strings equal? true
```

---

## 10. `boolean equalsIgnoreCase(String anotherString)`
Compares two strings ignoring case.

**Syntax**:
```java
boolean equalsIgnoreCase(String anotherString)
```

**Example**:
```java
String str1 = "Geeks";
String str2 = "geeks";
System.out.println("Are strings equal ignoring case? " + str1.equalsIgnoreCase(str2));
```

**Output**:
```
Are strings equal ignoring case? true
```

---

## 11. `int compareTo(String anotherString)`
Compares two strings lexicographically.

**Syntax**:
```java
int compareTo(String anotherString)
```

**Example**:
```java
String str1 = "Geeks";
String str2 = "forGeeks";
System.out.println("Lexicographical difference: " + str1.compareTo(str2));
```

**Output**:
```
Lexicographical difference: -31
```

---

## 12. `int compareToIgnoreCase(String anotherString)`
Compares two strings lexicographically, ignoring case.

**Syntax**:
```java
int compareToIgnoreCase(String anotherString)
```

**Example**:
```java
String str1 = "Geeks";
String str2 = "GEEKS";
System.out.println("Comparison ignoring case: " + str1.compareToIgnoreCase(str2));
```

**Output**:
```
Comparison ignoring case: 0
```

---

## 13. `String toLowerCase()`
Converts all characters of the string to lowercase.

**Syntax**:
```java
String toLowerCase()
```

**Example**:
```java
String str = "GeeKyMe";
System.out.println("Lowercase: " + str.toLowerCase());
```

**Output**:
```
Lowercase: geekyme
```

---

## 14. `String toUpperCase()`
Converts all characters of the string to uppercase.

**Syntax**:
```java
String toUpperCase()
```

**Example**:
```java
String str = "GeeKyMe";
System.out.println("Uppercase: " + str.toUpperCase());
```

**Output**:
```
Uppercase: GEEKYME
```

---

## 15. `String trim()`
Removes whitespace from both ends of the string.

**Syntax**:
```java
String trim()
```

**Example**:
```java
String str = "  Learn Share Learn  ";
System.out.println("Trimmed string: " + str.trim());
```

**Output**:
```
Trimmed string: Learn Share Learn
```

---

## 16. `String replace(char oldChar, char newChar)`
Replaces all occurrences of `oldChar` with `newChar`.

**Syntax**:
```java
String replace(char oldChar, char newChar)
```

**Example**:
```java
String str = "feeksforfeeks";
System.out.println("Replaced string: " + str.replace('f', 'g'));
```

**Output**:
```
Replaced string: geeksforgeeks
```

---

## 17. `boolean contains(CharSequence sequence)`
Checks if the string contains the specified sequence.

**Syntax**:
```java
boolean contains(CharSequence sequence)
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("Contains 'for': " + str.contains("for"));
```

**Output**:
```
Contains 'for': true
```

---

## 18. `char[] toCharArray()`
Converts the string to a character array.

**Syntax**:
```java
char[] toCharArray()
```

**Example**:
```java
String str = "Geeks";
char[] charArray = str.toCharArray();
System.out.println("Character Array: " + Arrays.toString(charArray));
```

**Output**:
```
Character Array: [G, e, e, k, s]
```

---

## 19. `boolean startsWith(String prefix)`
Checks if the string starts with the specified prefix.

**Syntax**:
```java
boolean startsWith(String prefix)
```

**Example**:
```java
String str = "GeeksforGeeks";
System.out.println("Starts with 'Geeks': " + str.startsWith("Geeks"));
```

**Output**:
```
Starts with 'Geeks': true
```