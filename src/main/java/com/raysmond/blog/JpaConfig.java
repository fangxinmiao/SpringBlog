package com.raysmond.blog;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackageClasses = Application.class)
class JpaConfig /*implements TransactionManagementConfigurer*/ {

//    @Value("${spring.dataSource.driverClassName}")
//    private String driver;
//    @Value("${spring.dataSource.url}")
//    private String url;
//    @Value("${spring.dataSource.username}")
//    private String username;
//    @Value("${spring.dataSource.password}")
//    private String password;
//    @Value("${spring.hibernate.dialect}")
//    private String dialect;
//    @Value("${spring.hibernate.hbm2ddl.auto}")
//    private String hbm2ddlAuto;
//    @Value("${spring.hibernate.show_sql}")
//    private Boolean showSql;

//    @Bean
//    public DataSource configureDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setDriverClassName(driver);
//        config.setJdbcUrl(url);
//        config.setUsername(username);
//        config.setPassword(password);
//
//        config.addDataSourceProperty("useUnicode", "true");
//        config.addDataSourceProperty("characterEncoding", "utf8");
//        config.addDataSourceProperty("cachePrepStmts", "true");
//        config.addDataSourceProperty("prepStmtCacheSize", "250");
//        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//        config.addDataSourceProperty("useServerPrepStmts", "true");
//
//        return new HikariDataSource(config);
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(configureDataSource());
//        entityManagerFactoryBean.setPackagesToScan("com.raysmond.blog");
//        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//
//        Properties jpaProperties = new Properties();
//        jpaProperties.put(org.hibernate.cfg.Environment.DIALECT, dialect);
//        jpaProperties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, hbm2ddlAuto);
//        jpaProperties.put(org.hibernate.cfg.Environment.SHOW_SQL, showSql);
//        entityManagerFactoryBean.setJpaProperties(jpaProperties);
//
//        return entityManagerFactoryBean;
//    }
//
//    @Bean(name = "transactionManager")
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new JpaTransactionManager();
//    }
}
