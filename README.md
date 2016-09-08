# SpringExercise
java spring framework exercise

这个仓库用于存储平常使用Spring框架所做的练习。

##Spring_Transaction
该项目基于慕课网《Spring事务管理》一课教程，演示了Spring事务管理的两大类四种方法：
#####一. 编程式事务管理
该方式需手动编写代码进行事务管理，在项目中对应
  * com.imooc.dao.AccountDaoImpl
  * com.imooc.service.AccountServiceImpl
  * com.imooc.test.SpringTransactionDemo
  * applicationContext.xml
  
#####二. 声明式事务管理
该类又分为三种方法:
 1. 基于TransactionProxyFactoryBean的方式，需要为每个进行事务管理的类, 配置一个TransactionProxyFactoryBean进行增强，对应
* com.imooc.dao.AccountDaoImpl2
* com.imooc.service.AccountServiceImpl2
* com.imooc.test.SpringTransactionDemo2
* applicationContext2.xml
 2. 基于AspectJ的XML方式，一旦配置好之后, 类上不需要添加任何东西，对应
* com.imooc.dao.AccountDaoImpl3
* com.imooc.service.AccountServiceImpl3
* com.imooc.test.SpringTransactionDemo3
* applicationContext3.xml
 3. 基于注解方式，配置简单, 需要在业务层类上添加一个@Transactional注解，对应
* com.imooc.dao.AccountDaoImpl4
* com.imooc.service.AccountServiceImpl4
* com.imooc.test.SpringTransactionDemo4
* applicationContext4.xml

