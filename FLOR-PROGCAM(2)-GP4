import turtle

t = turtle.Turtle()
t.speed(10)
turtle.bgcolor("black")


colors = ["magenta", "red", "orange", "purple", "blue", "pink"]

for i in range(36):
    t.color(colors[i % len(colors)])
    t.circle(100, 60)   # dibuja medio pétalo
    t.left(120)
    t.circle(100, 60)   # termina el pétalo
    t.left(10)


t.penup()
t.goto(0, -20)
t.pendown()
t.color("yellow")
t.begin_fill()
t.circle(40)
t.end_fill()


t.width(12)
t.color("green")
t.penup()
t.goto(0, -60)
t.pendown()
t.right(90)
t.forward(200)


for angle in [45, -45]:
    t.penup()
    t.goto(0, -150)
    t.setheading(angle)
    t.pendown()
    t.begin_fill()
    t.circle(60, 90)
    t.left(90)
    t.circle(60, 90)
    t.end_fill()

turtle.done()
