package org.mollcol.mapper;

import org.apache.ibatis.annotations.Param;
import org.mollcol.model.entity.user;


public interface userMapper {
    user selectById(@Param("userID") String user);
}
