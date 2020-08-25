package com.tuacy.mybatis.interceptor.service;

import java.util.List;

import com.tuacy.mybatis.interceptor.entity.param.AlarmInfoInsetParam;
import com.tuacy.mybatis.interceptor.entity.vo.AlarmInfoVo;

public interface IAlarmManageService {

    /**
     * 插入一条告警
     * @param param 告警信息
     */
   void insertAlarm(AlarmInfoInsetParam param);
   
   
   /**
    *获取信息 按年
    */
   List<AlarmInfoVo>  selectAlarmByYears(); 
   
   /**
    *获取信息 按日
    */
   List<AlarmInfoVo>  selectAlarmByDays(); 
   /**
    *获取信息 按月
    */
   List<AlarmInfoVo>  selectAlarmByMonths(); 
}

