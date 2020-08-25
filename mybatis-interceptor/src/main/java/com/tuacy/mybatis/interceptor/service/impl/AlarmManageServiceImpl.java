package com.tuacy.mybatis.interceptor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tuacy.mybatis.interceptor.entity.param.AlarmInfoInsetParam;
import com.tuacy.mybatis.interceptor.entity.param.SqlParam;
import com.tuacy.mybatis.interceptor.entity.vo.AlarmInfoVo;
import com.tuacy.mybatis.interceptor.mapper.AlarmManageMapper;
import com.tuacy.mybatis.interceptor.mapper.SlowSqlRecordMapper;
import com.tuacy.mybatis.interceptor.service.IAlarmManageService;

@Service(value = "alarm-manage")
public class AlarmManageServiceImpl implements IAlarmManageService {

    private AlarmManageMapper alarmManageMapper;
    
    
	@Autowired
	SlowSqlRecordMapper slowSqlRecordMapper;

    @Autowired
    public void setAlarmManageMapper(AlarmManageMapper alarmManageMapper) {
        this.alarmManageMapper = alarmManageMapper;
    }

    /**
     * 插入一条告警
     * @param param 告警信息
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insertAlarm(AlarmInfoInsetParam param) {
        alarmManageMapper.insertAlarm(param, param.getAlarmOccurTime());
    }
    /**
     *按照年策略
     */
	@Override
	public List<AlarmInfoVo> selectAlarmByYears() {
		return alarmManageMapper.selectAlarmByYears();
	}
   /**
    * 按照天策略
    */
	@Override
	public List<AlarmInfoVo> selectAlarmByDays() {
		return alarmManageMapper.selectAlarmByDays();
	}
   
	/**
     *按照月策略
     */
	@Override
	public List<AlarmInfoVo> selectAlarmByMonths() {
		return alarmManageMapper.selectAlarmByMonths();
	}
    
    
    
    

}
