
#!/bin/bash -x

IsParttime=1
Isfulltime=2

check=$((RANDOM%3))
wage_per_hour=20
if(($check==$IsParttime))
then
	
	hours=4
elif(($check==$Isfulltime))
then
	hours=8
	
	
else
	hours=0
fi
salary=$(($wage_per_hour*$hours))
echo $salary