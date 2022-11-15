package Lesson_06.box_with_disks;

public abstract class Disk {
    private String name;
    private int year;

    public Disk(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public abstract void printAllInfo();


}
