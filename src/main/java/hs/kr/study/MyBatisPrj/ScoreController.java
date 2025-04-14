package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DTO.ScoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {

    @GetMapping("/Score")
    public String score(){
        return "Score_input";
    }

    @PostMapping("/Score_input")
    public String score_input(@ModelAttribute ScoreDTO dto, Model model){
        int sum = dto.getKor() + dto.getEng() + dto.getMath();
        double avg = (double)sum/3;
        String result  = "";

        result += "국어 : " + dto.getKor() + "</br>" + " 영어 : " + dto.getEng() + "</br>" + " 수학 : " + dto.getMath() + "</br>" + " 총점 : " + sum + "</br>" + " 평균 : " + avg;

        System.out.println("국어 : " + dto.getKor());
        System.out.println("영어 : " + dto.getEng());
        System.out.println("수학 : " + dto.getMath());
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        model.addAttribute("result", result);
        return "Score_result";
    }

}
