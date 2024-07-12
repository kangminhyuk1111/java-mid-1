package lang.math;

import java.util.Arrays;

public class LottoMain {

    public static void main(String[] args) {
        final LottoGenerator lottoGenerator = new LottoGenerator();

        lottoGenerator.generate();

        final int[] lottoNumbers = lottoGenerator.getLottoNumbers();

        System.out.println("로또 번호 : " + Arrays.toString(lottoNumbers));
    }
}
