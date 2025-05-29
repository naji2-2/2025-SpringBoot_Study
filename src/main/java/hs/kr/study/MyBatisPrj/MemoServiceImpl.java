package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DAO.MemoDAO;
import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoDAO dao;

    @Override
    public void insert(MemoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public void update(MemoDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }

    @Override
    public List<MemoDTO> listAll() {
        return dao.listAll();
    }

    @Override
    public MemoDTO selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
