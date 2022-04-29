package net.hankbot;

import io.micronaut.http.annotation.*;

@Controller("/helloMicronautOptions")
public class HelloMicronautOptionsController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}