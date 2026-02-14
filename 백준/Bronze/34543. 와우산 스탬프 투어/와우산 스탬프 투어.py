n = int(input())
w = int(input())
res = n * 10

if n > 2:
    res += 20
if n == 5:
    res += 50
if w > 1000:
    res -= 15
print(max(res, 0))