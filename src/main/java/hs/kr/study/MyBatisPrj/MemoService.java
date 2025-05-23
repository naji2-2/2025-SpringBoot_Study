package hs.kr.study.MyBatisPrj;

import hs.kr.study.MyBatisPrj.DTO.MemoDTO;
import java.util.List;

public interface MemoService {
    // croud    삽입, 조회, 수정, 삭재
    // 삽입, 수정, 삭제는 return 값이 없으므로 void로 하면 됨

    // 1. insert
    public void insert(MemoDTO dto);

    // 2. update
    public void update(MemoDTO dto);

    // 3. delete
    public void delete(int idx);

    // 4. select
    public List<MemoDTO> listAll();

    MemoDTO selectOne(int idx);
}
