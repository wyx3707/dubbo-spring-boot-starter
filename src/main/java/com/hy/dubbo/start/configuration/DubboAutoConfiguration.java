//package com.hy.dubbo.start.configuration;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.ProtocolConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
//import com.hy.dubbo.start.properties.DubboProperties;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//
///**
// *
// * @author wyx
// */
//@Configuration
//public class DubboAutoConfiguration {
//
//    @Resource
//    private DubboProperties dubboProperties;
//
//    @Bean
//    public ReferenceConfigCache referenceConfigCache() {
//        return ReferenceConfigCache.getCache();
//    }
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig(dubboProperties.getName());
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig(dubboProperties.getAddress());
//        registryConfig.setCheck(dubboProperties.isCheck());
//        registryConfig.setRegister(dubboProperties.isRegister());
//        registryConfig.setProtocol(dubboProperties.getProtocol());
//        return registryConfig;
//    }
//
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        if (null == dubboProperties.getProtocolName() || null == dubboProperties.getPayload()) {
//            return null;
//        }
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setPort(-1);
//        protocolConfig.setPayload(dubboProperties.getPayload());
//        return protocolConfig;
//    }
//
//    @Bean
//    public DubboService dubboService(ApplicationConfig applicationConfig,
//                                     RegistryConfig registryConfig,
//                                     ProtocolConfig protocolConfig,
//                                     ReferenceConfigCache referenceConfigCache) {
//        if (null == protocolConfig) {
//            // return new DubboService(applicationConfig, registryConfig, this.dubboProperties, referenceConfigCache)
//        }
//        // return new DubboService(applicationConfig, registryConfig, protocolConfig, this.dubboProperties, referenceConfigCache);
//        return null;
//    }
//
//}
