package modul_1.day_1.metody;

public class ZadFootballWin {
    public String footballWin (int liczGoliDrAA, int liczGoliDrBA, int liczGoliDrAB, int liczGoliDrBB) {
        if(liczGoliDrAA + liczGoliDrAB > liczGoliDrBA + liczGoliDrBB) {
            return "1";
        } else if(liczGoliDrAA + liczGoliDrAB < liczGoliDrBA + liczGoliDrBB) {
            return "2";
        } else {
            if(liczGoliDrAB > liczGoliDrBA) {
                return "1";
            } else if(liczGoliDrAB < liczGoliDrBA) {
                return "2";
            } else {
                return "X";
            }
        }
    }
}
