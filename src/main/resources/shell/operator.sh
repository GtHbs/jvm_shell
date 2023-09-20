#!/bin/bash
# 计算表达式时必须带空格
val=`expr 2 + 2`
echo $val

# --------------算术运算符--------------
a=10
b=20

val=`expr $a + $b`
echo "a + b: $val"

val=`expr $a - $b`
echo "a - b: $val"

val=`expr $a \* $b`
echo "a * b: $val"

val=`expr $a / $b`
echo "a / b: $val"

val=`expr $a % $b`
echo "a % b: $val"

# == 和 != 只能用于数字比较
if [ $a == $b ]
then
echo "a 等于 b"
fi

if [ $a != $b ]
then
echo "a 不等于 b"
fi


# ------------关系运算符-------------
if [ $a -eq $b ]
then
echo "$a -eq $b ：a 等于 b"
else
echo "$a -eq $b ：a 不等于 b"
fi

if [ $a -ne $b ]
then
echo "$a -ne $b ：a 不等于 b"
else
echo "$a -ne $b ：a 等于 b"
fi

if [ $a -gt $b ]
then
echo "$a -gt $b ：a 大于 b"
else
echo "$a -gt $b ：a 不大于 b" 
fi

if [ $a -lt $b ]
then
echo "$a -lt $b ：a 小于 b"
else
echo "$a -lt $b ：a 不小于 b"
fi

if [ $a -ge $b ]
then
echo "$a -ge $b ：a 大于等于 b"
else
echo "$a -ge $b ：a 小于 b"
fi

if [ $a -le $b ]
then
echo "$a -le $b ：a 小于等于 b"
else
echo "$a -le $b ：a 大于 b"
fi


# -----------布尔运算符------------
# -a 与运算，-o或运算，!非运算

if [ $a != $b ]
then
echo "$a != $b ：a 不等于 b"
else
echo "$a != $b ：a 等于 b"
fi

if [ $a -lt 100 -a $b -lt 15 ]
then
echo "$a 小于100 且 $b 小于 15 ：返回 true"
else
echo "$a 小于100 且 $b 小于 15 ：返回 false"
fi

if [ $a -lt 100 -o $b -lt 15 ]
then
echo "$a 小于100 或 $b 小于 15 ：返回 true"
else
echo "$a 小于100 或 $b 小于 15 ：返回 false"
fi

# -----------逻辑运算符-------------
if [[ $a -lt 100 && $b -gt 100 ]]
then
echo "返回false"
else
echo "返回true"
fi

if [[ $a -lt 100 || $b -gt 100 ]]
then
echo "返回true"
else
echo "返回false"
fi


# ------------字符串运算符----------

a="bbb"
b="aaa"

if [ $a = $b ]
then
echo "$a = $b : a 等于 b"
else
echo "$a = $b : a 不等于 b"
fi

if [ $a != $b ]
then
echo "$a != $b : a 不等于 b"
else
echo "$a != $b : a 等于 b"
fi

if [ -z $a ]
then
echo "$a 长度为0"
else
echo "$a 长度不为0"
fi

if [ -n $a ]
then
echo "$a 长度不为0"
else
echo "$a 长度为0"
fi


if [ $a ]
then
echo "$a 不为空"
else
echo "$a 为空"
fi


