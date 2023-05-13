package com.foottime.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * 自动打开浏览器
 */
@Component//把类实例化到spring容器中相当于配置文件
public class MyBrowserRunner implements CommandLineRunner {
    //框架自带的日志 打印信息到控制台
    private static Logger logger = LoggerFactory.getLogger(MyBrowserRunner.class);
    //通过该注解@Value 利用spel表达式(${spring.web.loginurl})获取配置文件的值
    @Value("${spring.web.loginurl}")
    private String loginUrl;
    //通过该注解@Value 利用spel表达式(${spring.web.googleexcute})获取配置文件的值
    @Value("${spring.web.edge}")
    private String edgeExcutePath;
    //通过该注解@Value 利用spel表达式(${spring.auto.openurl})获取配置文件的值
    @Value("${spring.auto.openurl}")
    private boolean isOpen;

    @Override
    public void run(String... args) throws Exception {
        if(isOpen){
//            String cmd = "cmd /c st"
            String cmd = edgeExcutePath +" "+ loginUrl;
            Runtime run = Runtime.getRuntime();
            try{
                run.exec(cmd);
//                日志
                logger.debug("启动浏览器打开项目成功");
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
            }
        }
    }
}
