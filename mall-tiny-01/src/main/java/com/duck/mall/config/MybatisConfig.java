package com.duck.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 */
@Configuration
@MapperScan("com.duck.mall.mbg.mapper")
public class MybatisConfig {
}
