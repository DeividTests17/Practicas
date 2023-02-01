class User:
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
    opcion = int(input("1)Crear lista\n0)Salir\n"))
    if opcion == 1:
        lista = []
        while z == 0:
            Opcion = int(
                input(
                    "\n 1) Añadir usuario\n 2) Eliminar datos\n 3) Modificar usuario\n 4) Mostrar datos\n 5) Datos inversos\n 6) Limpiar lista\n 7) Eliminar lista\n 8) Salir\n"
                )
            )

            if Opcion == 1:
                n = input("Ingrese el nombre: ")
                a = input("Ingrese su apellido: ")
                usu = User(n, a)
                lista.append(usu)
                print("\nUsuario agragado con exito\n")

            elif Opcion == 2:
                print("\nQué deseas eliminar\n")
                eliminar = int(input("Opciones\n 1) Nombre\n 2) Apellido\n"))
                posicion = int(input("\nSelecciona la persona\n"))
                if eliminar == 1:
                    lista[posicion].nom = ""
                elif eliminar == 2:
                    lista[posicion].ape = ""

            elif Opcion == 3:
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

            elif Opcion == 4:
                print("\nUsuarios guardados\n")
                Mostrar()

            elif Opcion == 5:
                print("\nLista inversa\n")
                lista.reverse()
                Mostrar()

            elif Opcion == 6:
                print("\nLimpiar la lista\n")
                lista.clear()

            elif Opcion == 7:
                print("\nEliminar lista\n")
                del lista[:]

            elif Opcion == 8:
                exit()
            else:
                print("Opción invalida")
    elif opcion == 0:
        exit()
