//package com.example.demo.config;
//
//
//import com.example.demo.Interceptor.LoginInterceptor;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.*;
//
//@SpringBootConfiguration
//public class MyWebConfigurer implements WebMvcConfigurer {
//    /**
//     * 将自定义拦截器作为bean写入配置
//     * @return
//     */
//    @Bean
//    public LoginInterceptor getLoginIntercepter() {
//        return new LoginInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(getLoginIntercepter())
//                .addPathPatterns("/**") //拦截所有路径
//                .excludePathPatterns("/login","/routes"); //排除路径
//    }
//}
//
//
