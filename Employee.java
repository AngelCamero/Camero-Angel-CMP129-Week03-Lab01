public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String Name, int idNumber,String department, String position){
        setName(Name);
        setIdNumber(idNumber);
        setDepartment(department);
        setPosition(position);
    }
    public String getName(){
        return this.name;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getPosition(){
        return this.position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIdNumber(int IDNumber){
        this.idNumber = IDNumber;
    }
    public void setDepartment(String Department){
        this.department = Department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public Employee(){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public void displayInfo(){
        System.out.println("Name: " + this.name + "     IDNumber: " + this.idNumber + "     Department: " + this.department + "     Position: " + this.position);
    }
}
