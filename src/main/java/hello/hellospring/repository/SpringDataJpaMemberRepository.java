package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPOL select m from Member m where m.name =?
    //jpa에서 공통으로 배부분 제공되지만 name(->username, 상품이름, 주문서번호) 비지니스가 다 달라서 공통으로 제공불가라서 적어줌
    //인터페이스 이름만으로 개발 끝!
    Optional<Member> findByName(String name);

}