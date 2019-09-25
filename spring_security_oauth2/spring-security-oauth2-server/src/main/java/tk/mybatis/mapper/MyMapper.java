package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * description
 *自己的 Mapper
 *  * 特别注意，该接口不能被扫描到，否则会出错
 *  * <p>Title: MyMapper</p>
 *  * <p>Description: </p>
 * @author ljf 2019/09/24 10:10
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
