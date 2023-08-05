package sky.demo.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.demo.domain.Member;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository
     r = new MemoryMemberRepository();

    // 테스트 한 번마다 클리어해줘야 함
    @AfterEach
    public void afterEach(){
        r.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");
        r.save(member);
        Member result = r.findById(member.getId()).get();

        // 방법 1
        Assertions.assertEquals(result, member);
        // 방법2
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        r.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        r.save(member2);

        Member result = r.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member m1 = new Member();
        m1.setName("spring1");
        r.save(m1);

        Member m2 = new Member();
        m2.setName("spring2");
        r.save(m2);

        List<Member> result = r.findAll();
        assertThat(result.size()).isEqualTo(2);
    }
}
