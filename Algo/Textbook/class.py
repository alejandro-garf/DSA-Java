
class Point: #Name of the class
    def __init__(self, x, y): #Member Function - Special Function called to
        self.x = x   #data member                     #initialize a new instance of the Point class
        self.y = y     #data member

    def quadrant(self): # Member Function - regular function
        if self.x >= 0:
            if self.y >= 0:
                return 1
            else:
                return 4
        else:
           if self.y >= 0:
                return 2
           else:
                return 3
           
P = Point(3,4) # creates a new point object bound to the variable P with 3 and 4 for the x and y data members

P.quadrant() # acceesses the data members and returns one 