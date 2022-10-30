/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.a.takehome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */
@Controller
public class mycontroller {
    
    @RequestMapping("/nextpage")
    @ResponseBody
    public String Tugas(
            
            @RequestParam(value="varA") String nama,
            @RequestParam(value="varB") String alamat,
            @RequestParam(value="varC") String gambar){
      
        
    
            return  "index";
    
    }
    
    
    
    public String next(
    @RequestParam (value = "varA") String nama,
            @RequestParam(value="varB") String alamat,
            @RequestParam(value="varC") String gambar,
            Model kurir){
    
    
    kurir.addAttribute("paket1", nama);
    {
                
}
