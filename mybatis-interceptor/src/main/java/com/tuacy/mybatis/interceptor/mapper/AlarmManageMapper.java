package com.tuacy.mybatis.interceptor.mapper;

import com.tuacy.mybatis.interceptor.entity.param.AlarmInfoInsetParam;
import com.tuacy.mybatis.interceptor.entity.vo.AlarmInfoVo;
import com.tuacy.mybatis.interceptor.interceptor.tableshard.TableShardAnnotation;
import com.tuacy.mybatis.interceptor.interceptor.tableshard.strategy.DayTableShardStrategy;
import com.tuacy.mybatis.interceptor.interceptor.tableshard.strategy.MonthTableShardStrategy;
import com.tuacy.mybatis.interceptor.interceptor.tableshard.strategy.YearTableShardStrategy;
import com.tuacy.mybatis.interceptor.strategy.AlarmTableShardStrategy;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 告警管理mapper
 */
@Repository
public interface AlarmManageMapper {

    @TableShardAnnotation(tableName = "tablealarmevent", shadeStrategy = AlarmTableShardStrategy.class, shardParamKey = "occurTime")
    long insertAlarm(@Param("param") AlarmInfoInsetParam param, @Param("occurTime") String occurTIme);
    
    /**
     * 按照年策略进行查询
     * @return
     */
    @TableShardAnnotation(tableName = "tablealarmevent", shadeStrategy = YearTableShardStrategy.class, shardParamKey = "")
    List<AlarmInfoVo> selectAlarmByYears();
    
    
    
    /**
     * 按照日策略进行查询
     * @return
     */
    @TableShardAnnotation(tableName = "tablealarmevent", shadeStrategy = DayTableShardStrategy.class, shardParamKey = "")
    List<AlarmInfoVo> selectAlarmByDays();
    
    
    /**
     * 按照月策略进行查询
     * @return
     */
    @TableShardAnnotation(tableName = "tablealarmevent", shadeStrategy = MonthTableShardStrategy.class, shardParamKey = "")
    List<AlarmInfoVo> selectAlarmByMonths();
}
