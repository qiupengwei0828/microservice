package com.tuacy.mybatis.interceptor.config;

import com.tuacy.mybatis.interceptor.interceptor.encryptresultfield.EncryptResultFieldInterceptor;
import com.tuacy.mybatis.interceptor.interceptor.log.LogInterceptor;
import com.tuacy.mybatis.interceptor.interceptor.page.PageInterceptor;
import com.tuacy.mybatis.interceptor.interceptor.tableshard.TableShardInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * mybatis配置各种拦截器,db层面的
 */
@Configuration
public class MybatisConfiguration {
    /**
     * 分页拦截器
     * @return
     */
    @Bean
    public PageInterceptor pageInterceptor() {
        PageInterceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty(PageInterceptor.PROPERTIES_KEY_DATABASE_TYPE, PageInterceptor.DATABASE_TYPE_MYSQL);
        properties.setProperty(PageInterceptor.PROPERTIES_KEY_PAGE_EXPRESSION_MATCHING, ".*Page.*");
        properties.setProperty(PageInterceptor.PROPERTIES_KEY_COUNT_SUFFIX, "_COUNT");
        interceptor.setProperties(properties);
        return interceptor;
    }
    /**
     * 设置分页，分表拦截器
     * @return
     */
    @Bean
    public TableShardInterceptor tableSplitInterceptor() {
        return new TableShardInterceptor();
    }
    
    /**
     * 设置显示sql打印时间，日志过滤器
     * @return
     */
    @Bean
    public LogInterceptor logInterceptor() {
        LogInterceptor interceptor = new LogInterceptor();
        Properties properties = new Properties();
        // 设置是否显示数据库执行语句的执行时间
        properties.setProperty(LogInterceptor.PROPERTIES_KEY_ENABLE_EXECUTOR_TIME, LogInterceptor.ENABLE_EXECUTOR_TIME);
        interceptor.setProperties(properties);
        return interceptor;
    }
    
    /**
     * 字段脱敏，加密拦截器
     * @return
     */
    @Bean
    public EncryptResultFieldInterceptor encryptResultFieldInterceptor() {
        return new EncryptResultFieldInterceptor();
    }

}
