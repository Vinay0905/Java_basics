# There are N wind mills in a straight line from left to right. The height of all N wind mills is passed as the input. For each wind-mill M, the program must print the number of wind-mills which are shorter than the current wind-mill present to the left of M.
# Note: If private test cases fail, implement the logic using an algorithm which is efficient - complexity is less than O(n²)
# Boundary Condition(s):
# 1 <= N <= 10 ^ 6
# 1 <= Height of wind mill <= 10^5
# Input Format:
# The first line contains N.
# The second line contains the height of the N wind-mills separated by a space.
# Output Format:
# The first line contains N integer values (indicating the count of shorter wind-mills to the left) separated by a space.
# Example Input/Output 1:
# Input:
# 6 100 200 105 110 120 250
# Output: 010125
# Explanation:
# 1 st wind-mill height is 100 and there are no wind-mills to the left. Hence 0 is printed.
# 2nd wind-mill height is 200 and there is 1 wind-mill of height 100 which is shorter on the left. Hence 1 is printed.
# 3rd wind-milll height is 105 and there are no wind-mills to the left which are shorter (The second wind-mill of height 200 is taller than 105. Hence the 1 st wind-mill of height 100 is not considered).
# 4th wind-mill height is 110 and there is 1 wind-mill of height 105 which is shorter on the left. Hence 1 is printed.
# 5th wind-mill height is 120 and there are 2 wind-mills of height 105 and 110 which are shorter on the left. Hence 2 is printed.
# 6th wind-mill height is 250 and there are 5 wind-mills of height 100 200 105 110 and 120 which are shorter on the left. Hence 5 is printed.









n = int(input())
h = list(map(int, input().split()))
res = []

for i in range(n):
    stack = []
    j = i - 1
    count = 0
    # Use stack to simulate the contiguous scan
    while j >= 0 and h[j] < h[i]:
        stack.append(h[j])
        count += 1
        j -= 1
    res.append(str(count))

print(''.join(res))
