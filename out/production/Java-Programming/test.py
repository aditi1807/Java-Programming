from collections import defaultdict 
 
def solve(N, src, dest): 
    graph = defaultdict(list) 
     
    tx = defaultdict(int) 
 
    for i in range(N - 1): 
        c1, c2, goods, tax = dest[i] 
        graph[c1].append((-1 * goods, tax, c2)) 
        tx[c2] = tax 
 
 
    route = [] 
    def dfs(city): 
        route.append(city) 
        for n in sorted(graph[city]): 
            dfs(n[2]) 
            route.append(city) 
    dfs(src) 
    total_tax = 0 
    for c in route[1:]: 
        total_tax += tx[c] 
 
    return route, total_tax 
 
 
 
N = int(input()) 
cons = [] 
 
for _ in range(N-1): 
    l = input() 
    ls = l.split() 
    cons.append((ls[0], ls[1], int(ls[2]), int(ls[3]))) 
   
 
 
ans, t = solve(N, cons[0][0], cons) 
 
print("-".join(ans)) 
print(t, end="")