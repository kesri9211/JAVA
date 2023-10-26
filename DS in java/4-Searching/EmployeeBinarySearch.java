/* Write a program to implement Binary search on 1D array of Employee structure
(contains employee_name, emp_no, emp_salary), with key as emp_no. And count
the number of comparison happened.
*/
package Searching;

class Employee {
    String employee_name;
    int emp_no;
    double emp_salary;

    public Employee(String name, int emp_no, double emp_salary) {
        this.employee_name = name;
        this.emp_no = emp_no;
        this.emp_salary = emp_salary;
    }
}

public class EmployeeBinarySearch {
    // Binary search function that takes an array of Employees and an emp_no key
    public static int binarySearch(Employee[] employees, int key) {
        int left = 0;  // Initialize the left index
        int right = employees.length - 1;  // Initialize the right index
        int comparisons = 0;  // Initialize a variable to count comparisons

        while (left <= right) {  // Continue the loop as long as the left index is less than or equal to the right index
            int mid = (right + left) / 2;  // Calculate the middle index
            comparisons++;  // Increment the comparison count

            if (employees[mid].emp_no == key) {  // If the middle employee's emp_no matches the key
                System.out.println("Employee found after " + comparisons + " comparisons.");
                return mid;  // Return the index of the found employee
            } else if (employees[mid].emp_no < key) {  // If the key is greater, search in the right half
                left = mid + 1;  // Update the left index
            } else {  // If the key is smaller, search in the left half
                right = mid - 1;  // Update the right index
            }
        }

        System.out.println("Employee not found after " + comparisons + " comparisons.");
        return -1;  // Key not found in the array
    }

    public static void main(String[] args) {
        //array of object to store details
        Employee[] employees = {
                new Employee("John", 101, 50000.0),
                new Employee("Alice", 102, 60000.0),
                new Employee("Bob", 103, 55000.0),
                new Employee("Eve", 104, 65000.0),
                new Employee("Charlie", 105, 70000.0)
        };

        int key = 105; // The employee number to search for
        int result = binarySearch(employees, key);  // Call the binary search function

        if (result != -1) {  // If the key was found in the array
            System.out.println("Employee found: " + employees[result].employee_name + " (Emp No: " + employees[result].emp_no + ", Salary: " + employees[result].emp_salary + ")");
        } else {  // If the key was not found in the array
            System.out.println("Employee not found.");
        }
    }
}
