package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemoController {

    @GetMapping("/Memo")
    public String memo(){
        return "Memo";
    }

    @PostMapping("/Memo_input")
    public String memo_input(@ModelAttribute MemoDTO dto, Model model){

        System.out.println(dto.getWriter());
        System.out.println(dto.getMemo());

        return "Memo";
    }
}
