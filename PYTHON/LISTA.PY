*****************
***   LISTA   ***
*****************

- ELIMINAR UN ELEMENTO DE UNA LISTA

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
del nombres_l[3]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'María']
del nombres_l[3]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel']

- ELIMINAR MUCHOS ELEMENTOS DE LA LISTA A LA VEZ

(1)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l[2:] = []
print(nombres_l) # ['Luis', 'Carlos']

(2)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l.remove('Luis')
print(nombres_l) # ['Carlos', 'Miguel', 'Carlos', 'María']

- GENERAR UNA COPIA PARA SALVAR EL ORIGINAL
nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
copia1_l = nombres_l.copy()
copia2_l = nombres_l
nombres_l[1:3] = []
print(nombres_l) # ['Luis', 'Carlos', 'María']
print(copia1_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María']
print(copia2_l) # ['Luis', 'Carlos', 'María']

- AÑADIR ELEMENTOS A UNA LISTA

(1)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l = nombres_l + ['Ismael']
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael']

(2)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l.append('Ismael')
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael']

(3)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l.append('Ismael')
nombres_l.append(['Ismael','Miguel','Miguel'])
nombres_l.append(5)
nombres_l.append(5.1)
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael', ['Ismael', 'Miguel', 'Miguel'], 5, 5.1]

(4)

nombres_l = ['Luis','Carlos','Miguel','Carlos','María']
nombres_l = nombres_l + ['Ismael',6,1.3,['Andres','Vanessa']]
print(nombres_l) # ['Luis', 'Carlos', 'Miguel', 'Carlos', 'María', 'Ismael', 6, 1.3, ['Andres', 'Vanessa']] 

