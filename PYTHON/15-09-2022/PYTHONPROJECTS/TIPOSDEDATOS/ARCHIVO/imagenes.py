import pandas as mc
import importlib

importlib.reload(mc)



import math
import pandas as pd
import os

os.system('cls')

x1 = [2,4,5,8,9]
y2 = [8,9,12,7,5]

angulo = []
radio = []

for x,y in zip(x1,y2):
    angu = round(math.atan(y/x) * 180 / math.pi,2)
    rad = round(math.sqrt(x**2 + y**2))
    angulo.append(angu)
    radio.append(rad)

print(angulo)
print(radio)

cartesiana_d = {'x':x1, 'y':y2}
polares_d = {'a':angulo, 'r':radio}

datos_d = {'X':x1, 'Y':y2, 'ANGULO':angulo,'RADIO':radio}
df = pd.DataFrame(datos_d)

print(df)
