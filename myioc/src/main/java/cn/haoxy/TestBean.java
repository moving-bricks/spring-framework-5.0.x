package cn.haoxy;

import cn.haoxy.config.AppConfig;
import cn.haoxy.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther Haoxy
 * Created by haoxy on 2019-11-27
 * E-mail: hxyHelloWorld@163.com
 * github: https://github.com/haoxiaoyong1014
 * Waiting for my code to be compiled, can you marry me?
 */
public class TestBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(AppConfig.class);
		applicationContext.refresh();
		IndexDao bean = applicationContext.getBean(IndexDao.class);
		System.out.println(bean.testSource());
		applicationContext.close();
	}
}
