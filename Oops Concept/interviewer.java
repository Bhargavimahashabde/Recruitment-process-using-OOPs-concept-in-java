public class Interviewer {
    private List<Candidate> candidatesToInterview;
    private int minimumInterviewScore;

    public Interviewer(Recruiter recruiter, int minimumInterviewScore) {
        this.candidatesToInterview = recruiter.getEligibleCandidates();
        this.minimumInterviewScore = minimumInterviewScore;
    }

    public void conductInterviews() {
        for (Candidate candidate : candidatesToInterview) {
            int interviewScore = askQuestions(candidate);
            candidate.setInterviewScore(interviewScore);
        }
    }

    private int askQuestions(Candidate candidate) {
        // Ask interview questions and return interview score
        // Calculation logic here
    }
}
