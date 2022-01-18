def setup():
    size(800,800)
    background(255)


def draw():
    if  mousePressed:
        fill(150,150,150)
    else:
        fill(122,42,25)
    line(mouseX, mouseY, 80, 80)
    ellipse(random(0,400),random(0,400),80,80)
    rect(random(500,800),random(0,800),80,80)
    
