package hibernatedemo;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import hibernatedemo.pojo.Category;
import hibernatedemo.pojo.Product;

public class HibernateTester {
    public static void main(String[] args) {
        Session session = HibernateUtils.getFactory().openSession();

        // Yêu cầu 1: Lấy danh sách sản phẩm
        // Lấy tất cả sản phẩm bằng HQL
        //Query query = session.createQuery("from Product");
        // Lấy tất cả sản phẩm bằng Criteria
        // CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery<Product> query = builder.createQuery(Product.class);
        // query.from(Product.class);
        // List<Product> products = session.createQuery(query).getResultList();
        // products.forEach(product -> {
        //     System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        // });

        // Lấy theo tên sản phẩm bằng HQL
        // Query query = session.createQuery("from Product P where P.name like :ten");
        // query.setParameter("ten", "%Galaxy%");
        // Lấy theo tên sản phẩm bằng Criteria
        // CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery<Product> query = builder.createQuery(Product.class);
        // Root root = query.from(Product.class);
        // query.where(builder.like(root.get("name").as(String.class), "%Galaxy%"));
        // List<Product> products = session.createQuery(query).getResultList();
        // products.forEach(product -> {
        //     System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        // });

        // Lấy theo khoảng giá sản phẩm bằng HQL
        // Query query = session.createQuery("FROM Product P WHERE P.price BETWEEN :begin AND :end");
        // query.setParameter("begin", new BigDecimal(20000000));
        // query.setParameter("end", new BigDecimal(30000000));
        // Lấy theo khoảng giá sản phẩm bằng Criteria
        // CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery<Product> query = builder.createQuery(Product.class);
        // Root root = query.from(Product.class);
        // query.where(builder.between(root.get("price").as(BigDecimal.class), new BigDecimal(20000000), new BigDecimal(30000000)));
        // List<Product> products = session.createQuery(query).getResultList();
        // products.forEach(product -> {
        //     System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        // });

        // Lấy theo danh mục sản phẩm bằng HQL
        // Query query = session.createQuery("FROM Product P WHERE P.category.id =:cate ORDER BY P.id DESC");
        // query.setParameter("cate", 1);
        // Lấy theo danh mục sản phẩm bằng Criteria
        // CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery<Product> query = builder.createQuery(Product.class);
        // Root root = query.from(Product.class);
        // query.where(builder.equal(root.get("category").get("id").as(Integer.class), 1));
        // query.orderBy(builder.desc(root.get("id")));
        // List<Product> products = session.createQuery(query).getResultList();
        // products.forEach(product -> {
        //     System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        // });

        // List<Product> products = query.getResultList();

        // products.forEach(product -> {
        //     System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice());
        // });


        // Yêu cầu 2 viết phương thức thực hiện chức năng thêm, xoá, cập nhật sản phẩm
        // Thêm sản phẩm
        // Product product = new Product();
        // product.setName("Galaxy S10");
        // product.setPrice(new BigDecimal(10000000));
        // Category category = session.get(Category.class, 1);
        // product.setCategory(category);
        // session.save(product);
        
        // Xoá sản phẩm (Đang lỗi)
        // Product product = session.get(Product.class, 1);
        // Category category = product.getCategory();
        // session.getTransaction().begin();
        // session.delete(product);
        // session.getTransaction().commit();
        
        // Cập nhật sản phẩm
        // Product product = session.get(Product.class, 1);
        // product.setName("Galaxy S10");
        // product.setPrice(new BigDecimal(10000000));
        // Category category = session.get(Category.class, 2);
        // product.setCategory(category);
        // session.getTransaction().begin();
        // session.update(product);
        // session.getTransaction().commit();
        
        // Yêu cầu 3: Viết phương thức thêm một hoá đơn mua hàng
        
       
        session.close();
    }
}
