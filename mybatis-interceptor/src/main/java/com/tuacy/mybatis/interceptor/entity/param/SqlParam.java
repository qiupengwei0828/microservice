package com.tuacy.mybatis.interceptor.entity.param;

import java.util.Date;

/**
 *  慢SQL执行记录
 * @author Administrator
 *
 */
public class SqlParam {
  /**
   *执行sql方法
   */
  private String executormethod;
  /**
   *sql语句
   */
  private  String sentence;
  /**
   * 执行时间
   */
  private  String excutortime;
  /**
   *  创建时间
   * @return
   */
  private  Date    createtime;
  
  
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	public String getExcutortime() {
		return excutortime;
	}
	public void setExcutortime(String excutortime) {
		this.excutortime = excutortime;
	}
	public String getExecutormethod() {
		return executormethod;
	}
	public void setExecutormethod(String executormethod) {
		this.executormethod = executormethod;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}
