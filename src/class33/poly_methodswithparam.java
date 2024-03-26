package class33;

public class poly_methodswithparam {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        openWebsiteFromAnyBrowser(chrome, "google.com");
    }
    public static void openWebsiteFromAnyBrowser(Browser browser, String url){
        browser.openWebsite(url);
    }
}

class Browser{
    public void openWebsite(String url){
        System.out.println("Opening website in a generic Browser");
    }
}

class Chrome extends  Browser{
    @Override
    public void openWebsite(String url){
        System.out.println("Opening website in a Chrome Browser");

    }
    public void clearCache(){
        System.out.println("Clearing cache in Chrome Browser");
    }
}

class Safari extends  Browser{
    @Override
    public void openWebsite(String url){
        System.out.println("Opening website in a Safari Browser");

    }
    public void privateBrowsing(){
        System.out.println("Privately Browsing in Safari");
    }
}
