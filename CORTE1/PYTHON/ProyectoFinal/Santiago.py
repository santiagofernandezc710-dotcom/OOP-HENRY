# --- CONSTANTES ---
PERSONAS = 5
NOTAS_PERSONAS = 3

# --- CLASE ESTUDIANTE ---
class Estudiante:
    def __init__(self, codigo="", nombre="", edad=0):
        self.codigo = codigo
        self.nombre = nombre
        self.edad = edad


# --- CLASE VISTA ---
class Vista:
    def bienvenida(self):
        print("****Bienvenido****")

    def menu(self):
        print("\n---Menu---")
        print("1. Registrar Estudiante")
        print("2. Buscar Estudiante")
        print("3. Mostrar todos los Estudiantes")
        print("4. Asignar Notas")
        print("5. Promediar Notas")
        print("6. Salir")

    def salir(self):
        print("Saliendo de la aplicacion...")

    def error(self):
        print("Esto no se puede, intenta otra vez.")

    def registrar_estudiante(self):
        print("\n---Registrar Estudiante---")

    def pide_codigo(self):
        return input("Ingrese el codigo: ")

    def pide_nombre(self):
        return input("Ingrese el nombre: ")

    def pide_edad(self):
        return int(input("Ingrese Edad: "))

    def busca_estudiante(self):
        print("\n---Buscar Estudiante---")

    def estudiante_encontrado(self):
        print("El estudiante ha sido encontrado")

    def error_codigo(self):
        print("Este codigo no existe")

    def mostrar_estudiantes(self):
        print("\n---Mostrando Estudiantes---")

    def error_muestra(self):
        print("No hay estudiantes registrados")

    def ingresar_nota(self):
        return float(input("Ingrese nota: "))

    def nota_registrada(self):
        print("Nota registrada con exito!")

    def no_promedio(self):
        print("No se puede promediar porque el alumno no tiene notas")


# --- CLASE DATO ---
class Dato:
    def __init__(self):
        self.estudiantes = []
        self.notas = [[0]*NOTAS_PERSONAS for _ in range(PERSONAS)]


# --- CLASE REGISTRA ---
class Registra:
    def registrar(self, d, codigo, nombre, edad):
        if len(d.estudiantes) < PERSONAS:
            d.estudiantes.append(Estudiante(codigo, nombre, edad))


# --- CLASE BUSCA ---
class Busca:
    def buscar(self, d, codigo):
        for i, est in enumerate(d.estudiantes):
            if est.codigo == codigo:
                return i
        return -1


# --- CLASE NOTA ---
class Nota:
    def __init__(self):
        self.vista = Vista()

    def notas(self, d, posicion):
        if posicion != -1:
            for i in range(NOTAS_PERSONAS):
                d.notas[posicion][i] = self.vista.ingresar_nota()
            self.vista.nota_registrada()
        else:
            self.vista.error_muestra()


# --- CLASE MUESTRA ---
class Muestra:
    def __init__(self):
        self.vista = Vista()

    def muestra(self, d):
        if len(d.estudiantes) == 0:
            self.vista.error_muestra()
        else:
            for i, est in enumerate(d.estudiantes):
                print(f"\nNombre: {est.nombre}")
                print(f"Edad: {est.edad}")
                print(f"Codigo: {est.codigo}")
                print("Notas:", d.notas[i])


# --- CLASE PROMEDIO ---
class Promedio:
    def __init__(self):
        self.vista = Vista()

    def promediar(self, d, posicion):
        if posicion != -1:
            suma = sum(d.notas[posicion])
            promedio = suma / NOTAS_PERSONAS
            print("Promedio:", promedio)
        else:
            self.vista.no_promedio()


# --- MAIN ---
def main():
    vista = Vista()
    registra = Registra()
    dato = Dato()
    busca = Busca()
    muestra = Muestra()
    nota = Nota()
    promedio = Promedio()

    while True:
        vista.menu()
        opcion = int(input("Seleccione opcion: "))

        if opcion == 1:
            vista.registrar_estudiante()
            c = vista.pide_codigo()
            n = vista.pide_nombre()

            while True:
                e = vista.pide_edad()
                if 0 < e <= 100:
                    break
                vista.error()

            registra.registrar(dato, c, n, e)

        elif opcion == 2:
            vista.busca_estudiante()
            codigo = input("Ingrese codigo: ")
            pos = busca.buscar(dato, codigo)

            if pos != -1:
                vista.estudiante_encontrado()
                est = dato.estudiantes[pos]
                print(f"Nombre: {est.nombre}")
                print(f"Edad: {est.edad}")
                print(f"Codigo: {est.codigo}")
            else:
                vista.error_codigo()

        elif opcion == 3:
            vista.mostrar_estudiantes()
            muestra.muestra(dato)

        elif opcion == 4:
            codigo = input("Ingrese codigo del estudiante: ")
            pos = busca.buscar(dato, codigo)
            nota.notas(dato, pos)

        elif opcion == 5:
            codigo = input("Ingrese codigo del estudiante: ")
            pos = busca.buscar(dato, codigo)
            promedio.promediar(dato, pos)

        elif opcion == 6:
            vista.salir()
            break

        else:
            vista.error()


if __name__ == "__main__":
    main()