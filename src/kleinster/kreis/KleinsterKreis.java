
package kleinster.kreis;

public class KleinsterKreis {

    public static void main(String[] args) {
        int anzahlP = 10;
        Tuple[] points = new Tuple[anzahlP];
        
        for (int i = 0; i < anzahlP; i++) {
            points[i] = new Tuple((int)(Math.random()*101),(int)(Math.random()*101));
             System.out.println(points[i].x+","+points[i].y);
        }

        int greatestX = 100;
        int smallestX = 0;
        for (int i = 0; i < anzahlP; i++) {
           
            if(points[i].x > smallestX) 
            {
                smallestX=points[i].x;
            }
                
        }
        System.out.println(smallestX);
           for (int i = 0; i < anzahlP; i++) {
           
            if(points[i].x < greatestX) 
            {
                greatestX=points[i].x;
            }
                
        }
        System.out.println(greatestX);
    }
    
}
