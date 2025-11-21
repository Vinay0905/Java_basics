# The program must accept N integers and for each integer, the program must print the next immediate larger integer on the right. If there is no such immediate larger integer, then the current integer value itself is printed as the output.
# Boundary Condition(s):
# Input Format:
# The first line contains N.
# The second line contains N integers separated by a space.
# Output Format:
# The first line contains N integers separated by a space.
# Example Input/Output 1:
# Input:
# 7
# 10 45 20 40 60 50 100
# Output:
# 45 60 40 60 100 100 100
# Explanation:
# The next immediate larger number for 10 is 45.
# The next immediate larger number for 45 is 60 (As 20 and 40 are smaller than 45).
# Similarly for 20 it is 40, for 40 it is 60.
# For 60 it is 100 (As 50 is less than 60), for 50 it is 100.
# For 100 as there is no larger integer on the right, 100 itself is printed.


n = int(input())
arr = list(map(int, input().split()))
res = arr[:]  # Initialize result with original array

stack = []

for i in range(n):
    # While stack not empty and current is greater than element at index on top of stack
    while stack and arr[i] > arr[stack[-1]]:
        res[stack[-1]] = arr[i]
        stack.pop()
    stack.append(i)

print(' '.join(map(str, res)))
