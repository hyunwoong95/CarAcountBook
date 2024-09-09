package com.first.carAccountBook.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class UserVO {

    int USER_SEQ;
    String NAME;
    String NIC_NAME;
    String ID;
    String PASSWORD;
    String EMAIL;
    String CREATED;
    String UPDATED;
    String USER_DIV;

}
