package com.example.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by HP on 2018/5/4.
 */
@ControllerAdvice(basePackages = {"com.example.demo.controller.*"})
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdvice() {

        super("callback","jsonp");
    }
}
