/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.desdeNB;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Sergio Armando
 */
@Controller
public class ControladorInicio {
    @GetMapping ("/")
    public String inicio (Model model) {
        var msg= "prueba de mi primer pagina";
        
        var persona = new Persona();
        persona.setNombre("Sergio");
        persona.setEnero ("444");
        persona.setFebrero("125");
        persona.setMarzo("331");
        persona.setTotal("337");
        persona.setPromedio("112");
        
       
        var persona2= new Persona ();
        persona2.setNombre("Armando");
        persona2.setEnero("100");
        persona2.setFebrero("200");
        persona2.setMarzo("150");
        persona2.setTotal("450");
        persona2.setPromedio("150");
       
        var persona3= new Persona ();
        persona3.setNombre("Carlos");
        persona3.setEnero("30");
        persona3.setFebrero("100");
        persona3.setMarzo("70");
        persona3.setTotal("200");
        persona3.setPromedio("66");
        
         var persona4= new Persona ();
        persona4.setNombre("Emanuel");
        persona4.setEnero("150");
        persona4.setFebrero("70");
        persona4.setMarzo("200");
        persona4.setTotal("200");
        persona4.setPromedio("100");
        
         var persona5= new Persona ();
        persona5.setNombre("Jose");
        persona5.setEnero("140");
        persona5.setFebrero("10");
        persona5.setMarzo("40");
        persona5.setTotal("150");
        persona5.setPromedio("32");
        
        
        var personas = Arrays.asList(persona,persona2,persona3,persona4,persona5);
        
       
        model.addAttribute("personas",personas);
        model.addAttribute("msg",msg);
        
        return "index";
    }
    @GetMapping("/dirección")
    public String dire () {
        return "Segunda pagina";
    }
}
