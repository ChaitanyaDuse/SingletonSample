
public class ScoreBoard {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    TotalScore.getInsance().addToscore(1);
                    System.out.println("Java Score -> " + TotalScore.getInsance().getsCore());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    TotalScore.getInsance().addToscore(1);
                    System.out.println("Java Score -> " +TotalScore.getInsance().getsCore());
                }
            }
        });


        t1.run();
        t2.run();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    KotlinScore.INSTANCE.addScore(1);
                    System.out.println("Kotlin Score -> " +KotlinScore.INSTANCE.getTotalScore());
                }
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {

                    KotlinScore.INSTANCE.addScore(1);
                    System.out.println("Kotlin Score -> " +KotlinScore.INSTANCE.getTotalScore());
                }
            }
        });


        t3.run();
        t4.run();

    }
}
