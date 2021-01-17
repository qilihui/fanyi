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
~~~
### Windows 使用
* 修改 fan.c 中对应的绝对路径
* 编译之后，把可执行文件的绝对路径加入到环境变量
* win + R 打开运行
* 使用同上