package dev.nathanlively.hello_native;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@ImportRuntimeHints(HintsRegistrar.class)
@SpringBootApplication
public class HelloNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloNativeApplication.class, args);
    }

}
