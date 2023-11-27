class GameEntry {
    int score;
}
public class Q9{
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry();
            A[i].score = i * 100;
        }

        GameEntry[] B = A.clone();
        A[4].score = 550;

        System.out.println(B[4].score);
    }
}

