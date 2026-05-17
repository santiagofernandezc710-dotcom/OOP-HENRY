class VectorInt:
    def __init__(self, n):
        self.n = n
        self.data = [0] * n

    def suma(self):
        s = 0
        for x in self.data:
            s += x
        return s

    def promedio(self):
        if self.n == 0:
            return 0.0
        return self.suma() / self.n

    def imprimir(self):
        print(self.data)


v = VectorInt(5)
v.data[0] = 10
v.data[1] = 20
v.data[2] = 30
v.data[3] = 40
v.data[4] = 50

v.imprimir()
print("Suma =", v.suma())
print("Promedio =", v.promedio())