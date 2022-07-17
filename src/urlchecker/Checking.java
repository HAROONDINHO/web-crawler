package URLChecker;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Checking {

    public static int sitesNumber = 0, validSites = 0, invalidSites = 0;
    static ExecutorService executor;

    public Checking() {
    }

    public Checking(int i) {
        executor = Executors.newFixedThreadPool(i);
    }

    public void init() {
        sitesNumber = validSites = invalidSites = 0;
    }

    public void LinkChecking(String link, int currentDepth, int inputDepth) throws IOException, InterruptedException {
        ThreadsChecking t1;
        if (pageValidation(link)) {
            System.out.println("Valid: " + link);
            validSites++;
            if (currentDepth == inputDepth + 1) {
                return;
            }
            Document document = Jsoup.connect(link).get();
            Elements links = document.select("a[href]");
            URL url = new URL(link);
            sitesNumber = sitesNumber + links.size();
            for (int i = 0; i < links.size(); i++) {
                String x = links.get(i).attr("href");
                String protocol = url.getProtocol() + "://" + url.getHost();
                if (!x.startsWith("http")) {
                    x = protocol + x;
                }
                t1 = new ThreadsChecking(x, currentDepth + 1, inputDepth, links.get(i).text());
                executor.execute(t1);
            }
        } else {
            invalidSites++;
            System.err.println("Invalid: " + link);
        }
    }

    public boolean pageValidation(String link) {
        boolean valid;
        try {
            Document document = Jsoup.connect(link).get();
            valid = true;
        } catch (IOException ex) {
            valid = false;
        } catch (Exception e) {
            valid = false;
        }
        return valid;
    }

    public long TimeCalculation(String link, int inputDepth) throws IOException, InterruptedException {
        long start = System.currentTimeMillis();
        LinkChecking(link, 0, inputDepth);
        while (((ThreadPoolExecutor) Checking.executor).getActiveCount() > 0) {
            
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
   
}
