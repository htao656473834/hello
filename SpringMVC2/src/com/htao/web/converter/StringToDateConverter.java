package com.htao.web.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;
/**
 * 自定义类型转换器
 * @author VULCAN
 *
 */
public class StringToDateConverter implements Converter<String, Date>{
/**
 * 把字符串转成日期对象
 */
	@Override 
	public Date convert(String source) {
		DateFormat format =null;
		
		try {
			if(StringUtils.isEmpty(source)){
				throw new NullPointerException("请输入正确参数");
			}
			//创建指定格式的日期转换对象
			format = new SimpleDateFormat("YYYY-MM-DD");
			//格式化字符串,转成日期对象
			Date  date =format.parse(source);
			//返回日期对象
			return date;
		} catch (ParseException e) {
		 throw new RuntimeException("请输入正确的日期格式成YYYY-MM-DD");
		}
		
		
	}

}
