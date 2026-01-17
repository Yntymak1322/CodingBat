package string2;

public class String2 {
    static void main() {

    }public String doubleChar(String str) {
        StringBuilder result = new StringBuilder(); for (int i = 0; i < str.length(); i++) {char ch = str.charAt(i);
            result.append(ch); result.append(ch); } return result.toString();}
    public int countHi(String str) {int count = 0; for (int i = 0; i <= str.length() - 2; i++) {
        if (str.substring(i, i + 2).equals("hi")) {count++;}}return count;}
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            }
            if (sub.equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
    public boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    public boolean xyBalance(String str) {
        int lastY = str.lastIndexOf('y');
        int lastX = str.lastIndexOf('x');
        return lastX == -1 || lastY > lastX;
    }
    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        // Чередуем символы из a и b
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Добавляем оставшиеся символы
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }
    public String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();

        // Берём последние n символов строки
        String end = str.substring(str.length() - n);

        // Повторяем этот кусок n раз
        for (int i = 0; i < n; i++) {
            result.append(end);
        }
        return result.toString();
    }
    public String repeatFront(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }






}
