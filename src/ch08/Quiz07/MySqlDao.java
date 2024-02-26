package ch08.Quiz07;

public class MySqlDao implements DataAccessObject {
    String MYSQL_DB_STR = "MySql DB";

    @Override
    public void select() {
        System.out.println(MYSQL_DB_STR + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(MYSQL_DB_STR + "에 삽입");
    }

    @Override
    public void update() {
        System.out.println(MYSQL_DB_STR + "를 수정");
    }

    @Override
    public void delete() {
        System.out.println(MYSQL_DB_STR + "에서 삭제");
    }
}
