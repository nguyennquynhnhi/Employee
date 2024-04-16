public class Intern extends Employee{
    private String majors, semester, universityName;
    public Intern(int id, String fullName, String birth, String phone, String email, String employeeType,
                  String majors, String semester, String universityName) {
        super(id, fullName, birth, phone, email, employeeType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: "+ majors +
                "\nSemester: "+ semester +
                "\nUniversityName: "+ universityName);
    }
}
