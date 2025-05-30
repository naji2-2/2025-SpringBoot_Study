package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DTO.UserDTO;

public interface UserService {

    public void insert(UserDTO dto);

    public void select(int id);

}
