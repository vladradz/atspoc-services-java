package com.itv.atspoc.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by neilmoor on 20/02/14.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping
    public String index() {
        return "index";
    }

}

