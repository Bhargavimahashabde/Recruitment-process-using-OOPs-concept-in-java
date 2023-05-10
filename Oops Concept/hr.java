public class HR {
    private Recruiter recruiter;
    private Interviewer interviewer;

    public HR() {
        this.recruiter = new Recruiter();
        this.interviewer = new Interviewer(recruiter, 35);
    }

    public void hireCandidates() {
        interviewer.conductInterviews();
        List<Candidate> candidatesToHire = recruiter.getEligibleCandidates();

        for (Candidate candidate : candidatesToHire) {
            boolean isHired = checkDocuments(candidate);
            if (isHired) {
                notifyCandidate(candidate);
            }
        }
    }

    private boolean checkDocuments(Candidate candidate) {
        // Check candidate documents and return boolean value
        // Calculation logic here
    }

    private void notifyCandidate(Candidate candidate) {
        // Notify candidate of their hiring status
        // Notification logic here
    }
}