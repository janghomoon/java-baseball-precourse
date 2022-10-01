package baseball.domain;

import java.util.List;

public class BallInfo {

  private List<Integer> userBalls;
  private List<Integer> computerBalls;
  private Integer strikeCnt = 0;
  private Integer ballCnt = 0;

  public Integer getStrikeCnt() {
    return strikeCnt;
  }

  public Integer getBallCnt() {
    return ballCnt;
  }

  public BallInfo(List<Integer> userBalls, List<Integer> computerBalls) {
    this.userBalls = userBalls;
    this.computerBalls = computerBalls;
  }

  public void calculationStrikeCount() {
    for (int idx = 0; idx < userBalls.size(); idx++) {
      Strike(userBalls.get(idx), computerBalls.get(idx));
    }
  }

  private void Strike(Integer userBall, Integer computerBall) {
    if (userBall == computerBall) {
      this.strikeCnt++;
    }
  }

  public void calculationBallCount() {
    for (Integer idx = 0; idx < userBalls.size(); idx++) {
      ball(idx);
    }
  }

  private void ball(int idx) {
    for (Integer index = 0; index < computerBalls.size(); index++) {
      compareBall(idx, index, userBalls.get(idx), computerBalls.get(index));

    }
  }

  private void compareBall(Integer idx, Integer index, Integer userBall, Integer computerBall) {
    if (idx != index && userBall == computerBall) {
      updateBall();
    }
  }

  private void updateBall() {
    this.ballCnt++;
  }



}
