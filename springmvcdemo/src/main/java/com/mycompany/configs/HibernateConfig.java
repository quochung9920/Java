package com.mycompany.configs;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.velocity.tools.config.Data;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:databases.properties")
public class HibernateConfig {
    @Autowired
    private org.springframework.core.env.Environment env;
    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
        factory.setPackagesToScan("com.mycompany.pojos");
        factory.setDataSource(dataSource());
        factory.setHibernateProperties(hibernateProperties());
        return factory;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("hibernate.connection.driverClass"));
        dataSource.setUrl(env.getProperty("hibernate.connection.url"));
        dataSource.setUsername(env.getProperty("hibernate.connection.username"));
        dataSource.setPassword(env.getProperty("hibernate.connection.password"));
        return dataSource;
    }

    public Properties hibernateProperties(){
        Properties props = new Properties();
        props.setProperty(Environment.SHOW_SQL, env.getProperty("hibernate.showSql"));
        props.setProperty(Environment.DIALECT, env.getProperty("hibernate.dialect"));
        return props;
    }
}
