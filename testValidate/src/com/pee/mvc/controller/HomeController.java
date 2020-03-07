package com.pee.mvc.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    Logger logger = Logger.getLogger(HomeController.class);

    public HomeController() {
        logger.debug("============================= HomeController =======================");
    }

    @RequestMapping("/")
    public String showMainMenu()
    {
        return "main-menu";
    }


}
