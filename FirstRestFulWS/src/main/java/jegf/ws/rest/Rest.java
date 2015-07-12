package jegf.ws.rest;

import jegf.ws.model.Model;
import jegf.ws.logic.LogicOfWs;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Rest {    
    @Autowired
    private LogicOfWs logica;
    
    
    @RequestMapping("/probando")
    public Model model(@RequestParam(value="name",defaultValue = "Perrita") String name, @RequestParam(value="lastName",defaultValue = "Callejera") String lastName){
        return logica.retornoDeLogica(name, lastName);
    }
    
    
}
