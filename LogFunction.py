# Problem Description
# A lumber yard has a stock of N long wooden planks with lengths L1, ..., LN. Planks can be divided into shorter planks — a plank of length 12, for example, can be divided into three shorter planks, each of length 4 — but separate pieces can't be joined to form longer planks.

# A large order has been placed, requesting that at least K planks of equal length, M, be delivered.

# Write a program that, given K and the lengths of planks in stock, L1, ..., LN, determines the maximum possible value for M.

# Note that as the length increases, the number of planks that can be made will decrease.

# Example
# You are given N = 4 planks with lengths 10, 14, 15, 11. The order requests a minimum of 6 planks.

# The order can be fulfilled with 6 planks of length 7 each:

# The plank of length 10 is divide into one plank of length 7, and one of length 3 (which is discarded).
# The plank of length 14 is divide into two planks of length 7.
# The plank of length 15 is divide into two planks of length 7, and one of length 1 (which is discarded).
# The plank of length 11 is divide into one plank of length 7, and one of length 4 (which is discarded).
# The order can’t be fulfilled with planks of length 8 or more, so 7 is the maximum length.

# Note that although the discarded pieces have a combined length greater than 7, they can't be combined to form a longer plank.

# Input and Output
# Program input and output will make use of stdio streams (System.in and System.out in Java) i.e., not file I/O.

# Input consists of a series of integer values, each on a separate line. The first value is N, the number of planks in stock, followed by the lengths of those planks, L1, ..., LN, followed by K, the minimum number of planks required.

# Output consists of a single integer, M, the maximum possible length that will allow K planks to be delivered, followed by a line break — in Java, for example, use System.out.println, not System.out.print. The automatic marker expects this precise form.

# Sample Input:

# 4
# 10
# 14
# 15
# 11
# 6

# Sample output:

# 7

# Constraints
# 1 ≤ N ≤ 10,000
# 1 ≤ Li ≤ 1,000,000,000
# 1 ≤ K ≤ 10,000,000

# The answer, M, will be bounded by:

# 1 ≤ M ≤ 10,000,000