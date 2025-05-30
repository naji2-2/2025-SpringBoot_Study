package hs.kr.study.MyBatisPrj.DAO;

import hs.kr.study.MyBatisPrj.DTO.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {

    public void insert(UserDTO dto);

    public void select(int dto);
}
