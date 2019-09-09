package com.psz.mapper;

import com.psz.treehole.Tz;
import com.psz.treehole.TzKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TzDAO继承基类
 */
@Mapper
@Repository
public interface TzDAO extends MyBatisBaseDao<Tz, TzKey> {


	Tz selectByPrimaryKey(TzKey id);
	List<Tz> selectByPage(Integer tpage);
	


}