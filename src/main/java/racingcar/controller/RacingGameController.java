package racingcar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import racingcar.dto.GameInputDto;
import racingcar.dto.GameResultDto;
import racingcar.service.GameService;

@RestController
public class RacingGameController {

    private final GameService gameService;

    @Autowired
    public RacingGameController(final GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping(path = "/plays", consumes = "application/json")
    public GameResultDto play(@RequestBody final GameInputDto gameInputDto) {
        return gameService.playGame(gameInputDto);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handle(final IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
