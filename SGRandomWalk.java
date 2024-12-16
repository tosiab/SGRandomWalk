public class SGRandomWalk {
    public static void main(String[]args){
        boolean escaped = false;
        int tries = 0;
        Rectangle field = new Rectangle(0,0,300,300);
        field.setColor(Color.BLUE);
        field.draw();
        field.fill();
        Ellipse circle = new Ellipse(75,75,100,100);
        circle.setColor(Color.PINK);
        circle.draw();
        circle.fill();
        Ellipse dot = new Ellipse(125,125,10,10);
        dot.setColor(Color.MAGENTA);
        dot.draw();
        dot.fill();
        while(escaped==false){
            int randx = (int)(Math.random()*21)-10;
            int randy = (int)(Math.random()*21)-10;
            tries += 1;
            dot.translate(randx,randy);
        }

    }
}
