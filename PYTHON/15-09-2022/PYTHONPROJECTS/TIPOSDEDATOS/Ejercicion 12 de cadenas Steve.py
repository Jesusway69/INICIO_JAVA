import os
os.system('cls')

ca = input('ingrese cadena: ')
su = input('ingrese subcadena: ')

s = ca.split(' ')
if s[0] == su:
    print('correcto')
else:
    print('no correcto')

if ca[0:len(su)]  == su:
    print('correcto')
else:
    print('no correcto')



