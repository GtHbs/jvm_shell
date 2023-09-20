#!/bin/bash
int=1
while [ $int -lt 5 ]
do
	echo $int
	let "int++"
done

# until循环
# until循环执行一系列命令直至条件为true时停止
a=0
until [ ! $a -lt 10 ]
do
    echo $a
    a=`expr $a + 1`
done


# case esac
echo "输入 1 到 4 之间的数字"
echo "你输入的数字为"
read num

case $num in 
	1) echo "你选择了1"
	;;
	2) echo "你选择了2"
	;;
	3) echo "你选择了3"
	;;
	4) echo "你选择了4"
	;;
	*) echo "你没有输入 1 到 4 之间的数字"
	;;
esac

while :
do
	echo -n "输入 1 到 5 之间的数字:"
	read num
	case $num in 
		1|2|3|4|5) echo "你输入的数字为 $num!"
		;;
		*) echo "你输入的数字不是 1 到 5 之间，结束"
		#break
		continue
		;;
	esac
done

# read 命令用于接收输入参数（循环接受）
echo "按下<CTRL-D>退出"
echo -n "请输入你最喜欢的网站"
while read FILM
do
	echo "$FILM"
done
