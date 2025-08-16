package test;

public class fractions_addition {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       // numer1 첫번째 분자, denom1 첫번째 분모
        // numer2 두번째 분자, denom2 두번째 분모
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int max = 0;
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0)
                max = i;
        }
        numer=numer/max;
        denom=denom/max;

        int[] answer = {numer,denom};
        return answer;
    }
}
