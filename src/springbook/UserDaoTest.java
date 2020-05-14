package springbook;

import java.sql.SQLException;

import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao dao = new UserDao(connectionMaker);

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
