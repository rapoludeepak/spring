package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by deepak on 11/29/16.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        /*ApplicationContext ctx =*/ SpringApplication.run(Application.class,args);
        System.out.print("inspect : ");

        /*String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames){
            System.out.print(beanName+'\n');
        }*/
    }
}
