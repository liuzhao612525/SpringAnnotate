package cn.itcast.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//Service、业务层
//Controller、web层
//Respository：持久层
@Component(value="user")      //相当于<bean id="user" class=""><bean>
@Scope(value="prototype") //默认是单实例，prototype是多实例
public class User {
	public void add() {
		System.out.println("add..............");
	}
}
