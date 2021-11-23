public class Employee {
    int eId;
    String eName;
    double eSalary;

    public Employee(int eId, String eName, double eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
}
