| Feature          | `Comparable`                     | `Comparator`                               |
| ---------------- | -------------------------------- | ------------------------------------------ |
| Package          | `java.lang`                      | `java.util`                                |
| Interface method | `compareTo(Object o)`            | `compare(T o1, T o2)`                      |
| Sorting logic    | Inside the object class          | Outside the object class                   |
| Used with        | `Collections.sort(list)`         | `Collections.sort(list, comparator)`       |
| Flexibility      | Only one sorting logic per class | Multiple sorting strategies possible       |
| Java 8+ support  | Not functional interface         | **Functional interface** (can use lambdas) |
rablevs
