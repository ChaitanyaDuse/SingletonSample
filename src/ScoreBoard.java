
public class ScoreBoard {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(TotalScore.getInsance().getsCore());
                    TotalScore.getInsance().addToscore(1);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(TotalScore.getInsance().getsCore());
                    TotalScore.getInsance().addToscore(1);
                }
            }
        });


        t1.run();
        t2.run();



    }
}
