package baseball.controller;

import baseball.service.BaseBallService;
import baseball.util.MessageUtil;
import camp.nextstep.edu.missionutils.Console;

public class BaseBallController {

  BaseBallService baseBallService = new BaseBallService();

  final Integer RE_GAME = 1;
  final Integer END_GAME = 2;

  public void run() throws IllegalArgumentException {
    startGame();
    endGame();
    reGame();
  }

  private void startGame() {
    baseBallService.play();

  }

  private void endGame() {
    MessageUtil.endMsg();
  }

  private void reGame() {
    MessageUtil.retryMsg();
    if (getInputNum() == RE_GAME) {
      run();
    }
  };

  private int getInputNum() throws IllegalArgumentException {
    int inputNum = Integer.parseInt(Console.readLine());

    if (inputNum == 0 || inputNum > END_GAME) {
      throw new IllegalArgumentException();
    }
    return inputNum;
  }

}
