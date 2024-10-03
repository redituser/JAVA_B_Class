package bank;

public interface MyMemberService {
    public void regist(Member member);
    public void remove(String id);
    public boolean login(String id, String password);
    public void logout(String id);
    public void info(String id, String password);
}