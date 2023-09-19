#!/bin/bash
# shell中仅支持一维数组，数组下标从0开始
address_array=("xian" "chongqing")
address_array[2]="shenzhen"
echo ${address_array[@]}
# 获取数组元素个数
echo ${#address_array[@]}
# 获取数组元素个数
echo ${#address_array[*]}
# 获取数组单个元素长度
echo ${#address_array[0]}

: '
多行注释
'

:<<'hello'
这里是注
hello
