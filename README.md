# ThriftServerD
spark_thirfSever应用

##数据准备

###hive建库

```
hive>create database rz;
```

###rz库建表

```
hive>use rz;
hive> create table rzt(id int,name string)
    > partitioned by(location string)
    > row format delimited fields terminated by ',';
 ```

###基础数据
rzt.txt
```
1001,xiaomi
1002,damiao
1003,jiemi
```


导入数据
```
hive> load data local inpath '/home/hadoop/rzt.txt' into table rzt
    > partition(location='china');

```


1.启动: ./{spark_home}/sbin/start-thriftserver.sh

2.查看jdbc连接UI：http://hadoop1:4040/jobs/

3.shell连接jdbc: ./{spark_home}/beeline >
                  !connect jdbc:hive2://localhost:10000
                  username: root
                  password: root
                  
4.代码jdbc : src/ThriftserverDemo
  

