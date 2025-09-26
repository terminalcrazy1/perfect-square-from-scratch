import java.lang.Math

class Main() {
    float sqrt(float sqrtable) {
         return Math.sqrt(sqrtable);
    }
    int round(float rndable) {
         return Math.round(rndable);
    }
    string Main(float isperfect) {
         if (isperfect != round(isperfect)) {
              return “Not a perfect square”;
         }
         elif (sqrt(isperfect) != round(sqrt(isperfect))) {
             return “Not a perfect square”;
         }
         else {
             return “Perfect square”;
         }
    }
}
