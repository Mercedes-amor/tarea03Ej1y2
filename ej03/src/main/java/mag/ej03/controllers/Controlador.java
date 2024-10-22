package mag.ej03.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class Controlador {

    @GetMapping("/")
  
    public String showHome(Model model){
        model.addAttribute("year", LocalDate.now().getYear());

        return "indexView"; //Nuestra página Home
    }

    
    @GetMapping("/biografia")
  
    public String showBiografia(Model model){

        ArrayList<String> discografia = new ArrayList<>(Arrays.asList("Space Oddity", "Let's Dance", "The Man Who Sold the Word", "Heroes", "The Rise and Fall of Ziggy","Aladdin Sane"));
        model.addAttribute("discos",discografia);
        return "biografiaView"; //pagina biografía
    }

        
    // @GetMapping("/enlaces")
  
    // public String showEnlaces(){

    //     return "enlaces-externosView"; //pagina enlaces
    // }

        
    @GetMapping("/galeria")
  
    public String showGaleria(){

        return "galeria-fotosView"; //pagina galería
    }
}
