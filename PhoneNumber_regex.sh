#!/bin/bash
shopt -s extglob

read -p "Enter a PhoneNumber" pn

pn_pattern="^[1-9]{2} [0-9]{10}$"

if [[ $pn =~ $pn_pattern ]]
then
	echo "Right PhoneNumber"
else
	echo "Wrong PhoneNumber"
fi