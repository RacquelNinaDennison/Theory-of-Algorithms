def BinarySearch(arr,lower, upper,searchValue):
    if upper >= lower:
        middle = (lower+upper-1)//2
        if(arr[middle]==searchValue):
            return middle
        elif(arr[middle]> searchValue):
            return BinarySearch(arr,lower,middle-1,searchValue)
       
        else:
            return BinarySearch(arr,middle+1,upper,searchValue)
    
    else:
        return -1


def main():
    arr = [1,2,3,4,56,78,79,100]
    print(BinarySearch(arr,0,len(arr),78))

if __name__ =="__main__":
    main()
        
    