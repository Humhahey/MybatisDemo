package cn.humhahey.DAO;

import lombok.Getter;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;

@Getter
@Setter
public class BaseDAOImpl {
    private SqlSessionTemplate sqlSessionTemplate = null;
}
