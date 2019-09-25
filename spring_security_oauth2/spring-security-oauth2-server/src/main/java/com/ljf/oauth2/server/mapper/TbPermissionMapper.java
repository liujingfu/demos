package com.ljf.oauth2.server.mapper;

import com.ljf.oauth2.server.domin.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;


/**
 * description
 *
 * @author ljf 2019/09/24 11:03
 */
public interface TbPermissionMapper  extends MyMapper<TbPermission> {
  List<TbPermission> selectByUserId(@Param("userid")Long userid );
}
