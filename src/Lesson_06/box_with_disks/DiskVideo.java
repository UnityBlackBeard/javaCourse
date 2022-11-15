package Lesson_06.box_with_disks;

public class DiskVideo extends Disk{

    //private String name;
    //private String year;
    private String studio;
    private String director;
    private int longTime;

    public DiskVideo(String name, int year, String studio, String director, int longTime) {
        super(name, year);
        this.studio = studio;
        this.director = director;
        this.longTime = longTime;
    }


    public String getStudio() {
        return studio;
    }

    public String getDirector() {
        return director;
    }

    public int getLongTime() {
        return longTime;
    }

    @Override
    public void printAllInfo() {
        System.out.println(getName()+" "+getYear()+" "+getDirector()+" "+getStudio()+" "+getLongTime());
    }
}
