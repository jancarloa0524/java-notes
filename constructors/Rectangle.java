// In this file, we can see the constructors made for Construcors.java. All 3 are different due to their parameters. 
public class Rectangle {
    double len, wid;

    Rectangle () {
        this.len = 1.0;
        this.wid = 1.0;
    }

    Rectangle (double length) {
        this.len = length;
        this.wid = length;
    }

    Rectangle (double length, double width) {
        this.len = length;
        this.wid = width;    
    }

    public String toString() {
        return("rectangle with length " + this.len + ", width " + this.wid);
    }
}