package cn.humhahey.POJO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
    private Long id;
    private String username;
    private String password;
    private Long roleId;
}
