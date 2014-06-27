#!/bin/sh
gcc -fPIC -D_REENTRANT -I/Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/include -I/Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/include/darwin -c HelloJNI.c
