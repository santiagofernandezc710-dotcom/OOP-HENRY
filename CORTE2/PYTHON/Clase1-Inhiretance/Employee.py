from Person import Person

class Employee(Person):

    def __init__(self, id_empleado, sueldo, nombre, genero, edad, direccion):
        super().__init__(nombre, genero, edad, direccion)
        self.id_empleado = id_empleado
        self.sueldo = sueldo

    def mostrar_datos(self):
        super().mostrar_datos()
        print(f"ID Empleado: {self.id_empleado}")
        print(f"Sueldo: {self.sueldo}")

