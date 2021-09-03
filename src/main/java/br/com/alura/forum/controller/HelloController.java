package br.com.alura.forum.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    //anotação RestController ao invés de Controller para não precisar usar o ResponseBody
public class HelloController {

    @RequestMapping("/")     //indica qual URL é para chamar
    //@ResponseBody            //para devolver a string direto para o navegador, ao invés de procurar uma página com o nome da string
    public String hello() {
        return "Hello World!";
    }
}
