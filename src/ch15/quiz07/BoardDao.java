package ch15.quiz07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    List<Board> boardList = new ArrayList();

    public List<Board> getBoardList() {
        for (int i = 1; i <= 3; i++) {
            boardList.add(new Board("제목" + i, "내용" + i));
        }
        return boardList;
    }
}
