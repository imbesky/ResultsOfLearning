package sky.demo.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sky.demo.domain.Member;
import sky.demo.repository.MemoryMemberRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();
    MemoryMemberRepository memberRepository;
    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }
    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("spring");
        //when
        Long saveId = memberService.join(member);
        //then
        Member findMember = memberService.findeOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void duplicateError(){
        //given
        Member m1=new Member();
        m1.setName("name");
        Member m2 = new Member();
        m2.setName("name");
        //when
        memberService.join(m1);
        //방법 1
        try {
            memberService.join(m2);
            fail();
        } catch (IllegalAccessError e) {
        assertThat(e.getMessage()).isEqualTo("기존재회원");
        }
        // 방법 2
IllegalStateException e = assertThrows(IllegalStateException.class, ()->memberService.join(m2));
        assertThat(e.getMessage()).isEqualTo("기존재회원");
        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findeOne() {
    }
}
