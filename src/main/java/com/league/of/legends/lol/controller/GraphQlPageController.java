package com.league.of.legends.lol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GraphQlPageController {
    @RequestMapping("/")
    public String forward() {
        return "forward:/graphiql/index.html";
    }
}
