import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(bean2));

        Cat baron1 = (Cat) applicationContext.getBean("Baron");
        System.out.println(baron1.getAge());
        Cat baron2 = (Cat) applicationContext.getBean("Baron");
        System.out.println(baron1.equals(baron2));
    }
}