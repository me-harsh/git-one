n = int(input("Enter number of stars in first row:"))

for i in range(0,n):
    if i==0 or i==n-1:
        print("*"*n)
        continue
    for j in range(0,n-1-i):
        print(" ",end='')
    print("*")



for i in range(0,11):
    for j in range(0, 6-i if i<=5 else i-4):
        print((chr)(65+j),end='')

    if i==0 or i==10:
        for j in range(5, 0, -1):
            print((chr)(64+j),end='')

    else:
        print(" "*((2*i)-1 if i<=5 else 9-(2*(i-5))),end='')

        for j in range(6-i if i<=5 else i-4, 0, -1):
            print((chr)(64+j),end='')
    print()
