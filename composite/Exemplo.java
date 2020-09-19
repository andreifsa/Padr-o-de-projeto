interface Graphic is
    method move(x, y)
    method draw()

class Dot implements Graphic is
    field x, y

    constructor Dot(x, y) { ... }

    method move(x, y) is
        this.x += x, this.y += y

    method draw() is
        
class Circle extends Dot is
    field radius

    constructor Circle(x, y, radius) { ... }

    method draw() is
        
class CompoundGraphic implements Graphic is
    field children: array of Graphic

   
    method add(child: Graphic) is
        
    method remove(child: Graphic) is
        

    method move(x, y) is
        foreach (child in children) do
            child.move(x, y)

    method draw() is
      
class ImageEditor is
    field all: array of Graphic

    method load() is
        all = new CompoundGraphic()
        all.add(new Dot(1, 2))
        all.add(new Circle(5, 3, 10))
        // ...
        
    method groupSelected(components: array of Graphic) is
        group = new CompoundGraphic()
        foreach (component in components) do
            group.add(component)
            all.remove(component)
        all.add(group)
       
        all.draw()
