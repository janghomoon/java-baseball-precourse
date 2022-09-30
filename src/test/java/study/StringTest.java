package study;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

  @Test
  @DisplayName("요구사항 1 - 1,2  ,로 split 분리 테스트")
  void arraySplitTest() {

    String[] values = "1,2".split(",");
    assertThat(values).contains("1", "2");
    assertThat(values).containsExactly("1", "2");
  }


  @Test
  @DisplayName("요구사항 1 - 1  ,로 split 분리 테스트")
  void StringSplitTest() {

    String[] values = "1".split(",");
    assertThat(values).contains("1");
    assertThat(values).containsExactly("1");
  }


}
