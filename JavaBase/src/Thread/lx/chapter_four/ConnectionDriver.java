package Thread.lx.chapter_four;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public class ConnectionDriver {

	static class ConnectionHandler implements InvocationHandler {

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if (method.getName().equals("commit")) {
				TimeUnit.SECONDS.sleep(5);
			}
			return null;
		}
		
	}
	
	public static Connection createConnection() {
//		return Proxy.newProxyInstance(ConnectionDriver.class.getClassLoader(), new Class<>[] { Connection.class }, new ConnectionHandler());
		return null;
	}
}
