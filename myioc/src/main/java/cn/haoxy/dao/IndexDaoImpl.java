package cn.haoxy.dao;

import org.springframework.stereotype.Service;

/**
 * @author Haoxy
 * Created in 2019-10-25.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */

@Service
public class IndexDaoImpl implements IndexDao {

	public IndexDaoImpl() {
		System.out.println("constructor");
	}

	public String testSource(){

		return "test \n test2";
	}
}
