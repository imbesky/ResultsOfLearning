package sky.demo.service;

import sky.demo.domain.Member;
import sky.demo.repository.MemberRepository;
import sky.demo.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public Long join(Member member){
        validateDuplicateMember(member);//중복 회원 검증
        memberRepository.save(member);
         return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m->{throw new IllegalStateException("기존재회원");
 });
    }
    public List<Member> findMembers(){
        //전체 회원 조회
        return memberRepository.findAll();
    }
    public Optional<Member> findeOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
