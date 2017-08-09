package com.yfax.webapi.rest.cfdb;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Minbo.He
 * 配置接口
 */
@Controller
@RequestMapping("/api/cfdb")
public class AppConfig {
	protected static Logger logger = LoggerFactory.getLogger(AppConfig.class);
	
	/**
	 * APP的faq页面
	 */
	@RequestMapping("/faq")
    public String pageFaq(Map<String, Object> model) {
        return "faq";
    }
}