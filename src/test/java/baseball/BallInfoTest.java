package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.domain.BallInfo;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallInfoTest {

  private BallInfo ballInfo;

  @BeforeEach
  void setUp() {
    ballInfo = new BallInfo(Arrays.asList(1, 2, 3), Arrays.asList(5, 1, 3)); //내 입력 값, 컴퓨터 입력 값
  }

  @Test
  @DisplayName("볼정보 입력후 스트라이크 판독 ")
  void strikeCount() {

    ballInfo.calculationStrikeCount();
    assertThat(1).isEqualTo(ballInfo.getStrikeCnt());

  }

  @Test
  @DisplayName("볼정보 입력후 볼 판독 ")
  void ballCount() {

    ballInfo.calculationBallCount();
    assertThat(1).isEqualTo(ballInfo.getBallCnt());
  }

}
