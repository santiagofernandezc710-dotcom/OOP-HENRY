from Person import Person
from Employee import Employee 
from Cliente import Cliente

def imprimir(persona):

    persona.mostrar_datos() 
p1 = Person("Fabio", "M", 25, "Madrid")
e1 = Employee(101, 3500.50, "Alex", "M", 32, "Bogota")
c1 = Cliente(201, "2026-04-02", True, "Laura", "F", 28, "Villavicencio")

print("===== Objeto Person =====")
p1.mostrar_datos()

print("\n===== Objeto Employee =====")
e1.mostrar_datos()

print("\n===== Objeto Cliente =====")
c1.mostrar_datos()

print("\n===== Polimorfismo =====")
imprimir(p1)
imprimir(e1)
imprimir(c1)