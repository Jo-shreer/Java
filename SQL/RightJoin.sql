/*
✅ RIGHT JOIN in SQL — Explanation with Example

🔹 What is RIGHT JOIN?
- Returns **all rows from the right table**, and **matched rows** from the left table.
- If there is no match, NULLs are returned from the left side.

🧾 Table: employees
| id | name     | dept_id |
|----|----------|---------|
| 1  | Alice    | 101     |
| 2  | Bob      | 102     |
| 3  | Charlie  | 103     |
| 4  | Diana    | NULL    |

🧾 Table: departments
| id  | dept_name   |
|-----|-------------|
| 101 | HR          |
| 102 | Sales       |
| 104 | Marketing   |

🎯 Goal:
List all departments and the employees in them (even if no employee exists in that department).

🔹 SQL Query:
*/

SELECT e.name AS employee_name, d.dept_name
FROM employees e
RIGHT JOIN departments d
ON e.dept_id = d.id;

/*
🔸 Output:

| employee_name | dept_name  |
|---------------|------------|
| Alice         | HR         |
| Bob           | Sales      |
| NULL          | Marketing  |

🧠 Why?
- Alice → dept_id = 101 → HR ✅
- Bob → dept_id = 102 → Sales ✅
- No employee with dept_id = 104 → Marketing → ❌ → NULL from employees

🔁 Summary:
- RIGHT JOIN = All rows from right table + matching rows from left table
- No match = NULL in left table columns
- Useful when you want to list all items from the right table (e.g., departments), even if they’re unused.
*/
                                                
