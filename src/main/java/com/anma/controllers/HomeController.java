package com.anma.controllers;

import com.anma.models.Cat;
import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @View("home")
    @Get("/")
    public HttpResponse<Map> getIndex() {

        Map<String, Object> map = new HashMap<>();
        map.put("cat", new Cat("Murko", 6));

//        return HttpResponse.ok(CollectionUtils.mapOf("name", "Vasyl", "age", 34));
        return HttpResponse.ok(map);
    }
}
