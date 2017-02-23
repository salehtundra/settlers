package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import play.mvc.*;

import views.html.*;

import status.StatusCode;

@Component
public class Application extends Controller {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public Result index() {
        log.trace("Entering function application.index()");

        return ok(index.render("Hello World"));
    }
}
