import conf.AppConf;
import conf.DataConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import play.*;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;
import play.libs.F.Promise;
import views.html.pageNotFound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Global extends GlobalSettings {
	
    private ApplicationContext context;
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    @Override
    public void onStart(final Application app) {
    	log.info("APP Start");
        context = new AnnotationConfigApplicationContext(AppConf.class, DataConf.class);
    }
    
    @Override
    public void onStop(Application app) {
    	 log.info("APP Stop");
    }
    
    @Override
    public <A> A getControllerInstance(Class<A> clazz) {
        return context.getBean(clazz);
    }

    @Override
    public Promise<Result> onHandlerNotFound(RequestHeader request) {
    	return Promise.<Result>pure(Results.notFound(pageNotFound.render(request.path())));
    }

}
