#!/bin/bash
name="alone"
echo $name
echo ${name}

for skill in hello world;
do
	echo "output variable is ${skill}"
done

name="alone2"
echo ${name}

url="http://www.baidu.com"
# 只读变量
readonly url
echo $url
# 只读变量不能重新赋值
#url="http://www.baidu2.com"
# 将变量设置为无效,再次输出会输出为空
# 局部变量：局部变量在脚本或命令中定义，仅在当前shell实例中有效，其他shell启动的程序不能访问局部变量
# 环境变量：即系统环境变量，所有的程序启动都需要依赖环境变量，shell也可以设置临时环境变量
# shell变量：是shell程序设置的临时变量
unset name
echo ${name}
