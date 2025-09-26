
class Main() {
    string Main(float sqrtable) {
         if (sqrtable != Math.round(sqrtable)) {
              return “Not a perfect square”;
         }
         elif (Math.sqrt(sqrtable) != Math.round(Math.sqrt(sqrtable))) {
             return “Not a perfect square”;
         }
         else {
             return “Perfect square”;
         }
    }
}
