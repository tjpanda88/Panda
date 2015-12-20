package org.panda.fw.blank.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MenuController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init() {
        return "sample/sampleForm";
    }
}
