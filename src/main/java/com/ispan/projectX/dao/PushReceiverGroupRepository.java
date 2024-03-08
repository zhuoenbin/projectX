package com.ispan.projectX.dao;

import com.ispan.projectX.entity.pushmsg.PushReceiverGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PushReceiverGroupRepository extends JpaRepository<PushReceiverGroup, Integer> {

    PushReceiverGroup findByGroupId(Integer groupId);

}
