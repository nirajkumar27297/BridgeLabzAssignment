#!/bin/bash
shopt -s extglob

read -p "Enter your name " name
name_p="^[A-Z]{1}[a-z,A-Z]{2,}$"

if [[ $name =~ $name_p ]]
then
	echo "Name is Valid"
else

	echo "Name is Invalid"
fi