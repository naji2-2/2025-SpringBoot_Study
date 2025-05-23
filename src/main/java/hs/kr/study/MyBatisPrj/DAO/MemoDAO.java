package hs.kr.study.MyBatisPrj.DAO;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import hs.kr.study.MyBatisPrj.MemoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface MemoDAO {

    // 1. insert
    public void insert(MemoDTO dto);

    // 2. update
    public void update(MemoDTO dto);

    // 3. delete
    public void delete(int idx);

    // 4. select
    public List<MemoDTO> listAll();

    public MemoDTO selectOne(int idx);
}
