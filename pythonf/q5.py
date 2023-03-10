class sub:  
    def funct_1(self, s1):  
        return self.f2([], sorted(s1))  
 
    def funct_2(self, curr, s1):  
        if s1:  
            return self.f2(curr, s1[1:]) + self.f2(curr + [s1[0]], s1[1:])  
        return [curr]  
a = input('Please enter the elements split by single-spaces: ').split(' ')
print("Subsets: ")
print(sub().funct_1(a))