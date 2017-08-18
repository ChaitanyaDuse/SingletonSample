
public class TotalScore {
    private volatile int mTotalScore;
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

    public synchronized void  addToscore(int scoreToadd) {
        mTotalScore += scoreToadd;
    }

    public synchronized int getsCore() {
        return mTotalScore;
    }

    //Make it serialization safe
    protected TotalScore readResolve() {
        return getInsance();
    }


}
