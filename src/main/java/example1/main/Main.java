package example1.main;

import example1.config.AppConfig;
import example1.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)){
            HelloService service = context.getBean(HelloService.class);
           String result = service.sayHello("Yehia ");
            System.out.println(result);

        }

    }
}
