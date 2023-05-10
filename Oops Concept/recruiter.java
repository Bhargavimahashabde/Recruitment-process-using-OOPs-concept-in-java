public class Recruiter {
    private List<Candidate> candidates;
    private int minimumInterviewScore;

    public Recruiter(int minimumInterviewScore) {
        this.candidates = new ArrayList<Candidate>();
        this.minimumInterviewScore = minimumInterviewScore;
    }

    public void addCandidate(Candidate candidate) {
        if (isValidCandidate(candidate)) {
            candidates.add(candidate);
        }
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public List<Candidate> getEligibleCandidates() {
        List<Candidate> eligibleCandidates = new ArrayList<Candidate>();
        for (Candidate candidate : candidates) {
            if (isEligible(candidate)) {
                eligibleCandidates.add(candidate);
            }
        }
        return eligibleCandidates;
    }

    private boolean isValidCandidate(Candidate candidate) {
        // Check candidate validity based on date of birth and other criteria
        return candidate.isValidCandidate();
    }

    private boolean isEligible(Candidate candidate) {
        // Check candidate eligibility based on interview score and other criteria
        return candidate.getInterviewScore() >= minimumInterviewScore && candidate.isEligible();
    }
}
