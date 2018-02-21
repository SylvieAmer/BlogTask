package testtask;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class TestTask {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
        /*Blog postsList = new Blog();
        postsList.addPost("Это первый пост в блоге");
        postsList.addPost("Это второй пост в блоге");
        postsList.addPost("Это третий пост в блоге");
        
        System.out.println("Текст поста: " + postsList.getPostTextById(1));
        System.out.println("Текст поста: " + postsList.getPostTextById(2));
        System.out.println("Текст поста: " + postsList.getPostTextById(3));
        System.out.println("Список айди постов " + Arrays.toString(postsList.getPostsList()));*/ //тест методов класса Blog
    }
