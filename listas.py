class Usuario:
    def __init__(self, nombre, apellido):
        self.nom = nombre
        self.ape = apellido
x = 0
z = 0
lista = []
def Mostrar():
    for x in lista:
        print(f"{x.nom}     {x.ape}")
while x == 0:
    opcion = int(input("1) Crear lista 2) ya hay una lista\n 0) Salir\n"))
    if opcion == 1&&2:
        lista = []
        while z == 0:
            subOpcion = int(input("\n 2) Añadir usuario\n 3) Eliminar datos\n 4) Modificar usuario\n 5) Mostrar datos\n 6) Datos inversos\n 7) Limpiar lista\n 8) Eliminar lista\n 9) Salir\n"))
            if subOpcion == 2:
                n = input("Ingrese el nombre: ")
                a = input("Ingrese su apellido: ")
                usu = Usuario(n, a)
                lista.append(usu)
                print("\nUsuario agragado con exito\n")
            elif subOpcion == 3:
                print("\nQué deseas eliminar\n")
                eliminar = int(input("Opciones\n 1) Nombre\n 2) Apellido\n"))
                posicion= int(input("\nSelecciona la persona\n"))
                if eliminar == 1:
                    lista[posicion].nom = ""
                elif eliminar == 2:
                    lista[posicion].ape = ""
            elif subOpcion == 4:
                print("\n¿Qué deseas modificar?\n")
                nuevo = int(input("Elige una opción\n 1) Nombre\n 2) Apellido\n"))
                if nuevo == 1:
                    nuevoNombre = input("Nuevo nombre: ")
                    for x in range(len(lista)):
                        lista[x].nom = nuevoNombre
                    print("\nCorrecto")
                elif nuevo == 2:
                    nuevoApellido = input("Nuevo apelllido: ")
                    for x in range(len(lista)):
                        lista[x].ape = nuevoApellido
                    print("Correcto")
            elif subOpcion == 5:
                print("\n*** Mostrando datos Guardados ***\n")
                Mostrar()
            elif subOpcion == 6:
                print("\nLista inversa\n")
                lista.reverse()
                Mostrar()   
            elif subOpcion == 7:
                print("\nLimpiar la lista\n")
                lista.clear()
            elif subOpcion == 8:
                print("\nEliminar lista\n")
                del lista[:]
            elif subOpcion == 9:
                exit()
            else:
                print("Opción invalida")
    elif opcion == 0:
        exit()