package cn.humhahey;

import cn.humhahey.POJO.Role;
import cn.humhahey.enums.Sex;
import cn.humhahey.mapper.RoleMapper;
import cn.humhahey.utils.SqlSessionFactoryUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.session.SqlSession;

@Log4j2
public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("testName");
            role.setNote("testNote");
            role.setSex(Sex.MALE);
            Role r=roleMapper.getRole(2L);
//            roleMapper.insertRole(role);
            sqlSession.commit();
            System.out.println(r.getAccounts());
        } catch (Exception e) {
            log.error(e);
            sqlSession.rollback();
        }finally {
            sqlSession.close();
        }


    }
}
