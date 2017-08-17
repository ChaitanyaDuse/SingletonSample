
public class TotalScore {
    private int mTotalScore;
    private static TotalScore sTotalScore = new TotalScore();

    private TotalScore() {
        // Make it reflection safe
        if (sTotalScore != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static TotalScore getInsance() {
        return sTotalScore;
    }

    public void addToscore(int scoreToadd) {
        mTotalScore += scoreToadd;
    }

    public int getsCore() {
        return mTotalScore;
    }

    //Make it serialization safe
    protected TotalScore readResolve() {
        return getInsance();
    }


}
