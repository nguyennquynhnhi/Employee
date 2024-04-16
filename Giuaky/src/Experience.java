public class Experience extends Employee{
    private int expInYear;
    private String proSkill;

    public Experience(int id, String fullName, String birth, String phone, String email, String employeeType,
                     int expInYear, String proSkill) {
        super(id, fullName, birth, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ExpInYear: "+ expInYear + "\nProSkill: "+ proSkill);
    }
}
