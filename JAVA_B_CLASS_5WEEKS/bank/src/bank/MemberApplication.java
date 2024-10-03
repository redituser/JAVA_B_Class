package bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberApplication implements MyMemberService {
    
    private Map<String, Member> members = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void regist(Member member) {
        members.put(member.getId(), member);
        System.out.println("결과: 회원이 등록되었습니다.");
    }

    @Override
    public void remove(String id) {
        if (members.remove(id) != null) {
            System.out.println("결과: 회원이 삭제되었습니다.");
        } else {
            System.out.println("해당 ID의 회원을 찾을 수 없습니다.");
        }
    }

    @Override
    public boolean login(String id, String password) {
        Member member = members.get(id);
        if (member != null && member.getPassword().equals(password)) {
            System.out.println("로그인 성공!");
            return true;
        }
        System.out.println("로그인 실패. ID 또는 비밀번호가 잘못되었습니다.");
        return false;
    }

    @Override
    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 하였습니다.");
    }

    @Override
    public void info(String id, String password) {
        Member member = members.get(id);
        if (member != null && member.getPassword().equals(password)) {
            System.out.println(member);
        } else {
            System.out.println("정보를 조회할 수 없습니다. ID 또는 비밀번호가 잘못되었습니다.");
        }
    }

    public void createMember() {
        System.out.println("ID :");
        String id = sc.nextLine();
        System.out.println("이름 :");
        String name = sc.nextLine();
        System.out.println("비밀번호 :");
        String password = sc.nextLine();
        
        Member newMember = new Member(id, name, password);
        regist(newMember);
    }

    public void showMemberList() {
        System.out.println("회원 목록");
        for (Member member : members.values()) {
            System.out.println(member.toString());
        }
    }
}