package hs.kr.study.MyBatisPrj.Controllers;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import hs.kr.study.MyBatisPrj.DTO.UserDTO;
import hs.kr.study.MyBatisPrj.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    UserService userService;

    @GetMapping("/Join")
    public String join() {
        return "Join_input";
    }

    @PostMapping("/Join_input")
    public String Join_input(@ModelAttribute UserDTO dto, Model model) {
        System.out.println("dto : " + dto);
        userService.insert(dto);
        String result = "회원가입이 완료되었습니다.";

        model.addAttribute("result", result);
        return "Join_result";
    }
}
