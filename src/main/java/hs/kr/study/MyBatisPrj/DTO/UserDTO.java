package hs.kr.study.MyBatisPrj.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDTO {

    private int id;
    private String User_name;
    private String User_pw;
    private LocalDateTime Join_date;

}
