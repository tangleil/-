package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.domain.User;

public class TestA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String resource = "conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println("ok");
		System.out.println(sf.toString());
		SqlSession session = sf.openSession();
		
		List<User> list = session.selectList("com.dao.UserMapper.selectalluser");
		System.out.println(session);
		System.out.println(list);
		for (User user : list) {
			System.out.println(user.getUserId()+"/t"+user.getUserName()+"/t"+user.getUserPassword());
		}
	}

}
