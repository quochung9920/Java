package hibernatedemo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import hibernatedemo.pojo.Category;
import hibernatedemo.pojo.Manufacturer;
import hibernatedemo.pojo.Product;

public class HibernateUtils {
    private static final SessionFactory FACTORY;

    // Chạy đầu tiên khi hàm này được gọi và chỉ gọi 1 lần
    static{
        Configuration conf = new Configuration();

        conf.configure("hibernate.cfg.xml");

        // Properties props = new Properties();
        // props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        // props.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        // props.put(Environment.URL, "jdbc:mysql//localhost/saledbbth");
        // props.put(Environment.USER, "root");
        // props.put(Environment.PASS, "090900");
        // props.put(Environment.SHOW_SQL, "true");
        // conf.setProperties(props);
        
        // Khai báo cho cấu hình biết AnnotatedClasses để lấy các class được đánh dấu @Entity
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Manufacturer.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
            .applySettings(conf.getProperties()).build(); 


        FACTORY = conf.buildSessionFactory(registry);
        
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }
}
