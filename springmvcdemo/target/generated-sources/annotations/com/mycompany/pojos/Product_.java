package com.mycompany.pojos;

import com.mycompany.pojos.Category;
import com.mycompany.pojos.Manufacturer;
import com.mycompany.pojos.OrderDetail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-05T17:56:26")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile ListAttribute<Product, OrderDetail> orderDetailList;
    public static volatile SingularAttribute<Product, Date> createdDate;
    public static volatile SingularAttribute<Product, Long> price;
    public static volatile ListAttribute<Product, Manufacturer> manufacturerList;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Boolean> active;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, String> manufacturer;

}