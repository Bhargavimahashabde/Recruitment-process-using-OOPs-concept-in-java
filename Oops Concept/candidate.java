public class Candidate {
    private String name;
    private LocalDate dateOfBirth;
    private String nationality;
    private double hscAggregate;
    private double pcmAverage;
    private double ugCGPA;
    private double pgCGPA;
    private int interviewMarks;
    private boolean isSelected;

    public Candidate(String name, LocalDate dateOfBirth, String nationality, double hscAggregate, double pcmAverage,
            double ugCGPA, double pgCGPA, int interviewMarks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.hscAggregate = hscAggregate;
        this.pcmAverage = pcmAverage;
        this.ugCGPA = ugCGPA;
        this.pgCGPA = pgCGPA;
        this.interviewMarks = interviewMarks;
        this.isSelected = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHscAggregate() {
        return hscAggregate;
    }

    public void setHscAggregate(double hscAggregate) {
        this.hscAggregate = hscAggregate;
    }

    public double getPcmAverage() {
        return pcmAverage;
    }

    public void setPcmAverage(double pcmAverage) {
        this.pcmAverage = pcmAverage;
    }

    public double getUgCGPA() {
        return ugCGPA;
    }

    public void setUgCGPA(double ugCGPA) {
        this.ugCGPA = ugCGPA;
    }

    public double getPgCGPA() {
        return pgCGPA;
    }

    public void setPgCGPA(double pgCGPA) {
        this.pgCGPA = pgCGPA;
    }

    public int getInterviewMarks() {
        return interviewMarks;
    }

    public void setInterviewMarks(int interviewMarks) {
        this.interviewMarks = interviewMarks;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
}