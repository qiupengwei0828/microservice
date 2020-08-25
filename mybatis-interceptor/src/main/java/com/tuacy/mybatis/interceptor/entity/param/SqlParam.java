package com.tuacy.mybatis.interceptor.entity.param;
/**
 * 记录sql插入时间
 * @author Administrator
 *
 */
public class SqlParam {
  /**
   *sql语句
   */
  private  String sentence;
  /**
   * 执行时间
   */
  private  String excutortime;
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
  
}
