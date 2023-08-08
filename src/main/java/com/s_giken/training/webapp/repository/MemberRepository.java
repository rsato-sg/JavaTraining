package com.s_giken.training.webapp.repository;

import java.util.List;

//import org.antlr.v4.runtime.atn.SemanticContext.AND;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.s_giken.training.webapp.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    // SprintBootでは、予め用意されているのリポジトリアクセス用のメソッド以外のメソッドを
    // 定義するときに、特殊な命名ルールがあります。詳細は以下の参考先URLを確認して下さい。
    // https://docs.spring.io/spring-data/jpa/docs/1.11.1.RELEASE/reference/html/#jpa.query-methods

    public List<Member> findByNameLikeAndMailLike(String name, String mail);
    // 上をSQL文で書くとこうなる
    // @Query("SELECT * FROM T_Member WHERE namelike %
    // +memberSearchCondition.getName()+ % AND maillike %
    // +memberSearchCondition.getMail()+ %")

    // @Query("SELECT * FROM T_Member WHERE maillike '%' +mail+ '%' ")
    // public List<Member> findByMailLike(String mail);

    // 予め用意されているメソッド
    // <S extends T> S save(S entity);
    // T findOne(ID primaryKey);
    // Iterable<T> findAll();
    // Long count();
    // void delete(T entity);
    // boolean exists(ID primaryKey);

}
