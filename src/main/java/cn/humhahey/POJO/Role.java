package cn.humhahey.POJO;

import cn.humhahey.enums.Sex;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Role {
    private Long id;
    private String roleName;
    private String note;
    private Sex sex;
    private RoleCard roleCard;
    private List<Account> accounts;

}
