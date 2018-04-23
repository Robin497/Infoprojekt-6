
package kleinster.kreis;

public class KleinsterKreis {

    public static void main(String[] args) {
        int anzahlP = 10;
        Tuple[] points = new Tuple[anzahlP];
        
        for (int i = 0; i < anzahlP; i++) {
            points[i] = new Tuple((int)(Math.random()*100),(int)(Math.random()*100));
        }
        System.out.println(points[1].x);
        int greatestX = 0;
        int smallestX = 100;
        for (int i = 0; i < anzahlP; i++) {
            int b = points[i].x;
            //f(points[i].x < smallestX)   
                
        }
        
    }
    
}
