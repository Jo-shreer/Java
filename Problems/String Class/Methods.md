Java String methods

# 0. valueOf()
Converts other types to string.
String numStr = String.valueOf(123);  // "123"
the valueOf method is converting the integer 123 into its string representation "123".
  
# 1. length()
Returns the length of the string.
  
String s = "Hello";
int len = s.length();  // 5

# 2. charAt(int index)
Returns the character at the specified index.

char c = s.charAt(1);  // 'e'

# 3. substring(int beginIndex)
Returns substring from beginIndex to end.

String sub = s.substring(2);  // "llo"

# 4. substring(int beginIndex, int endIndex)
Returns substring between indices.
String sub2 = s.substring(1, 4);  // "ell"

# 5. equals(Object other)
Checks if two strings are equal.

boolean eq = s.equals("Hello");  // true

# 6. equalsIgnoreCase(String other)
Checks equality ignoring case.
boolean eqIgnore = s.equalsIgnoreCase("hello");  // true

# 7. toLowerCase()
Converts string to lower case.
String lower = s.toLowerCase();  // "hello"

# 8. toUpperCase()
Converts string to upper case.
String upper = s.toUpperCase();  // "HELLO"

# 9. trim()
Removes leading and trailing spaces.

String spaced = "  Hi  ";
String trimmed = spaced.trim();  // "Hi"

# 10. contains(CharSequence s)
Checks if string contains given sequence.

boolean hasEll = s.contains("ell");  // true

# 11. indexOf(String str)
Returns index of first occurrence or -1
int idx = s.indexOf("l");  // 2

# 12. lastIndexOf(String str)
Returns last occurrence index
int lastIdx = s.lastIndexOf("l");  // 3

# 13. replace(char oldChar, char newChar)
Replaces all occurrences of oldChar with newChar
String replaced = s.replace('l', 'p');  // "Heppo"

# 14. split(String regex)
Splits string into array by regex delimiter.

String[] parts = "a,b,c".split(",");  // ["a", "b", "c"]

# 15. startsWith(String prefix)
Checks if string starts with prefix
boolean starts = s.startsWith("He");  // true

# 16. endsWith(String suffix)
Checks if string ends with suffix.

boolean ends = s.endsWith("lo");  // true

# 17. isEmpty()
Checks if string length is zero.
boolean empty = "".isEmpty();  // true

# 18. concat(String str)
Concatenates another string.
String concat = s.concat(" World");  // "Hello World"

# 19. valueOf()
Converts other types to string.
String numStr = String.valueOf(123);  // "123"
the valueOf method is converting the integer 123 into its string representation "123".

# 20. compareTo(String anotherString)
Lexicographically compares two strings.
int result = "apple".compareTo("banana");  // negative (because "apple" < "banana")

# 21. compareToIgnoreCase(String str)
Case-insensitive comparison.
int result = "Apple".compareToIgnoreCase("apple");  // 0

# 22. repeat(int count) (Java 11+)
Repeats the string count times.
String repeated = "abc".repeat(3);  // "abcabcabc"

# 23. isBlank() (Java 11+)
Checks if string is empty or only whitespace.
boolean blank = "  \t\n".isBlank();  // true
isBlank() returns true if the string is empty or contains only whitespace characters, 
including spaces, tabs, newlines, etc.







