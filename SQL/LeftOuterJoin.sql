/*
✅ LEFT JOIN in SQL — Explanation with Example

🔹 What is LEFT JOIN?
- Returns **all rows from the left table**, and **matched rows** from the right table.
- If no match is found, NULLs are returned for right table columns.

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
Show all employees and their departments, even if no department is assigned.

🔹 SQL Query:
*/

SELECT e.name AS employee_name, d.dept_name
FROM employees e
LEFT JOIN departments d
ON e.dept_id = d.id;

/*
🔸 Output:

| employee_name | dept_name |
|---------------|-----------|
| Alice         | HR        |
| Bob           | Sales     |
| Charlie       | NULL      |
| Diana         | NULL      |

🧠 Why?
- Alice & Bob → Match found in departments → ✅
- Charlie → dept_id = 103 → ❌ no match → NULL
- Diana → dept_id = NULL → ❌ no match → NULL

🔁 Summary:
- LEFT JOIN = All rows from left + matching right rows
- No match = NULL in right side columns
- Use when you want to keep all records from the left table
*/
