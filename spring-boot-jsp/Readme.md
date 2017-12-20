jsp不能用Application.java的main 方法启动，只能用 Tomcat 启动，并且要打 war 包，所以修改打包方式为 war：
    <packaging>war</packaging>
    
1、有添加provided的情况：

右键运行启动类，访问页面报404错误
使用 mvn spring-boot:run 运行正常
打包成jar，通过 java -jar demo-0.0.1-SNAPSHOT.jar 运行报错
打包成war，通过 java -jar demo-0.0.1-SNAPSHOT.war 运行正常



2、把provided 注释掉的情况

右键运行启动类，访问页面正常
使用 mvn spring-boot:run 运行 访问页面正常
打包成jar，通过 java -jar demo-0.0.1-SNAPSHOT.jar 运行报错
打包成war，通过 java -jar demo-0.0.1-SNAPSHOT.war 运行正常

$ mvn spring-boot:run
