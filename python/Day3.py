#! /bin/python3

import sys

n = int(input().strip())

if n % 2 != 0:
    print('Weird')
if n % 2 == 0 and n > 1 and n < 6:
    print('Not Weird')
if n % 2 == 0 and n > 5 and n < 21:
    print('Weird')
if n % 2 == 0 and n > 20:
    print('Not Weird')
