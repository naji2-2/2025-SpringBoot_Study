package hs.kr.study.MyBatisPrj.Controllers;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import hs.kr.study.MyBatisPrj.MemoService;
import hs.kr.study.MyBatisPrj.MemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {

    @Autowired
    MemoService memoService;

    @GetMapping("/Memo")
    public String memo(Model model){
        List<MemoDTO> all = memoService.listAll();
        // data라는 이름의 박스에 all을 넣는다
        model.addAttribute("data", all);
        System.out.println("size : " + all.size());
        return "Memo";
    }

    @PostMapping("/Memo_input")
    public String memo_input(@ModelAttribute MemoDTO dto){
        memoService.insert(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable ("idx") int idx, Model model){
        System.out.println(idx);
        MemoDTO dto = memoService.selectOne(idx);
        // "one"이라는 박스에 dto(idx값)을 넣는다
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String update(MemoDTO dto){
        memoService.update(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/delete/{idx}")
    public String delete_form(@PathVariable ("idx") int idx, Model model){
        System.out.println(idx);
        memoService.delete(idx);
        return "redirect:/Memo";
    }

//    @PostMapping("/delete")
//    public String delete(MemoDTO dto){
//        memoService.delete(dto);
//        return "redirect:/Memo";
//    }

}
