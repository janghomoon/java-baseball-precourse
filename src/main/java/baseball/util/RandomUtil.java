package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomUtil {
  final static Integer START_NUMBER = 1;
  final static Integer END_NUMBER = 9;
  final static Integer NUMBER_LENGTH = 3;
  public static List<Integer> getRandomNumbers() {
    return Randoms.pickUniqueNumbersInRange(START_NUMBER, END_NUMBER, NUMBER_LENGTH);
  }

}
