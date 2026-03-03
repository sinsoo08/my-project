import sys
input = sys.stdin.readline
n = int(input())
for _ in range(n):
    m = int(input())
    mission = []
    for _ in range(m):
        mission.append(list(map(int, input().split())))
    k, d, a = map(int, input().split())
    reward = 0
    for mk, md, ma in mission:
        score = (mk*k - md*d + ma*a)
        if score > 0:
            reward += score
    print(reward)