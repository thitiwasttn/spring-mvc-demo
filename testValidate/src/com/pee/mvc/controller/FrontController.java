package com.pee.mvc.controller;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class FrontController {
//    Logger logger = Logger.getLogger(FrontController.class);

    private static Logger logger = Logger.getLogger(FrontController.class);
    public void initc() {
        setLog();
        System.out.println("========= FrontController ========");
        logger.debug("============================================================================ Ready!!! ============================================================================");
        logger.debug("============================================================================ Ready!!! ============================================================================");
        logger.debug("============================================================================ Ready!!! ============================================================================");
        logger.debug("============================================================================ Ready!!! ============================================================================");
        logger.debug("============================================================================ Ready!!! ============================================================================");

    }

    void setLog() {
        PropertyConfigurator.configure("C:\\logJar\\log4j.properties");
    }
    private void destroy()
    {
        logger.debug("============================================================================ Down!!! ============================================================================");
        logger.debug("============================================================================ Down!!! ============================================================================");
        logger.debug("============================================================================ Down!!! ============================================================================");
        logger.debug("============================================================================ Down!!! ============================================================================");

    }
}
