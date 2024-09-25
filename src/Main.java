import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int numenos[] = new int[10];

        for(int i = 0; i < numenos.length; i++) {
            numenos[i] = (int)Math.round(Math.random() * 100);
            for(int j = 0; j < i; j++) {
                if (numenos[i] == numenos[j]) {
                    numenos[i] = (int)Math.round(Math.random() * 100);
                }
            }
        }

        Arrays.sort(numenos);
        System.out.println(Arrays.toString(numenos));
    }
}
