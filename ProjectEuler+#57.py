N=int(raw_input().strip())
exp, a, b, tot = 1, 3, 2, 0
while exp <= N:
	if len(str(a)) > len(str(b)):
		print exp
	exp, a, b = exp + 1, a + b + b, a + b
