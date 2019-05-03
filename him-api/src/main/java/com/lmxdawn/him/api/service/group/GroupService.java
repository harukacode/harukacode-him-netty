package com.lmxdawn.him.api.service.group;

import com.lmxdawn.him.api.res.GroupInfoListResponse;
import com.lmxdawn.him.common.entity.group.Group;

import java.util.List;

public interface GroupService {

    Group findByGroupId(Long groupId);

    List<GroupInfoListResponse> listByGroupIdIn(List<Long> groupIds);

    boolean insertGroup(Group group);

    boolean updateGroup(Group group);

    boolean deleteByGroupId(Long groupId);

}