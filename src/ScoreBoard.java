
public class ScoreBoard {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            System.out.println(TotalScore.getInsance().getsCore());
            TotalScore.getInsance().addToscore(1);


        }
    }
}
