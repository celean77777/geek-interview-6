package springwebapp.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //GET http://localhost:8189/app/hello
    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "Hello world!";
    }
    //GET http://localhost:8189/app/echo?word1=Hello&word2=World
    @GetMapping(value = "/echo", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String getEcho (@RequestParam(name = "word1", defaultValue = "..") String word1,
                           @RequestParam(name = "word2", defaultValue = "..") String word2){
        return "Эхо: " + word1 + " " + word2;
    }

    //Можно еще стрвницу вернуть, но это. как я понимаю, тема уже следующего урока

}
