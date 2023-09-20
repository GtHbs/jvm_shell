#!/bin/bash
# shell中仅支持一维数组，数组下标从0开始
address_array=("xian" "chongqing")
address_array[2]="shenzhen"
# 获取数组所有的元素
echo ${address_array[@]}
# 获取数组元素个数
echo ${#address_array[@]}
# 获取数组元素并以字符串形式输出
echo ${#address_array[*]}
# 获取数组单个元素长度
echo ${#address_array[0]}

for i in ${address_array[@]}
do
    echo $i
done
: '
多行注释
'

:<<'hello'
这里是注释
hello
