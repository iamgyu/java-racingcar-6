package racingcar.View;

public class OutputView {
    public static final String NAME_LENGTH_OVER = "이름의 길이가 초과되었습니다.";
    public static final String NAME_HAS_ANOTHER_CHARACTER = "이름에 다른 문자가 포함되어 있습니다.";

    public static void printResult() {
        System.out.println("실행 결과");
    }

    public static void printWinner() {
        System.out.print("최종 우승자 : ");
    }
}
