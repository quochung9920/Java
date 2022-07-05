package com.mycompany.pojos;

import com.mycompany.pojos.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-07-05T17:56:26")
@StaticMetamodel(Manufacturer.class)
public class Manufacturer_ { 

    public static volatile SingularAttribute<Manufacturer, String> country;
    public static volatile SingularAttribute<Manufacturer, String> name;
    public static volatile SingularAttribute<Manufacturer, Integer> id;
    public static volatile ListAttribute<Manufacturer, Product> productList;

}