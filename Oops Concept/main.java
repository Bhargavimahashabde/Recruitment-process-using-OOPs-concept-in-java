public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate("Jay Dongare", "11-07-1978", "India",
                "B. E Computer", "M.E. Computer", 9.0, 9.2, 2);

        Recruiter recruiter = new Recruiter();
        Interviewer interviewer = new Interviewer(recruiter, 35);
        HR hr = new HR(recruiter, interviewer);

        hr.hireCandidates();
    }
}