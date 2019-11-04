package cn.humhahey.mapper;

import cn.humhahey.POJO.Account;

public interface AccountMapper {
    public Account findAccountsByRoleId(Long roleId);
}
