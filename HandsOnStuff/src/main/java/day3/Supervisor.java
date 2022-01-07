package day3;

public class Supervisor extends Employee{
    private int experience;

    public Supervisor(int id, String name, int experience) {
        super(id, name);
        this.experience = experience;
    }

    public Supervisor() {
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
