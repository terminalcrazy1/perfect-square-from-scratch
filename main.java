import java.lang.Math

public class Main() {
    // this is a internal sqrt function NOT fully functional
    private float sqrt(float sqrtable) {
        int iter = 1;
        int sqrd = iter*iter;
        while (sqrd < sqrtable && sqrd != sqrtable) {
            iter += 1;
            sqrd = iter*iter;
        }
        // this is a hack to make code work so my sqrt() can be simple
        if (sqrd != sqrtable) {
            // if the returned value contains a decimal, the check will fail
            return sqrd - 0.9;
        } else {
            // otherwise, the check succeeds
            return sqrd;
        }
    }
    private int floor(float rndable) {
        // this is a hack to rnd down by using javas float to int cast to truncate
        int rnded = (int) rndable
        return rnded;
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
