package com.mycompany.pojos;

import com.mycompany.pojos.Product;
import com.mycompany.pojos.SaleOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-05T17:56:26")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Long> unitPrice;
    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, String> num;
    public static volatile SingularAttribute<OrderDetail, Integer> id;
    public static volatile SingularAttribute<OrderDetail, SaleOrder> saleOrder;

}