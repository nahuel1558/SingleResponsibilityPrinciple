package Model;


public class Employee {
    private String name;
    private String position;
    private float hourlySalary;
    private String email;

    public Employee(String name, String position, float hourlySalary, String email) {
        this.name = name;
        this.position = position;
        this.hourlySalary = hourlySalary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(float hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}
