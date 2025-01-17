package baseball.util;

import static org.assertj.core.api.Assertions.assertThat;

public class MessageUtil {

  public static void startMsg() {
    System.out.print("숫자를 입력해 주세요 : ");
  }

  public static void ballCountMsg(Integer ball, Integer strike) {
    //ball
//    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
    if (ball == 0 && strike == 0) {
      System.out.println("낫싱");
    }
    if (ball == 0 && strike != 0) {
      System.out.println(strike + "스트라이크");
    }
    if (ball != 0 && strike == 0) {
      System.out.println(ball + "볼");
    }
    if (ball != 0 && strike != 0) {
      System.out.println(ball + "볼 " + strike + "스트라이크");
    }
  }

  public static void endMsg() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }

  public static void retryMsg() {
    System.out.println("게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요.");
  }
}
