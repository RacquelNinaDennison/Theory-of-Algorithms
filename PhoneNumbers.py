dictionary = {
    "2": ["a", "b", "c"],
    "3": ["d", "e", "f"],
    "4": ["g", "h", "i"],
    "5": ["j", "k", "l"],
    "6": ["m", "n", "o"],
    "7": ["p", "q", "r", "s"],
    "8": ["t", "u", "v"],
    "9": ["w", "x", "y", "z"],
}


def phoneNumber(depth, string, currentSubstring):
    if depth == len(string):
        return [currentSubstring]

    ls = []
    currentChar = string[depth]
    currentCharArray = dictionary[currentChar]
    for i in range(len(currentCharArray)):
        letterPermute = currentCharArray[i]
        tempString = currentSubstring + letterPermute
        finalPermute = phoneNumber(depth+1,string, tempString)
        ls += finalPermute
    return ls


def main():
    phoneMyNumber ="7227835"
    phoneNumberPossible = phoneNumber(0, phoneMyNumber,"")
    print(phoneNumberPossible)

if __name__ == "__main__":
    main()





