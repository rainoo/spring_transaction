
<p align="center">
    <a href="http://www.gittoy.com/">
        <img src="https://avatars3.githubusercontent.com/u/18376321" width="150">
    </a>
    <h3 align="center">Spring Transaction</h3>
    <p align="center">
        Spring Transaction进行事务管理的小案例
        <br>
        <a href="http://www.gittoy.com/"><strong>-- Browse website. --</strong></a>
        <br>
    </p>    
</p>


## Introduction
Spring有几种方式进行事务管理
- 1、编程式事务管理：手动编写代码进行事务管理（目前项目上已经很少使用）; --DEMO1
- 2、声明式事务管理：基于TransactionProxyFactoryBean的方式。需要为每个进行事务管理的类，配置一个TransactionProxyFactory进行增强； --DEMO2
- 3、声明式事务管理：基于AspectJ的XML方式进行事务管理（开发中经常使用，配置更加清晰，一目了然）； --DEMO3
- 4、声明式事务管理：基于注解的方式进行事务管理（开发中经常使用，配置简单，但是需要更改每一个相关类）。 --DEMO4
