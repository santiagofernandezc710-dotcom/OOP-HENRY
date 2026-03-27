class Person:
    def __init__(self):
        self.name = ""
        self.age = 0

    def say_hello(self):
        print(f"Hi, I'm {self.name} and I'm {self.age} years old.")
   
def main():
    p1 = Person()
    p1.name = "Ana"
    p1.age = 20
    p1.say_hello()

if __name__ == "__main__":
    main()