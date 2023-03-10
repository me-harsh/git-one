def int_to_roman(input):
    if type(input) != int:
        print("enter integer")
    if not 0 < input < 4000:
        print("number must be between 1 and 3999")
    ints = (1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    roms = ("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    result = ""
    for i in range(len(ints)):
        count = input // ints[i]
        result += roms[i] * count
        input -= ints[i] * count
    return result
dec_to_rom =int (input("Enter your decimal no.:"))
print(int_to_roman(dec_to_rom))