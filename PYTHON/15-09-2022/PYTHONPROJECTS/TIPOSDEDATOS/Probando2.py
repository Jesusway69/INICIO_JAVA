from tkinter import *

root = Tk()
root.title("SATANAS TE AMA")
root.iconbitmap("overwatch.ico")
root.resizable(1, 1)
Label(root, text="Lo que os salga de las pelotas").pack(anchor=NW)
label=Label(text="Esto es una etiqueta cargada en una variable")
label.pack(anchor=CENTER)
Label(root, text="Esta es la etiqueta final").pack(anchor=SE)
label.config(fg="white", bg="blue", font=("verdana", 10))
procesador = Text(root)
procesador.pack()
procesador.config(width=12, height=12, font=("consolas", 10), padx=20, pady=20, selectbackground="blue")

num = StringVar
Entry(root, justify=CENTER, width=40, textvariable=num).pack()
Button(root, text="Enviar").pack()


root.mainloop()