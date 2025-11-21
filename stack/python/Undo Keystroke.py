# A series of keystrokes as a string is given as the input to the program. The character * represents undo action to clear the last entered keystroke. The program must print the string typed after applying the undo operations as the output.
# Boundary Condition(s):
# 1 <= Length of each string <= 100
# Input Format:
# The first line contains the string.
# Output Format:
# The first line contains the string after applying the undo operations as the output.
# Example Input/Output 1:
# Input:
# lucky draty**W
# Output:
# lucky draw
# Example Input/Output 2:
# Input:
# trui**yhap*rd
# Output: tryhard


s = input().strip()
stack = []

for ch in s:
    if ch == '*':
        if stack:
            stack.pop()
    else:
        stack.append(ch)

print(''.join(stack))
