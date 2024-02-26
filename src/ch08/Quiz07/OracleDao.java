package ch08.Quiz07;

public class OracleDao implements DataAccessObject {
    String ORACLE_DB_STR = "Oracle DB";

    @Override
    public void select() {
        System.out.println(ORACLE_DB_STR + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(ORACLE_DB_STR + "에 삽입");
    }

    @Override
    public void update() {
        System.out.println(ORACLE_DB_STR + "를 수정");
    }

    @Override
    public void delete() {
        System.out.println(ORACLE_DB_STR + "에서 삭제");
    }
}
