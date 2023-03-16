package org.mollcol.service;

import org.mollcol.model.entity.user;
import org.springframework.stereotype.Service;



public interface userService  {
    user selectById(String id);
}
