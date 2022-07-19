package org.epam.nahorniak.simpleapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.epam.nahorniak.simpleapp.api.CurrentDateTimeApi;
import org.epam.nahorniak.simpleapp.configuration.util.DateTimeUtils;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CurrentDateTimeController implements CurrentDateTimeApi {

    @Override
    public String sayTime() {

        String dateTime = DateTimeUtils.getCurrentDateTime();

        log.info("sayTime: current time {}.",dateTime);

        return String.format("Current time - %s .",dateTime);
    }
}
