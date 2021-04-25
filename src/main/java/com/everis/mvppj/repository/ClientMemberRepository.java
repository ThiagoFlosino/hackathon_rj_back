package com.everis.mvppj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.mvppj.model.ClientMember;
import com.everis.mvppj.model.Squad;

public interface ClientMemberRepository extends JpaRepository<ClientMember, Long> {


}
