package org.mollcol.model.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class user {
    @TableId("user_id")
    private String userID;
    @TableId("user_name")
    private String userName;
    @TableId("user_gender")
    private String userGender;
    @TableId("user_contact")
    private String userContact;


}
