#!/bin/bash

type=$1
index=$2
method=$3
desc=$4

packageName="${type}_${index}_${method}"

if [ ! -d "$packageName" ]; then
    cd ./com/ralap
    mkdir $packageName
fi
cd $packageName

echo "package com.ralap.$packageName;

/**
 * $index. $desc
 */
public class Solution {

    /**
     * $desc
     */
    public int $method() {
        return 0;
    }
}" >> Solution.java

echo "Done"


