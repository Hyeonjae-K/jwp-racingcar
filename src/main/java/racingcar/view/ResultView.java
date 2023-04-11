package racingcar.view;

import racingcar.domain.Car;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public static void printPositionOfCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.printf("%s : %s%n", car.getName(), "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public static void printStart() {
        System.out.println("실행 결과");
    }

    public static void printWinners(List<Car> winners) {
        List<String> winnerNames = winners.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
        System.out.printf("%s가 최종 우승했습니다.%n", String.join(", ", winnerNames));
    }
}
