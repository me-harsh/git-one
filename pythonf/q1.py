test = int(input("enter number of test: "))

for i in range(0,test):
    n = int(input("enter length of string: "))
    s = input("enter the string: ")
    
    if s[int(n/2):]+s[:int(n/2)] == s:
        print("YES")
    else:
        print("NO")
        