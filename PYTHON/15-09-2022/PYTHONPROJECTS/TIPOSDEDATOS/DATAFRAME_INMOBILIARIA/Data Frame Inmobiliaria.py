import os
import pandas as pd

# Mostrar el contenido del archivo inmobiliaria.csv
def ejercicio01():
    df = pd.read_csv('DATAFRAME_INMOBILIARIA/inmobiliaria.csv',delimiter=';')
    print(df)

# Mostrar una cantidad de columnas determinadas
def ejercicio02():
    df = pd.read_csv('DATAFRAME_INMOBILIARIA/inmobiliaria.csv',delimiter=';')
    df1 = df[['Referencia','Fecha Alta','Tipo']][0:100]
    print(df1)

# Mostrar una cantidad de columnas determinadas y filas
def ejercicio03():
    df = pd.read_csv('DATAFRAME_INMOBILIARIA/inmobiliaria.csv',delimiter=';')
    df1 = df[['Referencia','Fecha Alta','Tipo']][14:21]
    print(df1)

# Mostrar la salida con un formato personalizado
def ejercicio04():
    df = pd.read_csv('DATAFRAME_INMOBILIARIA/inmobiliaria.csv',delimiter=';')
    df1 = df[['Referencia','Fecha Alta','Tipo']][14:21]
    for i in range(14,21):
        print('%10s  %10s  %-10s' % (df1.loc[i,'Referencia'], df1.loc[i,'Fecha Alta'], df1.loc[i,'Tipo']))

# Mostrar la salida con un formato personalizado
def ejercicio05():
    df = pd.read_csv('DATAFRAME_INMOBILIARIA/inmobiliaria.csv',delimiter=';')
    df = df.loc[0:1000]
    for i in range(len(df)): # 10, 11, 12, ... 1000
        print('%10d  %-10s  %-10s' % (df.iloc[i,0], df.iloc[i,8], df.iloc[i,1]))

def main():
    os.system('cls')
    pd.options.display.max_rows = None
    pd.options.display.max_columns = None

    print('Cantidad Filas   : ',pd.options.display.max_rows)
    print('Cantidad Columnas: ', pd.options.display.max_columns)
    ejercicio05()
    os.system('pause')

main()






