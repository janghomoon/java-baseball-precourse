package baseball.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.platform.commons.util.StringUtils;

public class ParserUtil {


  public static List<Integer> StringToIntegerList(String value) {
    List<Integer> returnList = new ArrayList<>();
    //빈값 체크
    //중복체크
    if (StringUtils.isBlank(value)) {
      throw new IllegalArgumentException();
    }


    if (!ValidationUtil.isLength(value)) {
      throw new IllegalArgumentException();
    }

    for(int i = 0; i < value.length(); i++) {

      returnList.add(Character.getNumericValue(value.charAt(i)));
    }

    //숫자만 체크
    if (!ValidationUtil.isDuplication(returnList)) {
      throw new IllegalArgumentException();
    }
    return returnList;
  }

}
