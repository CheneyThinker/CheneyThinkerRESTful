package com.cheney.thinker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheneyThinkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheneyThinkerApplication.class, args);
        StringBuffer buffer = new StringBuffer();
        buffer.append("-------------------------------------------------").append("\n");
        buffer.append("|                                               |").append("\n");
        buffer.append("|                                               |").append("\n");
        buffer.append("|      CheneyThinkerApplication is Running!     |").append("\n");
        buffer.append("|                                               |").append("\n");
        buffer.append("|                                               |").append("\n");
        buffer.append("-------------------------------------------------").append("\n");
        System.err.println(buffer.toString());
    }

}
