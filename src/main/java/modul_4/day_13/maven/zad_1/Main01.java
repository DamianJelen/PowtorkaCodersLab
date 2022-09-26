package modul_4.day_13.maven.zad_1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main01 {
    public static void main(String[] args) {
        Connection connect = Jsoup.connect("http://www.onet.pl/");

        try {
            Document document = connect.get();
            Elements links = document.select("span.CollapsedItem_itemTitle__lBo_9");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
