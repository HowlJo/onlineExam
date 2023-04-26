package com.joxp.exam;

import com.joxp.exam.core.api.utils.JsonConverter;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.UnknownHostException;
import java.util.List;

/**
 * 云帆在线考试系统
 * @author bool
 * @email 18365918@qq.com
 * @date 2020-03-04 19:41
 */
@Log4j2
@SpringBootApplication
public class ExamApplication implements WebMvcConfigurer {

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(ExamApplication.class, args);

	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		//保留原有converter,把新增fastConverter插入集合头,保证优先级
		converters.add(0, JsonConverter.fastConverter());
	}

}