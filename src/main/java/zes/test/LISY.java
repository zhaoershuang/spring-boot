package zes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LISY {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			User user = new User("admin"+String.valueOf(Math.random()*10).substring(0, 5),"123456");
			userList.add(user);
		}
		Iterator<User> userIter = userList.iterator();
		while (userIter.hasNext()) {
			User user = userIter.next();
			System.out.println("用户名："+user.getUsername()+"密码："+user.getPassword());
		}
		/*for (int i = 0; i < userList.size(); i++) {
			System.out.println("用户名："+userList.get(i).getUsername()+"密码："+userList.get(i).getPassword());
		}*/
	}
}
