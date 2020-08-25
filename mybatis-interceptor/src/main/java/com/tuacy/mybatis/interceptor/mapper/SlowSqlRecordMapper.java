package com.tuacy.mybatis.interceptor.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tuacy.mybatis.interceptor.entity.param.SqlParam;

/**
 * sql 日志管理
 * @author Administrator
 *
 */
@Repository
public interface SlowSqlRecordMapper {

    long insertSqlRecord(@Param("param") SqlParam param);
}
