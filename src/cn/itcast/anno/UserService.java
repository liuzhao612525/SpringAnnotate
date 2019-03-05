package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	//得到dao对象
	//定义dao属性
	//在dao属性上使用注解 完成对象注入
//	@Autowired
//	private UserDao userDao;
	
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void add() {
		System.out.println("UserService............");
		userDao.add();
	}
}
