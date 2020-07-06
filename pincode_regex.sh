#!/bin/bash
shopt -s extglob

read -p "Enter a pincode" pincode

pin_pattern="^[1-9]{1}[0-9]{2} {0,1}[0-9]{3}$"

if [[ $pincode =~ $pin_pattern ]]
then
	echo "Right Pincode"
else
	echo "Wrong Pincode"
fi