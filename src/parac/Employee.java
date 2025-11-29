package parac;

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return name + ": " + salary;
    }

    public int getSalary() {
        return salary;
    }
}

