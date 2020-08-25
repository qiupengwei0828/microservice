package com.tuacy.mybatis.interceptor.controller;

import com.tuacy.microservice.framework.common.controller.BaseController;
import com.tuacy.microservice.framework.common.entity.response.ResponseListEntity;
import com.tuacy.mybatis.interceptor.entity.param.AlarmInfoInsetParam;
import com.tuacy.mybatis.interceptor.entity.vo.AlarmInfoVo;
import com.tuacy.mybatis.interceptor.entity.vo.UserInfoVo;
import com.tuacy.mybatis.interceptor.service.IAlarmManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alarm/")
public class AlarmManageController extends BaseController {

    private IAlarmManageService alarmManageService;

    @Autowired
    public void setAlarmManageService(IAlarmManageService alarmManageService) {
        this.alarmManageService = alarmManageService;
    }


    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public ResponseListEntity<AlarmInfoVo> insertAlarm(@RequestBody AlarmInfoInsetParam param) {
        ResponseListEntity<AlarmInfoVo> responseDataEntity = new ResponseListEntity<>();
        alarmManageService.insertAlarm(param);
        return responseDataEntity;
    }
    
    /**
     * 分表策略，years
     * @param param
     * @return
     */
    @RequestMapping(value = "selectAlarmByYears", method = RequestMethod.POST)
    public ResponseListEntity<AlarmInfoVo> selectAlarmByYears(@RequestBody AlarmInfoInsetParam param) {
        ResponseListEntity<AlarmInfoVo> responseDataEntity = new ResponseListEntity<>();
        alarmManageService.selectAlarmByYears();
        return responseDataEntity;
    }
    /**
     * 分表策略,分表策略 days
     * @param param
     * @return
     */
    @RequestMapping(value = "selectAlarmByDays", method = RequestMethod.POST)
    public ResponseListEntity<AlarmInfoVo> selectAlarmByDays(@RequestBody AlarmInfoInsetParam param) {
        ResponseListEntity<AlarmInfoVo> responseDataEntity = new ResponseListEntity<>();
        alarmManageService.selectAlarmByDays();
        return responseDataEntity;
    }
    
    /**
     * 分表策略,月份months
     * @param param
     * @return
     */
    @RequestMapping(value = "selectAlarmByMonths", method = RequestMethod.POST)
    public ResponseListEntity<AlarmInfoVo> selectAlarmByMonths(@RequestBody AlarmInfoInsetParam param) {
        ResponseListEntity<AlarmInfoVo> responseDataEntity = new ResponseListEntity<>();
        alarmManageService.selectAlarmByMonths();
        return responseDataEntity;
    }
      
    

}
