package cn.humhahey.typeHandler;

import cn.humhahey.enums.Sex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({Sex.class})
@MappedJdbcTypes({JdbcType.VARCHAR})
public class SexEnumTypeHandler implements TypeHandler<Sex> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Sex sex, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,sex.getName());
    }

    @Override
    public Sex getResult(ResultSet resultSet, String s) throws SQLException {
        return Sex.getSex(resultSet.getString(s));
    }

    @Override
    public Sex getResult(ResultSet resultSet, int i) throws SQLException {
        return Sex.getSex(resultSet.getString(i));
    }

    @Override
    public Sex getResult(CallableStatement callableStatement, int i) throws SQLException {
        return Sex.getSex(callableStatement.getString(i));
    }
}
