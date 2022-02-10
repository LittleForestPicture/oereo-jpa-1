package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTestRepositoryTest {

    @Autowired
    MemberTestRepository memberTestRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        MemberTest memberTest = new MemberTest();
        memberTest.setUsername("memberA");

        //when
        Long saveId = memberTestRepository.save(memberTest);
        MemberTest findMemberTest = memberTestRepository.find(saveId);

        //then
        Assertions.assertThat(findMemberTest.getId()).isEqualTo(memberTest.getId());
        Assertions.assertThat(findMemberTest.getUsername()).isEqualTo(memberTest.getUsername());
        Assertions.assertThat(findMemberTest).isEqualTo(memberTest);
        System.out.println("findMember === member = " + (findMemberTest == memberTest));

    }

}