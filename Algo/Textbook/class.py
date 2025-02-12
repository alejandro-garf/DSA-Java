
@total_ordering
class Point: #Name of the class
    def __init__(self, x, y): #Member Function - Special Function called to
        self.x = x   #data member                     #initialize a new instance of the Point class
        self.y = y     #data member


    def __len___(self):  #implements the lenght interface - we can now use the lenght function with our Point member objects
        return 2          ## Returns two since a planar point always has two coordinates
    
    def __lt__(self, other):  # supports all five comparison operators
        return self.x < other.x
    def __eq__(self, other):
        return self.x == other.x

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