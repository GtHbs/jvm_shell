#!/bin/bash
# 单引号字符串中的字符都会原样输出，变量在单引号中无效
# 单引号字符串中不能单独出现一个单引号（对单引号转义后也不行），但可以成对出现，作为字符串拼接使用
name="alone"
single_quotes='single quotes,name=${name},join test '${name}''
# 双引号字符串可以使用变量，可以使用转义字符
double_quotes="double quotes,name=\"${name}\""
echo ${single_quotes}
echo $double_quotes

# 获取字符串长度
echo ${#double_quotes}
echo ${#double_quotes[0]}

# 字符串截取，下标从0开始，截取[1,3]，均为闭区间
echo ${double_quotes:1:3}
echo `expr substr "${double_quotes}" 1 3`

# 查询子串
echo `expr index "${double_quotes}" ou`
