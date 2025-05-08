package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {

    @Autowired MemoService memoService;

    @GetMapping("/Memo")
    public String memo(){
        return "Memo";
    }

    @PostMapping("/Memo_input")
    public String memo_input(@ModelAttribute MemoDTO dto, Model model){

        System.out.println(dto.getWriter());
        System.out.println(dto.getMemo());
        memoService.insert(dto);

        return "Memo";
    }

    @GetMapping("/Memo/list")
    public String listAll(Model model) {
        List<MemoDTO> all = memoService.listAll();
        // data라는 이름의 박스에 all을 넣는다
        model.addAttribute("data", all);
        System.out.println("size : " + all.size());
        return "MemoList";
    }
}
