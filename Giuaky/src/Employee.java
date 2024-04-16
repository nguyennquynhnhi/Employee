public class Employee implements IEmployee{
    protected int id;
    protected String fullName, birth, phone, email;
    protected String employeeType;
    protected int employeeCount = 0;

    public Employee(int id, String fullName, String birth, String phone, String email, String employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        employeeCount++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirth() {
        return birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: "+id +
                "\nFullName: "+ fullName +
                "\nBirthDay: "+ birth +
                "\nPhone: "+ phone +
                "\nEmail: "+ email +
                "\nEmployeeType: "+ employeeType);
    }
    public int getEmployeeCount() {
        return employeeCount;
    }
}
