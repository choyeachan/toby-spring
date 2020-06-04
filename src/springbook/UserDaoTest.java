package springbook;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.AccountDao;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		ApplicationContext context =
			new GenericXmlApplicationContext("applicationContext.xml");

		UserDao dao = context.getBean("userDao",UserDao.class);
		UserDao dao1 = context.getBean("userDao",UserDao.class);

		System.out.println(dao);
		System.out.println(dao1);
		System.out.println(dao==dao1);

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
