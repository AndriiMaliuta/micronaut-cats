package com.anma.controllers;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.Map;

@Controller
public class HomeController {

    @View("home")
    @Get("/")
    public HttpResponse<Map> getIndex() {

        return HttpResponse.ok(CollectionUtils.mapOf("name", "Vasyl", "age", 34));
    }
}
