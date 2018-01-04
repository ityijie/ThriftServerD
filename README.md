# ThriftServerD
spark_thirfSever应用

1.启动: ./{spark_home}/sbin/start-thriftserver.sh

2.查看jdbc连接UI：http://hadoop1:4040/jobs/

3.shell连接jdbc: ./{spark_home}/beeline >
                  !connect jdbc:hive2://localhost:10000
                  username: root
                  password: root
                  
4.代码jdbc : src/ThriftserverDemo
  
