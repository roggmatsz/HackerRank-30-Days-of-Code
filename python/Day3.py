#! /bin/python3

import sys

N = int(input().strip())

if N % 2 != 0:
    print('Weird')
if N % 2 == 0 and N > 1 and N < 6:
    print('Not Weird')
if N % 2 == 0 and N > 5 and N < 21:
    print('Weird')
if N % 2 == 0 and N > 20:
    print('Not Weird')
