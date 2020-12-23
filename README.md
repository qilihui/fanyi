# 翻译爬虫脚本
### 使用
* 生成 jar 包
~~~
mvn clean package
~~~
* 修改 .bashrc 文件添加如下内容
~~~
alias fan="java -jar {jar包绝对路径}"
~~~
* 使用
~~~
> fan test
测试

> fan 测试
test

> fan hello world
你好，世界 
