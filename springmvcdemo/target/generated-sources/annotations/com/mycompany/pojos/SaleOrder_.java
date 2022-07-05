package com.mycompany.pojos;

import com.mycompany.pojos.OrderDetail;
import com.mycompany.pojos.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-05T17:56:26")
@StaticMetamodel(SaleOrder.class)
public class SaleOrder_ { 

    public static volatile ListAttribute<SaleOrder, OrderDetail> orderDetailList;
    public static volatile SingularAttribute<SaleOrder, Long> amount;
    public static volatile SingularAttribute<SaleOrder, Date> createdDate;
    public static volatile SingularAttribute<SaleOrder, Integer> id;
    public static volatile SingularAttribute<SaleOrder, User> user;

}