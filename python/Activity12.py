def add_ten(val):
    if(val<=0):
        return 0
    else:
        return add_ten(val-1)+val

num=int(input('Enter the amount to see sum'))
add_ten(num)
