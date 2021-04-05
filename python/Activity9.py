lst1=[1,2,3,4,5,6,7,8,9,10]
lst2=[11,12,13,14,15,16,17,18,19,20]

lst3=[]
for a in lst1:
    if(a%2==1):
        lst3.append(a)
for a in lst2:
    if(a%2==0):
        lst3.append(a)
print(lst3)
