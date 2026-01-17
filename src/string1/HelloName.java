package string1;

public class HelloName {
    static void main() {
        HelloName obj = new HelloName();
        System.out.println(obj.makeAbba("<<>>", "Yay"));
    }
    public String helloName(String name) { return "Hello " + name + "!";}
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public String makeTags(String tag, String word) { return "<" + tag + ">" + word + "</" + tag + ">";}
    public String makeOutWord(String out, String word) { return out.substring(0, 2) + word + out.substring(2);}
    public String extraEnd(String str) { String end = str.substring(str.length() - 2); return end + end + end;}
    public String firstTwo(String str) { if (str.length() < 2) { return str; } return str.substring(0, 2); }
    public String firstHalf(String str) { int half = str.length() / 2; return str.substring(0, half); }
    public String withoutEnd(String str) { return str.substring(1, str.length() - 1); }
    public String comboString(String a, String b) { if (a.length() < b.length()) { return a + b + a;} else
    {return b + a + b;}}
    public String nonStart(String a, String b) {return a.substring(1) + b.substring(1);}
    public String left2(String str) {return str.substring(2) + str.substring(0, 2);}
    public String right2(String str)
    {return str.substring(str.length()-2) + str.substring(0, str.length() -2);}
    public String theEnd(String str, boolean front) {if (front)
    {return str.substring(0, 1);} else{return str.substring(str.length() - 1);}}
    public String withouEnd2(String str) {if (str.length()<= 1){return "";}return str.substring(1, str.length()-1);}
    public String middleTwo(String str) {int half = str.length() / 2;return str.substring(half - 1, half + 1);}
    public boolean endsLy(String str) {return str.endsWith("ly");}
    public String nTwice(String str, int n) {String first = str.substring(0, n);
        String last = str.substring(str.length()-n);return first  + last;}
    public String twoChar(String str, int index) {if (index < 0 || index > str.length() - 2)
    {return str.substring(0, 2);}return str.substring(index, index + 2);}
    public String middleThree(String str) {int mid = str.length() / 2;return str.substring(mid - 1, mid + 2);}
    public boolean hasBad(String str) {if (str.length() >= 3 && str.substring(0, 3).equals("bad"))
    {return true;}if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {return true;}return false;}
    public String atFirst(String str) {if (str.length()>= 2) {return str.substring(0, 2);}else if (str.length()== 1)
    {return str.charAt(0) + "@";} else {return "@@";}}
    public String lastChars(String a, String b) {char firstA;char lastB;
        if (a.length() > 0) {firstA = a.charAt(0);
        } else {firstA = '@';}if (b.length() > 0) {lastB = b.charAt(b.length() - 1);} else {lastB = '@';
        }return "" + firstA + lastB;}
    public String conCat(String a, String b) {if (a.length() == 0 || b.length() == 0) {return a + b;
        }if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);}return a + b;}
    public String lastTwo(String str) {if (str.length() < 2) {return str;}
        String start = str.substring(0, str.length() - 2); char secondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1); return start + last + secondLast;}
    public String seeColor(String str) {if (str.startsWith("red")) {return "red";}if (str.startsWith("blue")) {
        return "blue";} return "";}
    public boolean frontAgain(String str) {if (str.length() < 2) {return false;}
        String firstTwo = str.substring(0, 2); String lastTwo = str.substring(str.length() - 2);
        return firstTwo.equals(lastTwo);}
    public String minCat(String a, String b) {int minLen = Math.min(a.length(), b.length());
        String aCut = a.substring(a.length() - minLen);
        String bCut = b.substring(b.length() - minLen); return aCut + bCut;}
    public String extraFront(String str) {String front; if (str.length() >= 2) {front = str.substring(0, 2);
    } else { front = str; } return front + front + front; }
    public String without2(String str) {if (str.length() < 2) {return str; }String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2); if (firstTwo.equals(lastTwo)) {
            return str.substring(2); } return str;}
    public String deFront(String str) {String result = "";if (str.length() > 0 && str.charAt(0) == 'a') {result += 'a';}
        if (str.length() > 1 && str.charAt(1) == 'b') {result += 'b'; }if (str.length() > 2)
        {result += str.substring(2); }return result;}
    public String startWord(String str, String word) {int wLen = word.length();if (str.length() < wLen) {return "";}
        // сравниваем все символы, кроме первого
        if (str.substring(1, wLen).equals(word.substring(1))) {
            return str.substring(0, wLen);}return "";}
    public String withoutX(String str) {int start = 0; int end = str.length();
        if (str.length() > 0 && str.charAt(0) == 'x') {start = 1;}
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {end = str.length() - 1;}
        return str.substring(start, end);}
    public String withoutX2(String str) {if (str.length() == 0) {return str;}if (str.length() == 1)
    {return str.charAt(0) == 'x' ? "" : str;}String result = ""; if (str.charAt(0) != 'x') {result += str.charAt(0);}
        if (str.charAt(1) != 'x') {result += str.charAt(1);}if (str.length() > 2)
        {result += str.substring(2); }return result;}










}








