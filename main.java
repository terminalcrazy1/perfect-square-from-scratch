public class Main {
    // this is a internal sqrt function NOT fully functional
    private static float sqrt(float sqrtable) {
        int iter = 1;
        int sqrd = iter*iter;
        while (sqrd < sqrtable && sqrd != sqrtable) {
            iter += 1;
            sqrd = iter*iter;
        }
        // this is a hack to make code work so my sqrt() can be simple
        if (sqrd != sqrtable) {
            // if the returned value contains a decimal, the check will fail
            return sqrd - 0.9f;
        } else {
            // otherwise, the check succeeds
            return sqrd;
        }
    }
    private static int floor(float rndable) {
        // this is a hack to rnd down by using javas float to int cast to truncate
        int rnded = (int) rndable;
        return rnded;
    }
    public static void main(String[] args) {
        float isperfect = 9;
        if (isperfect != floor(isperfect)) {
            System.out.print("Not a perfect square");
            return;
        } else if (sqrt(isperfect) != floor(sqrt(isperfect))) {
            System.out.print("Not a perfect square");
            return;
        } else {
            System.out.print("Perfect square");
            return;
        }
    }
}
