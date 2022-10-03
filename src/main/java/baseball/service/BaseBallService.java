package baseball.service;

import baseball.domain.BallInfo;
import baseball.util.MessageUtil;
import baseball.util.ParserUtil;
import baseball.util.RandomUtil;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class BaseBallService {

  BallInfo ballInfo;

  public void play() {
    int strike = 0;
    List<Integer> computerBalls = RandomUtil.getRandomNumbers();
    while (strike != 3) {
      playBaseBall(computerBalls);
      MessageUtil.ballCountMsg(ballInfo.getBallCnt(), ballInfo.getStrikeCnt());
      strike = ballInfo.getStrikeCnt();
    }
  }

  private void playBaseBall(List<Integer> computerBalls) {
    setBallInfo(computerBalls);
    score();
  }

  private void score() {
    ballInfo.score();
  }

  private void setBallInfo(List<Integer> computerBalls) {
    ballInfo = new BallInfo(getUserBalls(), computerBalls);

  }

  private List<Integer> getUserBalls() throws IllegalArgumentException {
    MessageUtil.startMsg();
    String input = Console.readLine();
    return ParserUtil.StringToIntegerList(input);
  }

}
