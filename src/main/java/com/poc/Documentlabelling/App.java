package com.poc.Documentlabelling;
import org.springframework.http.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@SpringBootApplication

public class App
{
    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "Go to <a href='/getFiles'>/getFiles</a>";
    }
    static public void main(String[] args) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}