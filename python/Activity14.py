def fib_fun(a):
    if(a-2<=0):
        return 1
    else:
        return fib_fun(a-1)+fib_fun(a-2)
nm=int(input('Enter the number to find out fib'))
for i in range(nm+1):
    val=i+1
    print(fib_fun(val))
