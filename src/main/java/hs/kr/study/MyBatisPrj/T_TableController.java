package hs.kr.study.MyBatisPrj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class T_TableController {
    @GetMapping("/T_Table")
    public String ttable(){
        return "table_input";
    }

    @PostMapping("/table_input")
    public String ttable_result(@RequestParam ("data1") int n, Model model){

        String result = "";

        for(int i=1; i<=9; i++){
            result += n + " * " + i + " = " + n*i + "</br>";
            System.out.println(n + " * " + i + " = " + n*i);
        }
        model.addAttribute("result", result);
        return "table_result";
    }

}
