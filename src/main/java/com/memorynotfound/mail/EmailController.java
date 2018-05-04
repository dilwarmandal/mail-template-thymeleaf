package com.memorynotfound.mail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmailController {

    @RequestMapping(value = {"/email"}, method = RequestMethod.GET)
    public String getEmailPage() {
        return "email";
    }

}
