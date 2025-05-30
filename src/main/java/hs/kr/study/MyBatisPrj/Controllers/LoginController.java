package hs.kr.study.MyBatisPrj.Controllers;

import hs.kr.study.MyBatisPrj.DTO.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import static java.lang.Integer.parseInt;

@Controller
public class LoginController {

    @GetMapping("/Login")
    public String login(){
        return "Login_input";
    }

    @PostMapping("/Login_input")
    public String login_input(@ModelAttribute LoginDTO dto, Model model){
        String result = "wrong!";

        if(dto.getUser_id().equals("kim") && parseInt(dto.getUser_pw()) == 1234){
            result = "Welcome!";
        }

        System.out.println("아이디 : " + dto.getUser_id());
        System.out.println("비밀번호 : " + dto.getUser_pw());

        model.addAttribute("result", result);
        return "Login_result";
    }

}
