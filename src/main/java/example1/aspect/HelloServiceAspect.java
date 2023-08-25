package example1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {
//    @Before("execution(* service.HelloService.sayHello(..))")
//    public void before()
//    {
//        System.out.println("A");
//    }
//    @After("execution(* service.HelloService.sayHello(..))")
//    public void after()
//    {
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* service.HelloService.sayHello(..))")
//    public void afterReturning()
//    {
//        System.out.println("C");
//    }
@Around("execution(* example1.service.HelloService.sayHello(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){

    System.out.println("Something else !!");
    return "Hello From Other Side";
    }
}
