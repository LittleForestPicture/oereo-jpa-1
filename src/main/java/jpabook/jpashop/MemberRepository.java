package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);
        return member.getId();
        // return 값을 원래 안 만듬 save method 특성 상 커맨드 특성이기 때문에 side effect 가 있을 수 있음.
        // 보통 id 가 있으면 다음에 조회를 할 수 있기 때문
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
