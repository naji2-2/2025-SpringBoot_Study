package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DAO.UserDAO;
import hs.kr.study.MyBatisPrj.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO dao;

    @Override
    public void insert(UserDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void select(int id) {
        dao.select(id);
    }

}
