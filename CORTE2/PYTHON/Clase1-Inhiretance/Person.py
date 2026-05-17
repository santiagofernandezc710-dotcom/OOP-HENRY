class Person:
    def __init__(self, nombre, genero, edad, direccion):
        self._nombre = nombre
        self._genero = genero
        self._edad = edad
        self._direccion = direccion
    
    def mostrar_datos(self):
        print(f"Nombre: {self._nombre}")
        print(f"Genero: {self._genero}")
        print(f"Edad: {self._edad}")
        print(f"Direccion: {self._direccion}")