import java.lang.Math

public class Main() {
    // this is a internal sqrt function NOT fully functional
    private float sqrt(float sqrtable) {
        iter = 1;
        sqrd = iter*iter;
        while (sqrd < sqrtable && sqrd != sqrtable) {
            iter += 1;
            sqrd = iter*iter;
        }
        if (sqrd != sqrtable) {
            return sqrd - 0.9;
        } else {
            return sqrd;
        }
    }
    private int floor(float rndable) {
        return Math.floor(rndable);
    }
    public string Main(float isperfect) {
        if (isperfect != floor(isperfect)) {
             return “Not a perfect square”;
        }
        elif (sqrt(isperfect) != floor(sqrt(isperfect))) {
            return “Not a perfect square”;
        }
        else {
            return “Perfect square”;
        }
    }
}
