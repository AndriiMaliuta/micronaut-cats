package com.anma.rest;

import com.anma.models.Cat;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Arrays;
import java.util.List;

@Controller
public class CatControler {


    @Get(value = "/rest/api/v1/cats", produces = MediaType.APPLICATION_JSON)
    public HttpResponse<List<Cat>> getCats() {

        List<Cat> cats = Arrays.asList(new Cat("Murko", 6), new Cat("Liza", 9));

        return HttpResponse.ok(cats);
    }
}
