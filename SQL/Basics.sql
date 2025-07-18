-- ✅ SQL Queries Cheat Sheet (Beginner to Intermediate)

-- 🔹 1. SELECT → Fetch data from a table
SELECT * FROM employees;
SELECT name, salary FROM employees;

-- 🔹 2. WHERE → Filter rows
SELECT * FROM employees WHERE department = 'HR';
SELECT * FROM products WHERE price > 100;

-- 🔹 3. AND, OR, NOT → Combine conditions
SELECT * FROM users WHERE age > 18 AND country = 'India';
SELECT * FROM orders WHERE NOT status = 'Delivered';

-- 🔹 4. ORDER BY → Sort results
SELECT * FROM employees ORDER BY salary DESC;
SELECT * FROM products ORDER BY name ASC;

-- 🔹 5. LIMIT → Limit number of results (MySQL/PostgreSQL)
SELECT * FROM employees LIMIT 5;

-- 🔹 6. INSERT → Add data
INSERT INTO employees (name, age, department)
VALUES ('John', 30, 'Sales');

-- 🔹 7. UPDATE → Modify data
UPDATE employees SET salary = 60000 WHERE name = 'Alice';

-- 🔹 8. DELETE → Remove data
DELETE FROM employees WHERE id = 5;

-- 🔹 9. LIKE → Pattern matching
SELECT * FROM customers WHERE name LIKE 'A%'; -- starts with A
SELECT * FROM customers WHERE email LIKE '%.com';

-- 🔹 10. IN → Match multiple values
SELECT * FROM students WHERE grade IN ('A', 'B');

-- 🔹 11. BETWEEN → Range filter
SELECT * FROM products WHERE price BETWEEN 100 AND 500;

-- 🔹 12. IS NULL / IS NOT NULL
SELECT * FROM orders WHERE delivery_date IS NULL;

-- 🔹 13. JOINs → Combine tables
-- INNER JOIN
SELECT employees.name, departments.name
FROM employees
INNER JOIN departments ON employees.dept_id = departments.id;

-- LEFT JOIN
SELECT customers.name, orders.order_date
FROM customers
LEFT JOIN orders ON customers.id = orders.customer_id;

-- 🔹 14. GROUP BY + Aggregates
SELECT department, COUNT(*) AS emp_count
FROM employees
GROUP BY department;

SELECT department, AVG(salary)
FROM employees
GROUP BY department;

-- 🔹 15. HAVING → Filter after GROUP BY
SELECT department, COUNT(*) as total
FROM employees
GROUP BY department
HAVING COUNT(*) > 5;

-- 🔹 16. CREATE TABLE
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    grade CHAR(1)
);

-- 🔹 17. ALTER TABLE
ALTER TABLE students ADD COLUMN email VARCHAR(100);
ALTER TABLE students DROP COLUMN age;

-- 🔹 18. DROP TABLE
DROP TABLE IF EXISTS old_data;

-- 🔹 19. SUBQUERY (Nested SELECT)
SELECT name FROM employees
WHERE dept_id = (SELECT id FROM departments WHERE name = 'HR');

-- 🔹 20. DISTINCT → Remove duplicates
SELECT DISTINCT department FROM employees;

-- 💡 Tip:
-- Use aliases for better readability
SELECT e.name, d.name AS dept_name
FROM employees e
JOIN departments d ON e.dept_id = d.id;
  
