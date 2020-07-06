#!/bin/bash
shopt -s extglob

read -p "Enter the Password" pd

pd_pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&]).{8,32}$"


if [[ $pd =~ $pd_pattern ]]
then
	echo "Right Password"
else
	echo "Wrong Password"
fi