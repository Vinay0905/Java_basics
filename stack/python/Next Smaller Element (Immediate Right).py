# The program must accept N integers and for each integer, the program must print the next immediate smaller integer on the right. If there is no such immediate smaller integer, then the current integer value itself is printed as the output.
# Boundary Condition(s):
# 1 <= N <= 10 ^ 5
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
# 10 20 20 40 50 50 100
# Explanation:
# The next immediate smaller integer for 10 is 10 (As no other integer is less than 10).
# The next immediate smaller number for 45 is 20.
# Similarly for 20 it is 20, for 40 it is 40.
# For 60 it is 50 and for 50 it is 50 itself.
# For 100 as there is no smaller integer on the right, 100 itself is printed.



n = int(input())
arr = list(map(int, input().split()))
res = arr[:]  # By default, each value is itself (if no smaller found)
stack = []

for i in range(n):
    while stack and arr[i] < arr[stack[-1]]:
        res[stack[-1]] = arr[i]
        stack.pop()
    stack.append(i)

print(' '.join(map(str, res)))
