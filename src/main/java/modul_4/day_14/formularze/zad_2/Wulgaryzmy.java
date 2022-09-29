package modul_4.day_14.formularze.zad_2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wulgaryzmy {
    public static void main(String[] args) {
    }

    private static List<String> wulgaryzmy = Arrays.asList("chuj", "chuja", "chujek", "chuju", "chujem", "chujnia",
            "chujowy", "chujowa", "chujowe", "cipa", "cipę", "cipe", "cipą",
            "cipie", "dojebać","dojebac", "dojebie", "dojebał", "dojebal",
            "dojebała", "dojebala", "dojebałem", "dojebalem", "dojebałam",
            "dojebalam", "dojebię", "dojebie", "dopieprzać", "dopieprzac",
            "dopierdalać", "dopierdalac", "dopierdala", "dopierdalał",
            "dopierdalal", "dopierdalała", "dopierdalala", "dopierdoli",
            "dopierdolił", "dopierdolil", "dopierdolę", "dopierdole", "dopierdoli",
            "dopierdalający", "dopierdalajacy", "dopierdolić", "dopierdolic",
            "dupa", "dupie", "dupą", "dupcia", "dupeczka", "dupy", "dupe", "huj",
            "hujek", "hujnia", "huja", "huje", "hujem", "huju", "jebać", "jebac",
            "jebał", "jebal", "jebie", "jebią", "jebia", "jebak", "jebaka", "jebal",
            "jebał", "jebany", "jebane", "jebanka", "jebanko", "jebankiem",
            "jebanymi", "jebana", "jebanym", "jebanej", "jebaną", "jebana",
            "jebani", "jebanych", "jebanymi", "jebcie", "jebiący", "jebiacy",
            "jebiąca", "jebiaca", "jebiącego", "jebiacego", "jebiącej", "jebiacej",
            "jebia", "jebią", "jebie", "jebię", "jebliwy", "jebnąć", "jebnac",
            "jebnąc", "jebnać", "jebnął", "jebnal", "jebną", "jebna", "jebnęła",
            "jebnela", "jebnie", "jebnij", "jebut", "koorwa", "kórwa", "kurestwo",
            "kurew", "kurewski", "kurewska", "kurewskiej", "kurewską", "kurewska",
            "kurewsko", "kurewstwo", "kurwa", "kurwaa", "kurwami", "kurwą", "kurwe",
            "kurwę", "kurwie", "kurwiska", "kurwo", "kurwy", "kurwach", "kurwami",
            "kurewski", "kurwiarz", "kurwiący", "kurwica", "kurwić", "kurwic",
            "kurwidołek", "kurwik", "kurwiki", "kurwiszcze", "kurwiszon",
            "kurwiszona", "kurwiszonem", "kurwiszony", "kutas", "kutasa", "kutasie",
            "kutasem", "kutasy", "kutasów", "kutasow", "kutasach", "kutasami",
            "matkojebca", "matkojebcy", "matkojebcą", "matkojebca", "matkojebcami",
            "matkojebcach", "nabarłożyć", "najebać", "najebac", "najebał",
            "najebal", "najebała", "najebala", "najebane", "najebany", "najebaną",
            "najebana", "najebie", "najebią", "najebia", "naopierdalać",
            "naopierdalac", "naopierdalał", "naopierdalal", "naopierdalała",
            "naopierdalala", "naopierdalała", "napierdalać", "napierdalac",
            "napierdalający", "napierdalajacy", "napierdolić", "napierdolic",
            "nawpierdalać", "nawpierdalac", "nawpierdalał", "nawpierdalal",
            "nawpierdalała", "nawpierdalala", "obsrywać", "obsrywac", "obsrywający",
            "obsrywajacy", "odpieprzać", "odpieprzac", "odpieprzy", "odpieprzył",
            "odpieprzyl", "odpieprzyła", "odpieprzyla", "odpierdalać",
            "odpierdalac", "odpierdol", "odpierdolił", "odpierdolil",
            "odpierdoliła", "odpierdolila", "odpierdoli", "odpierdalający",
            "odpierdalajacy", "odpierdalająca", "odpierdalajaca", "odpierdolić",
            "odpierdolic", "odpierdoli", "odpierdolił", "opieprzający",
            "opierdalać", "opierdalac", "opierdala", "opierdalający",
            "opierdalajacy", "opierdol", "opierdolić", "opierdolic", "opierdoli",
            "opierdolą", "opierdola", "piczka", "pieprznięty", "pieprzniety",
            "pieprzony", "pierdel", "pierdlu", "pierdolą", "pierdola", "pierdolący",
            "pierdolacy", "pierdoląca", "pierdolaca", "pierdol", "pierdole",
            "pierdolenie", "pierdoleniem", "pierdoleniu", "pierdolę", "pierdolec",
            "pierdola", "pierdolą", "pierdolić", "pierdolicie", "pierdolic",
            "pierdolił", "pierdolil", "pierdoliła", "pierdolila", "pierdoli",
            "pierdolnięty", "pierdolniety", "pierdolisz", "pierdolnąć",
            "pierdolnac", "pierdolnął", "pierdolnal", "pierdolnęła", "pierdolnela",
            "pierdolnie", "pierdolnięty", "pierdolnij", "pierdolnik", "pierdolona",
            "pierdolone", "pierdolony", "pierdołki", "pierdzący", "pierdzieć",
            "pierdziec", "pizda", "pizdą", "pizde", "pizdę", "piździe", "pizdzie",
            "pizdnąć", "pizdnac", "pizdu", "podpierdalać", "podpierdalac",
            "podpierdala", "podpierdalający", "podpierdalajacy", "podpierdolić",
            "podpierdolic", "podpierdoli", "pojeb", "pojeba", "pojebami",
            "pojebani", "pojebanego", "pojebanemu", "pojebani", "pojebany",
            "pojebanych", "pojebanym", "pojebanymi", "pojebem", "pojebać",
            "pojebac", "pojebalo", "popierdala", "popierdalac", "popierdalać",
            "popierdolić", "popierdolic", "popierdoli", "popierdolonego",
            "popierdolonemu", "popierdolonym", "popierdolone", "popierdoleni",
            "popierdolony", "porozpierdalać", "porozpierdala", "porozpierdalac",
            "poruchac", "poruchać", "przejebać", "przejebane", "przejebac",
            "przyjebali", "przepierdalać", "przepierdalac", "przepierdala",
            "przepierdalający", "przepierdalajacy", "przepierdalająca",
            "przepierdalajaca", "przepierdolić", "przepierdolic", "przyjebać",
            "przyjebac", "przyjebie", "przyjebała", "przyjebala", "przyjebał",
            "przyjebal", "przypieprzać", "przypieprzac", "przypieprzający",
            "przypieprzajacy", "przypieprzająca", "przypieprzajaca",
            "przypierdalać", "przypierdalac", "przypierdala", "przypierdoli",
            "przypierdalający", "przypierdalajacy", "przypierdolić",
            "przypierdolic", "qrwa", "rozjebać", "rozjebac", "rozjebie",
            "rozjebała", "rozjebią", "rozpierdalać", "rozpierdalac", "rozpierdala",
            "rozpierdolić", "rozpierdolic", "rozpierdole", "rozpierdoli",
            "rozpierducha", "skurwić", "skurwiel", "skurwiela", "skurwielem",
            "skurwielu", "skurwysyn", "skurwysynów", "skurwysynow", "skurwysyna",
            "skurwysynem", "skurwysynu", "skurwysyny", "skurwysyński",
            "skurwysynski", "skurwysyństwo", "skurwysynstwo", "spieprzać",
            "spieprzac", "spieprza", "spieprzaj", "spieprzajcie", "spieprzają",
            "spieprzaja", "spieprzający", "spieprzajacy", "spieprzająca",
            "spieprzajaca", "spierdalać", "spierdalac", "spierdala", "spierdalał",
            "spierdalała", "spierdalal", "spierdalalcie", "spierdalala",
            "spierdalający", "spierdalajacy", "spierdolić", "spierdolic",
            "spierdoli", "spierdoliła", "spierdoliło", "spierdolą", "spierdola",
            "srać", "srac", "srający", "srajacy", "srając", "srajac", "sraj",
            "sukinsyn", "sukinsyny", "sukinsynom", "sukinsynowi", "sukinsynów",
            "sukinsynow", "śmierdziel", "udupić", "ujebać", "ujebac", "ujebał",
            "ujebal", "ujebana", "ujebany", "ujebie", "ujebała", "ujebala",
            "upierdalać", "upierdalac", "upierdala", "upierdoli", "upierdolić",
            "upierdolic", "upierdoli", "upierdolą", "upierdola", "upierdoleni",
            "wjebać", "wjebac", "wjebie", "wjebią", "wjebia", "wjebiemy",
            "wjebiecie", "wkurwiać", "wkurwiac", "wkurwi", "wkurwia", "wkurwiał",
            "wkurwial", "wkurwiający", "wkurwiajacy", "wkurwiająca", "wkurwiajaca",
            "wkurwić", "wkurwic", "wkurwi", "wkurwiacie", "wkurwiają", "wkurwiali",
            "wkurwią", "wkurwia", "wkurwimy", "wkurwicie", "wkurwiacie", "wkurwić",
            "wkurwic", "wkurwia", "wpierdalać", "wpierdalac", "wpierdalający",
            "wpierdalajacy", "wpierdol", "wpierdolić", "wpierdolic", "wpizdu",
            "wyjebać", "wyjebac", "wyjebali", "wyjebał", "wyjebac", "wyjebała",
            "wyjebały", "wyjebie", "wyjebią", "wyjebia", "wyjebiesz", "wyjebie",
            "wyjebiecie", "wyjebiemy", "wypieprzać", "wypieprzac", "wypieprza",
            "wypieprzał", "wypieprzal", "wypieprzała", "wypieprzala", "wypieprzy",
            "wypieprzyła", "wypieprzyla", "wypieprzył", "wypieprzyl", "wypierdal",
            "wypierdalać", "wypierdalac", "wypierdala", "wypierdalaj",
            "wypierdalał", "wypierdalal", "wypierdalała", "wypierdalala",
            "wypierdalać", "wypierdolić", "wypierdolic", "wypierdoli",
            "wypierdolimy", "wypierdolicie", "wypierdolą", "wypierdola",
            "wypierdolili", "wypierdolił", "wypierdolil", "wypierdoliła",
            "wypierdolila", "zajebać", "zajebac", "zajebie", "zajebią", "zajebia",
            "zajebiał", "zajebial", "zajebała", "zajebiala", "zajebali", "zajebana",
            "zajebani", "zajebane", "zajebany", "zajebanych", "zajebanym",
            "zajebanymi", "zajebiste", "zajebisty", "zajebistych", "zajebista",
            "zajebistym", "zajebistymi", "zajebiście", "zajebiscie", "zapieprzyć",
            "zapieprzyc", "zapieprzy", "zapieprzył", "zapieprzyl", "zapieprzyła",
            "zapieprzyla", "zapieprzą", "zapieprza", "zapieprzy", "zapieprzymy",
            "zapieprzycie", "zapieprzysz", "zapierdala", "zapierdalać",
            "zapierdalac", "zapierdalaja", "zapierdalał", "zapierdalaj",
            "zapierdalajcie", "zapierdalała", "zapierdalala", "zapierdalali",
            "zapierdalający", "zapierdalajacy", "zapierdolić", "zapierdolic",
            "zapierdoli", "zapierdolił", "zapierdolil", "zapierdoliła",
            "zapierdolila", "zapierdolą", "zapierdola", "zapierniczać",
            "zapierniczający", "zasrać", "zasranym", "zasrywać", "zasrywający",
            "zesrywać", "zesrywający", "zjebać", "zjebac", "zjebał", "zjebal",
            "zjebała", "zjebala", "zjebana", "zjebią", "zjebali", "zjeby");

    protected static String clearVulgarismFromText(String word) {
        String result = "";
        Pattern pattern = Pattern.compile("^([a-zA-Z]+)$");
        Matcher matcher = pattern.matcher(word);
        if(!matcher.matches()) {
            char[] charsBeforeAndAfterWord = new char[2];
            char[] charArr = word.toCharArray();
            if(!Character.isLetter(charArr[0])) {
                charsBeforeAndAfterWord[1] = charArr[0];
                charArr = Arrays.copyOfRange(charArr, 1, charArr.length);
            }
            if(!Character.isLetter(charArr[charArr.length - 1])) {
                charsBeforeAndAfterWord[1] = charArr[charArr.length - 1];
                charArr = Arrays.copyOfRange(charArr, 0, charArr.length - 1);
            }
            result = String.valueOf(charArr);
            matcher = pattern.matcher(result);
            // here we should check the word is it vulgarism
            result = isItVulgarism(result);
            result = charsBeforeAndAfterWord[0] + result + charsBeforeAndAfterWord[1];
            return matcher.matches() ? result : word;
        }
        word = isItVulgarism(word);
        return word;
    }

    private static String isItVulgarism(String word) {
        for(String vulgarism : wulgaryzmy) {
            if(word.toLowerCase().equals(vulgarism.toLowerCase())) {
                word = changeVulgarismOnStars(word);
                return word;
            }
        }

        return word;
    }

    private static String changeVulgarismOnStars(String word) {
        String result = "*";
        for (int i = 1; i < word.length(); i++) {
            result += "*";
        }
        return result;
    }
}
