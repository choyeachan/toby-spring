package springbook;

import java.sql.SQLException;

import springbook.user.dao.NUserDao;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class Run {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		UserDao dao = new NUserDao();

		User user = new User();
		user.setId("cyc");
		user.setName("조예찬");
		user.setPassword("depth1004");

		dao.add(user);

		System.out.println(user.getId() + " 등록성공");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회성공");

	}

}
