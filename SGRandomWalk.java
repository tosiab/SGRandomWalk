public class SGRandomWalk {
    public static void main(String[]args){
        /*Rectangle box = new Rectangle(150,150,500,500);
        box.draw();
        Ellipse egg = new Ellipse(100,100,40,60);
        egg.setColor(Color.YELLOW);
        egg.fill();
        egg.grow(5,5);*/
        Rectangle field = new Rectangle(0,0,300,300);
        field.setColor(Color.BLUE);
        field.draw();
        field.fill();
        Ellipse circle = new Ellipse(75,75,100,100);
        circle.setColor(Color.PINK);
        circle.draw();
        circle.fill();
        int randx = (int)(Math.random()*21)-10;
        int randy = (int)(Math.random()*21)-10;


    }
}
