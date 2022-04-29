package Exercises.chapterNine;

class Staff extends UEmployee {
    private String department;

    public Staff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}
