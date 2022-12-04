package Lesson_12;

public class Specialist {
    private String name;
    private Integer salary;
    private Speciality speciality;


    public Specialist(String name, Integer salary, Speciality speciality) {
        this.name = name;
        this.salary = salary;
        this.speciality = speciality;
    }


    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

}
