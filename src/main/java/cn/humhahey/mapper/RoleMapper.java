package cn.humhahey.mapper;

import cn.humhahey.POJO.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    public Role getRole(@Param("id") Long id);

    public int insertRole(Role role);

    public int deleteRole(Long id);

    public int updateRole(Role role);
}
