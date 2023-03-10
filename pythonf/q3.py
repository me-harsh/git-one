import operator
d={}
num=int(input("enter the length of the dictionary:"))
for i in range(num):
    key=int(input("enter your key"))
    value=int(input("enter your value"))
    d[key]=value


print('Original dictionary:\n',d, end="\n\n")

sorted_by_keys =  dict(sorted(d.items()))
print('Dictionary in ascending order by keys:\n',sorted_by_keys, end="\n\n")

sorted_by_values = dict(sorted(d.items(), key=operator.itemgetter(1)))
print('Dictionary in ascending order by values:\n',sorted_by_values)