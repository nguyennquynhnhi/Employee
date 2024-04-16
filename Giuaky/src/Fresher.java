public class Fresher extends Employee{
    private String graduationDate, graduationRank, education;
    public Fresher(int id, String fullName, String birth, String phone, String email, String employeeType,
                   String graduationDate, String graduationRank, String education) {
        super(id, fullName, birth, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("GraduationDate: "+ graduationDate +
                "\nGraduationRank: "+ graduationRank +
                "\nEducation: "+ education);
    }
}
