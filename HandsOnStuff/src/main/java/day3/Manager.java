package day3;

public class Manager extends Employee {
    private String qualifications;

    public Manager(int id, String name, String qualifications) {
        super(id, name);
        this.qualifications = qualifications;
    }

    public Manager() {
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
