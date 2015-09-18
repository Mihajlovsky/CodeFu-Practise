class LargestPart:
    def getLargest(_self_, array):
        num=len(array)//3
        first=0
        second=0
        third=0

        for i in range (0,num):
            first+=array[i]
            second+=array[i+num]
            third+=array[i+num*2]


        d = {'First': first, 'Second': second, 'Third': third}
        unique=len(set(d.values()))

        if (unique==3):
            return max(d, key=d.get)

        else:
            return"Ambiguous"


example=LargestPart()
print(example.getLargest([0, 2, 2, 1, -2, 0]))
