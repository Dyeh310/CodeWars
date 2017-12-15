#Emulates a like button depending on the amount of people used
names = ['Alex', 'Jacob', 'Mark', 'Max']

def likes(names):
    
    textToReturn = ""
    
    if not names:
        textToReturn='no one likes this'
    elif len(names)== 1:
        textToReturn = names[0] + ' likes this'
    elif len(names) == 2:
        textToReturn = names[0] + ' and ' + names[1] + ' like this'
    elif len(names) == 3:
        textToReturn = names[0] + ', ' + names[1] + ' and ' + names[2] + ' like this'
    else:
        textToReturn = names[0] + ', ' + names[1] + ' and ' + str(len(names) - 2) + ' others like this'
    return textToReturn


print(likes(names))
