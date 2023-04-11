package racingcar.view;

import java.util.Scanner;
import racingcar.utils.Validator;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] getCarNames() {
        String input = getInput("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return splitNames(input);
    }

    public static int getTryCount() {
        String input = getInput("시도할 횟수는 몇회인가요?");
        return parseTryCount(input);
    }

    private static String getInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static String[] splitNames(String input) {
        String[] names = input.split(",");
        Validator.checkDuplication(names);
        Validator.checkEmpty(names);
        return names;
    }

    private static int parseTryCount(String input) {
        try {
            int tryCount = Integer.parseInt(input);
            Validator.checkRange(tryCount);
            return tryCount;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("[ERROR] : 시도 횟수는 숫자만 입력이 가능합니다.");
        }
    }
}
