package kleinster.kreis;

public class KleinsterKreis {
    public static int fensterGröße = 500; //Problem
    public static int anzahlP = 10;
    public static void main(String[] args) {
        
        
        Tuple[] points = new Tuple[anzahlP];
        Tuple center;

        for (int i = 0; i < anzahlP; i++) {
            points[i] = new Tuple((int) (Math.random() * fensterGröße), (int) (Math.random() * fensterGröße));
            System.out.println(points[i].x + "," + points[i].y);
        }
        int greatestX = 0;
        int smallestX = fensterGröße;
        int greatestY = 0;
        int smallestY = fensterGröße;
        int KoX=0;
        int koX=0;
        for (int i = 0; i < anzahlP; i++) {
            if (points[i].x < smallestX) {
                smallestX = points[i].x;
            }
        }

        for (int i = 0; i < anzahlP; i++) {
            if (points[i].x > greatestX) {
                greatestX = points[i].x;
            }
        }

        for (int i = 0; i < anzahlP; i++) {
            if (points[i].y < smallestY) {
                smallestY = points[i].y;
                koX=points[i].x;
            }
        }

        for (int i = 0; i < anzahlP; i++) {
            if (points[i].y > greatestY) {
                greatestY = points[i].y;
                KoX=points[i].x;
            }
        }
        GY=(greatestY-smallestY)/2;
        GX=(greatestX-smallestX)/2;
        SY=smallestY;
        XWidth=(koX-KoX)/2;
        System.out.println("\n" + smallestX + "," + smallestY + "\n" + greatestX + "," + greatestY);
        
        KreisFenster kf = new KreisFenster();
        kf.setVisible(true);
        System.out.println(GY+","+GX+",");

    }
public static int GY;
public static int GX;
public static int SY;
public static int XWidth;

}
