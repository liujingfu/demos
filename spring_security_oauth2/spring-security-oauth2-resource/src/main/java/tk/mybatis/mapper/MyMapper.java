package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * description
 *
 * @author ljf 2019/09/24 20:28
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}