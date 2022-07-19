package org.epam.nahorniak.simpleapp.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "Greeting Api")
@RequestMapping("/api/v1/time")
public interface CurrentDateTimeApi {

    @GetMapping
    @ApiOperation(value = "Say current time")
    @ApiResponse(code = 200, message = "OK", response = String.class)
    String sayTime();
}
