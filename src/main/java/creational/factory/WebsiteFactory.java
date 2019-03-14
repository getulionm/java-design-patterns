package creational.factory;

public class WebsiteFactory {

    // Factory is going to call the "new" constructor for Blog,
    // which is then overridden from Website calling the constructor at
    // this.createWebsite()

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
