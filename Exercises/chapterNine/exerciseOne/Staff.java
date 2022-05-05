package Exercises.chapterNine.exerciseOne;

class Staff extends UEmployee {
    private String title;

    public Staff(String name, double salary, String title) {
        super(name, salary);
        this.title = title;
    }
    
    public void setTitle(String department) {
        this.title = department;
    }

    public String getTitle() {
        return this.title;
    }
}
