package com.mars.rover.controller;

import com.mars.rover.service.MarsRoverService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("mars-rover")
@RequiredArgsConstructor
public class MarsRoverController {
    private final MarsRoverService marsRoverService;

    @PostMapping("/solutions")
    public MarsRoverResponse solution(@RequestBody @Validated MarsRoverRequest request) {
        val position = marsRoverService.process(request.toGrid(), request.toPosition(), request.getInstructions());
        return MarsRoverResponse.fromPositionResponse(position);
    }
}
