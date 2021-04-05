cont='Y'
while(cont=='Y'):
    usr1=int(input("Player 1 choice 1.Rock\n2.Paper\n3.Scissors"))
    usr2=int(input("Player 2 choice 1.Rock\n2.Paper\n3.Scissors"))
    if(usr1==1):
        if(usr2==1):
            print('Tie')
        elif(usr2==2):
            print('Player 2 wins: Rock vs Paper')
        elif(usr2==3):
            print('Player 1 wins: Rock vs Scissors')
        else:
            print('Invalid Response.')
    elif(usr1==2):
        if(usr2==2):
            print('Tie')
        elif(usr2==1):
            print('Player 1 wins: Paper vs Rock')
        elif(usr2==3):
            print('Player 2 wins: Paper vs Scissors')
        else:
            print('Invalid Response.')
    elif(usr1==3):
        if(usr2==3):
            print('Tie')
        elif(usr2==2):
            print('Player 1 wins: Scissors vs Paper')
        elif(usr2==1):
            print('Player 2 wins: Scissors vs Rock')
        else:
            print('Invalid Response.')        
    else:
        print('Invalid response')
    cont=input("Do you want to continue(Y/N) :")
