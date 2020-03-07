package com.pee.mvc.controller;

import com.pee.mvc.model.CustomerM;
import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static Logger logger = Logger.getLogger(CustomerController.class);

    public CustomerController() {
        logger.debug("====================== CustomerController =======================");
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new CustomerM());
        logger.debug("customer show form !!!");
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") CustomerM customerM,
                              BindingResult bindingResult) {
        logger.debug("customer == >>" + customerM.toString());
//        model.addAttribute("customer",customerM);
        logger.debug("bindingResult has error " + bindingResult.hasErrors());
        logger.debug("last name start with " + customerM.getLastName().startsWith("LM"));
        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-process";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        logger.debug("============= CustomerController  initBinder ================");
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

}
