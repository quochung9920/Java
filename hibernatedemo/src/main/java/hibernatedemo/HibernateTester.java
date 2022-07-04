package hibernatedemo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import hibernatedemo.pojo.Category;
import hibernatedemo.pojo.Manufacturer;
import hibernatedemo.pojo.Product;

public class HibernateTester {

    public static void main( String[] args ) {
        Session session = HibernateUtils.getFactory().openSession();

        // Query q = session.createQuery("UPDATE Category C SET C.name =: name WHERE C.id =: id");
        // q.setParameter("name", "Smart Watch");
        // q.setParameter("id", 1);
        // session.beginTransaction();
        // q.executeUpdate();
        // session.getTransaction().commit();

        // Query q = session.createQuery("SELECT C.name, Count(P.id), Max(P.price), Min(P.price) " + 
        // "FROM Product P INNER JOIN Category C ON P.category.id=C.id GROUP BY C.name");

        // List<Object[]> list = q.getResultList();
        // for (Object[] row : list) {
        //     System.out.println(row[0] + ": " + row[1] + " products, max price: " + row[2] + ", min price: " + row[3]);
        // }

        // Query q = session.createQuery("select P.id, P.name, P.price from Product P WHERE P.name like :kw ORDER BY P.id DESC");
        // q.setParameter("kw","%iPhone%");
        // List<Object[]> products = q.getResultList();
        // for (Object[] product : products) {
        //     System.out.println(product[0] + " - " + product[1] + " - " + product[2]);
        // }

        // CriteriaBuilder builder = session.getCriteriaBuilder();
        // CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
        // Root<Product> pRoot = query.from(Product.class);
        // Root<Category> cRoot = query.from(Category.class);
        // query = query.multiselect(cRoot.get("name").as(String.class),
        //     builder.count(pRoot.get("id").as(Integer.class)),
        //     builder.max(pRoot.get("price").as(BigDecimal.class)));
        // query = query.groupBy(cRoot.get("name").as(String.class));
        // query = query.orderBy(builder.asc(cRoot));
        // Query q = session.createQuery(query);
        // List<Object[]> result = q.getResultList();
        // for (Object[] row : result) {
        //     System.out.println(row[0] + ": " + row[1] + ": " + row[2]);
        // }

        
        // Root root = query.from(Object[].class);
        // query = query.multiselect(builder.count(root.get("id").as(Integer.class)),
        //         builder.max(root.get("price").as(BigDecimal.class)));
        // Query q = session.createQuery(query);
        // Object[] kq = (Object[]) q.getSingleResult();
        // System.out.println("Count = " + kq[0]);
        // System.out.println("Max = " + kq[1]);

        // Predicate p1 = builder.greaterThanOrEqualTo(root.get("price").as(BigDecimal.class), new BigDecimal(20000000));
        // Predicate p2 = builder.lessThanOrEqualTo(root.get("price").as(BigDecimal.class), new BigDecimal(30000000));
        // Predicate p3 = builder.between(root.get("price").as(BigDecimal.class), new BigDecimal(20000000), new BigDecimal(30000000));
        // query = query.where(p3);
        // query = query.where(builder.and(p1, p2));
        // Query q = session.createQuery(query);
        // List<Product> products = q.getResultList();
        // for (Product product : products) {
        //     System.out.println(product.getName() + " " + product.getPrice());
        // }        

        // Manufacturer manufacturer = session.get(Manufacturer.class, 1);
        // manufacturer.getProducts();
        // for (Product product : manufacturer.getProducts()) {
        //     System.out.println(product.getName());
        // }        
        
        // Product p = new Product();
        // p.setName("New Tablet 2067");
        // p.setPrice(new BigDecimal(30000000));
        // Category c = session.get(Category.class, 2);
        // p.setCategory(c);
        // Set<Manufacturer> manufacturers = new HashSet<>();
        // manufacturers.add(session.get(Manufacturer.class, 1));
        // manufacturers.add(session.get(Manufacturer.class, 2));
        // p.setManufacturers(manufacturers);
        // session.beginTransaction();
        // session.save(p);
        // session.getTransaction().commit();

        // Category c = session.get(Category.class, 1);
        // c.getProducts();
        // for (int i = 0; i < c.getProducts().size(); i++) {
        //     System.out.println(c.getProducts().get(i).getName());    
        // }

        // Product p = session.get(Product.class, 7);
        // System.out.printf("Name: %s\n", p.getName());

        // Transient
        // Product product = new Product();
        // product.setName("iPad Pro 2022");
        // product.setPrice(new BigDecimal(22000000));
        // Persistent
        // Category c = session.get(Category.class, 2);
        // product.setCategory(c);
        // session.save(product);

        // Câu truy vấn HQL này là lớp đối tượng chứ không phải bảng dữ liệu
        // Độc lập với cơ sở dữ liệu
        // Query q = session.createQuery("FROM Category WHERE id = 1");
        // List<Category> cates = q.getResultList();
        // for (int index = 0; index < cates.size(); index++) {
        //     Category cate = cates.get(index);
        //     System.out.printf("%d - %s\n", cate.getId(), cate.getName());
        // }

        // Transient state: object is not associated with any session
        // Category category = new Category(); 
        // category.setName("Phu kien may tinh");
        // category.setDescription("Test Hibernate");
        // session.save(category);

        // Category category = (Category) session.get(Category.class, 4);
        // category.setDescription("DU LIEU CAP NHAT");
        // session.getTransaction().begin();
        // session.delete(category);
        // session.getTransaction().commit();

        session.close();
    }
}
