dct={
    "apple":{
        "price":10
    },
    "banana":{
        "price":16
    }
}
name=input("Enter Fruite Name").lower()
if(name in dct):
    print("Available")
else:
    print("Not Available")
