package lang.math;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;

    public void generate() {
        lottoNumbers = new int[6];

        for(int i = 0; i < 6; i++){
            int lottoNumber = random.nextInt(45) + 1;
            if(isUnique(lottoNumber)){
                lottoNumbers[i] = lottoNumber;
            }
        }
    }

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for(int i = 0; i < 6; i++){
            if (lottoNumbers[i] == number){
                return false;
            }
        }
        return true;
    }
}
