package com.hy.dubbo.start.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Dubbo服务读取配置文件的自动配置
 *
 * @author wyx
 */
@Configuration
@ImportResource(locations = {"classpath*:dubbo/**/dubbo*.xml"})
public class DubboXmlAutoConfiguration {
}
