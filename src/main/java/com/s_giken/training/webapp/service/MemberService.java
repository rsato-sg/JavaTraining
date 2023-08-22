package com.s_giken.training.webapp.service;

import java.util.List;
import java.util.Optional;
import com.s_giken.training.webapp.model.Member;
import com.s_giken.training.webapp.model.MemberSearchCondition;

public interface MemberService {
    public List<Member> findAll();

    public Optional<Member> findById(int memberId);

    public List<Member> findByConditions(MemberSearchCondition memberSearchCondition);

    public void save(Member member);

    public void deleteById(int memberId);
}
