#!/bin/bash

demoFunc() {
	echo "shell function"
}

echo "开始执行函数"
demoFunc
echo "函数执行结束"


funcWithReturn() {
	echo "请输入第一个数字"
	read a
	echo "请输入第二个数字"
	read b
	echo "输入的两个数字为: $a 和 $b !"
	return $(($a+$b))
}
# 函数的返回值必须使用 $? 来接收,并且接收必须在函数定义之后
funcWithReturn
echo "输入的两个数字之和为 $? !"


# 获取函数入参，参数个数小于10可以直接使用$n获取，否则必须使用${n}获取
funcWithParam() {
	echo "第一个参数为 $1 !"
	echo "第二个参数为 $2 !"
	echo "第三个参数为 $3 !"
	echo "第十个参数为 ${10} !"
	echo "参数总共有 $# 个!"
	echo "作为一个字符串输出所有参数 $* !"
}

funcWithParam 1 2 3 4 5 6 7 8 9 0 
