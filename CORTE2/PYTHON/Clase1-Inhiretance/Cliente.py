from Person import Person

class Cliente(Person):

    def __init__(self, id_Cliente, fecha_registro,vip, nombre, genero, edad, direccion):

        super().__init__(nombre, genero, edad, direccion)

        self.id_cliente = id_Cliente
        self.fecha_registro = fecha_registro
        self.vip = vip

    def mostrar_datos(self):
        
        super().mostrar_datos()
        print(f"ID Cliente: {self.id_cliente}")
        print(f"Fecha de registro: {self.fecha_registro}")
        print(f"VIP: {'Si' if self.vip else 'No'}")