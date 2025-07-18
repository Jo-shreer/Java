/*
✅ INNER JOIN in SQL — Explanation with Example Tables (Single-Click Copy)

🔹 What is INNER JOIN?
- Combines rows from two or more tables **only when they have 
  matching values**
  in a common column.
- It returns only the rows with a match in both tables.

🧾 Table 1: employees

| id | name     | dept_id |
|----|----------|---------|
| 1  | Alice    | 101     |
| 2  | Bob      | 102     |
| 3  | Charlie  | 103     |
| 4  | Diana    | NULL    |

🧾 Table 2: departments

| id  | dept_name   |
|-----|-------------|
| 101 | HR          |
| 102 | Sales       |
| 104 | Marketing   |

🎯 Goal:
Get a list of employee names and their department names using INNER JOIN.

🔹 SQL Query:
*/

SELECT e.name AS employee_name, d.dept_name
FROM employees e
INNER JOIN departments d
ON e.dept_id = d.id;

/*
🟢 Output:

| employee_name | dept_name |
|---------------|-----------|
| Alice         | HR        |
| Bob           | Sales     |

🧠 Why?
- Alice → dept_id 101 → matches with HR ✅
- Bob → dept_id 102 → matches with Sales ✅
- Charlie → dept_id 103 → ❌ No match → excluded
- Diana → dept_id NULL → ❌ No match → excluded
- Department 104 (Marketing) → ❌ No employee → excluded

🔁 Summary:
- INNER JOIN = only matching rows from both tables.
- Syntax:
  SELECT ...
  FROM table1
  INNER JOIN table2
  ON table1.column = table2.column;
*/
