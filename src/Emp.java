class Emp {
    String name;
    String dept;
    Emp(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
    public String toString() {
        return name + ": " + dept;
    }
}