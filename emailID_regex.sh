#!/bin/bash
shopt -s extglob

read -p "Enter the Email ID" ed

ed_pattern="^[0-9a-zA-z]+([.+_-][0-9a-zA-z]+)*@[0-9a-zA-z]+.[a-zA-Z]{2,4}([.][a-zA-z]{2})*$"


if [[ $ed =~ $ed_pattern ]]
then
	echo "Right Email ID"
else
	echo "Wrong Email ID"
fi