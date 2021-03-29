package softuniBlog.controller;

import org.springframework.web.bind.annotation.RequestMethod;

public @interface RequesMapping {
    String value();

    RequestMethod method();
}
