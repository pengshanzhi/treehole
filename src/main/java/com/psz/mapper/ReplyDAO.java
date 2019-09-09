package com.psz.mapper;

import com.psz.treehole.Reply;
import com.psz.treehole.TzKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ReplyDAO继承基类
 */

@Mapper
@Repository
public interface ReplyDAO extends MyBatisBaseDao<Reply, Integer> {
	List<Reply> selectByPageNo(TzKey id);
	int insertSelective(Reply record);
}